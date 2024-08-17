package pccp;

import playAudio.PlayMP3File;
import playAudio.PlayWavFile;

import java.util.Random;
import javax.swing.JOptionPane;

public final class PCCPLogin extends javax.swing.JFrame {

    int x, y;

    public PCCPLogin() {
        initComponents();
        setLocationRelativeTo(null);

        String path = Details.imageName[Details.counter];
        // Replace backslashes with forward slashes
        path = path.replace("\\", "/");
        System.out.println("P : " + path);
        int width = pnlImage.getWidth();
        int height = pnlImage.getHeight();

        System.out.println("W : " + width + " H : " + height);

        loadImagePanel(path, width, height);
    }

    public void loadImagePanel(String path, int w, int h) {
        try {
            pnlImage.removeAll();
            pnlImage.add(new ImageSeting(path, w, h));
            pnlImage.validate();
            pnlImage.repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblClicked = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        pnlImage = new javax.swing.JPanel();
        lblMouse = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Persuasive Cued Click-Points", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Bright", 1, 18), new java.awt.Color(255, 0, 255))); // NOI18N

        lblClicked.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        lblClicked.setForeground(java.awt.Color.blue);
        lblClicked.setText("Click on Image");

        btnOK.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        pnlImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlImageMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlImageMouseExited(evt);
            }
        });
        pnlImage.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlImageMouseMoved(evt);
            }
        });
        pnlImage.setLayout(new java.awt.BorderLayout());

        lblMouse.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMouse.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(pnlImage, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(105, 105, 105)
                                                .addComponent(lblClicked))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(130, 130, 130)
                                                .addComponent(lblMouse)))
                                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMouse)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnlImage, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblClicked)
                                .addGap(7, 7, 7))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlImageMouseClicked
        x = evt.getX();
        y = evt.getY();

        lblClicked.setText("x:" + x + " y:" + y);

        int c = Details.counter;
        if (x >= Details.positionx1[c] && x <= Details.positionx2[c] && y >= Details.positiony1[c] && y <= Details.positiony2[c]) {

            String audio = Details.audioName[Details.counter];

            Details.validate[c] = true;
            if (audio.endsWith(".mp3")) {
                PlayMP3File p = new PlayMP3File();
                p.startMP3(audio);
            } else if (audio.endsWith(".wav")) {
                PlayWavFile p = new PlayWavFile();
                p.startSiren(audio);
            }
        } else {
            Details.validate[Details.counter] = false;

            int gx = x / 8;
            int gy = y / 8;

            int num = gx + gy;
            int index = num % 10;

            System.out.println("gx : " + gx + "  gy : " + gy + "  Index : " + index);

            String play = Details.invalidAudio[index];

            if (play.endsWith(".mp3")) {
                PlayMP3File p = new PlayMP3File();
                p.startMP3(play);
            } else if (play.endsWith(".wav")) {
                PlayWavFile p = new PlayWavFile();
                p.startSiren(play);
            }
        }
    }//GEN-LAST:event_pnlImageMouseClicked

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        if (lblClicked.getText().equals("Click on Image")) {
            JOptionPane.showMessageDialog(this, "Please First Clicked on Image then Click OK");
        } else {
            Details.storex[Details.counter] = x;
            Details.storey[Details.counter] = y;
            Details.counter++;
            if (Details.counter < 3) {
                shuffleArray(Details.invalidAudio);
                this.dispose();
                new PCCPLogin().setVisible(true);
            } else {
                this.dispose();
                new Login().setVisible(true);
            }
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void pnlImageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlImageMouseExited
        lblMouse.setText("x : 0  y : 0");
    }//GEN-LAST:event_pnlImageMouseExited

    private void pnlImageMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlImageMouseMoved
        lblMouse.setText("x : " + evt.getX() + " y : " + evt.getY());
    }//GEN-LAST:event_pnlImageMouseMoved

    public void shuffleArray(String[] ar) {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            String a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }

    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PCCPLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblClicked;
    private javax.swing.JLabel lblMouse;
    private javax.swing.JPanel pnlImage;
    // End of variables declaration//GEN-END:variables
}
