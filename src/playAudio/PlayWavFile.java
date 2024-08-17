/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package playAudio;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Vish
 */
public class PlayWavFile {

    public static void main(String[] args) {

        String filename = "Siren.wav";

        PlayWavFile p = new PlayWavFile();
        p.startSiren(filename);
    }

    public void startSiren(String filename) {
        int EXTERNAL_BUFFER_SIZE = 524288;

        File soundFile = new File(filename);

        if (!soundFile.exists()) {
            System.err.println("Wave file not found: " + filename);
            return;
        }

        AudioInputStream audioInputStream = null;
        try {
            audioInputStream = AudioSystem.getAudioInputStream(soundFile);
        } catch (UnsupportedAudioFileException | IOException e) {
            return;
        }

        AudioFormat format = audioInputStream.getFormat();

        SourceDataLine auline = null;

//Describe a desired line  
        DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);

        try {
            auline = (SourceDataLine) AudioSystem.getLine(info);

            //Opens the line with the specified format,  
            //causing the line to acquire any required  
            //system resources and become operational.  
            auline.open(format);
        }
        catch (Exception e) {
            return;
        }
        //Allows a line to engage in data I/O  
        auline.start();

        int nBytesRead = 0;
        byte[] abData = new byte[EXTERNAL_BUFFER_SIZE];

        try {
            while (nBytesRead != -1) {
                nBytesRead = audioInputStream.read(abData, 0, abData.length);
                if (nBytesRead >= 0) {
                    //Writes audio data to the mixer via this source data line  
                    //NOTE : A mixer is an audio device with one or more lines  
                    //auline.write(abData, 0, nBytesRead);
                    System.out.println("n :" + nBytesRead);
                    auline.write(abData, 0, 80000);
                }
            }
        } catch (Exception e) {
        } finally {
            auline.drain();
            auline.close();
        }
    }
}