/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pccp;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author Hemant
 */
public class ImageSeting extends javax.swing.JPanel {

    BufferedImage image;
    int width, height;
    public static int x1, y1, x2, y2;

    /**
     * Creates new form SimulationTopologyPanel
     */
    public ImageSeting(String path, int w, int h, int x, int y) {
        try {
            width = w;
            height = h;
            x1 = x;
            y1 = y;
            x2 = x + 8;
            y2 = y + 8;
            image = ImageIO.read(new File(path));
        } catch (Exception e) {
        }
        initComponents();
    }

    public ImageSeting(String path, int w, int h) {
        try {
            width = w;
            height = h;
            image = ImageIO.read(new File(path));
        }
        catch (Exception e) {
        }
        initComponents();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image, 0, 0, width, height, null);

        //Color myColor = Color.decode("#000000");
        g.setColor(Color.BLACK);

        if (x1 > 0) {
            g.drawRect(x1, y1, 8, 8);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}