package pccp;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageSeting extends javax.swing.JPanel {

    BufferedImage image;
    int width, height;
    public static int x1, y1, x2, y2;

    public ImageSeting(String path, int w, int h, int x, int y) {
        try {
            width = w;
            height = h;
            x1 = x;
            y1 = y;
            x2 = x + 20;
            y2 = y + 20;
            image = ImageIO.read(new File(path));
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
    }

    public ImageSeting(String path, int w, int h) {
        try {
            width = w;
            height = h;
            image = ImageIO.read(new File(path));
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, width, height, null);
        g.setColor(Color.BLACK);
        if (x1 > 0) {
            g.drawRect(x1, y1, 8, 8);
        }
    }

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
}