/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package playAudio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Vish
 */
public class PlayMP3File {

    public static void main(String[] args) 
    {
        PlayMP3File p = new PlayMP3File();
        String filename = ".\\audio\\test.mp3";
        p.startMP3(filename);
    }

    public void startMP3(String filename) {
        try {
            FileInputStream fis = new FileInputStream(filename);
            Player playMP3 = new Player(fis);
            playMP3.play(100);
        }
        catch (FileNotFoundException | JavaLayerException e) {
        }
    }
}