/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pccp;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import playAudio.PlayMP3File;
import playAudio.PlayWavFile;

/**
 *
 * @author Vish
 */
public final class PCCPRegistration extends javax.swing.JFrame {

    String path;
    String audioPath = "";

    /**
     * Creates new form PCCPRegistration
     */
    public PCCPRegistration(String path) {
        initComponents();
        setLocationRelativeTo(null);

        this.path = path;
        int width = pnlImage.getWidth();
        int height = pnlImage.getHeight();

        int x = 2 + (int) ((width - 10) * Math.random());
        int y = 2 + (int) ((height - 10) * Math.random());

        loadImagePanel(width, height, x, y);
    }

    public void loadImagePanel(int w, int h, int x, int y) {
        pnlImage.removeAll();
        pnlImage.add(new ImageSeting(path, w, h, x, y));
        pnlImage.validate();
        pnlImage.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlImage = new javax.swing.JPanel();
        lblClicked = new javax.swing.JLabel();
        btnShuffel = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnBrowse = new javax.swing.JButton();
        lblAudioLocation = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Setting Panel of Persuasive Cued Click-Points", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Bright", 1, 18), new java.awt.Color(255, 0, 255))); // NOI18N

        pnlImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlImageMouseClicked(evt);
            }
        });
        pnlImage.setLayout(new java.awt.BorderLayout());

        lblClicked.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        lblClicked.setForeground(java.awt.Color.blue);
        lblClicked.setText("Click on Image");

        btnShuffel.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        btnShuffel.setText("Shuffle");
        btnShuffel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShuffelActionPerformed(evt);
            }
        });

        btnOK.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel3.setText("Select Audio File");

        btnBrowse.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        lblAudioLocation.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        lblAudioLocation.setText("Select Audio File Location Display Here");

        jButton1.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jButton1.setText("Play");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(lblClicked))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBrowse)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(pnlImage, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btnShuffel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnOK, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAudioLocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnShuffel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(pnlImage, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClicked)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBrowse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAudioLocation)
                .addGap(26, 26, 26))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlImageMouseClicked
        // TODO add your handling code here:
        int x = evt.getX(), y = evt.getY();
        
        if (x >= ImageSeting.x1 && x <= ImageSeting.x2 && y >= ImageSeting.y1 && y <= ImageSeting.y2) {
            lblClicked.setText("x:" + x + " y:" + y);
        } else {
            lblClicked.setText("Click only inside Zone");
            audioPath = "";
            lblAudioLocation.setText("Select Audio File Location Display Here");
        }
    }//GEN-LAST:event_pnlImageMouseClicked

    private void btnShuffelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShuffelActionPerformed
        // TODO add your handling code here:
        lblClicked.setText("Click on Image");
        lblAudioLocation.setText("Select Audio File Location Display Here");
        audioPath = "";
        int width = pnlImage.getWidth();
        int height = pnlImage.getHeight();

        int x = 2 + (int) ((width - 10) * Math.random());
        int y = 2 + (int) ((height - 10) * Math.random());

        loadImagePanel(width, height, x, y);
    }//GEN-LAST:event_btnShuffelActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        // TODO add your handling code here:
        String clicked = lblClicked.getText();
        if (clicked.equals("Click only inside Zone") || clicked.equals("Click on Image")) {
            JOptionPane.showMessageDialog(this, "First set Position then select Audio File");
        } else {
            JFileChooser fileChooser = new JFileChooser(Details.currentPath);
            fileChooser.setDialogTitle(new String("Select Audio File"));

            int result = fileChooser.showOpenDialog(this);

            if (result == JFileChooser.APPROVE_OPTION) {
                File f = fileChooser.getSelectedFile();
                Details.currentPath = f.getPath();

                String textPath = f.getAbsolutePath();
                String name = f.getName();
                textPath = textPath.trim();
                if (textPath.endsWith(".mp3") || textPath.endsWith(".wav")) {
                    lblAudioLocation.setText(name);
                    audioPath = textPath;
                } else {
                    JOptionPane.showMessageDialog(this, "SELECT (mp3, wav) FILE!!!!");
                }
            }
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new SettingPassword().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:
        String clicked = lblClicked.getText();
        if (clicked.equals("Click only inside Zone") || clicked.equals("Click on Image")) {
            JOptionPane.showMessageDialog(this, "First set Position on Image");
        } else if (audioPath.equals("")) {
            JOptionPane.showMessageDialog(this, "First Select Audio File");
        } else {
            System.out.println("x1: " + ImageSeting.x1 + " y1: " + ImageSeting.y1);
            System.out.println("x2: " + ImageSeting.x2 + " y2: " + ImageSeting.y2);
            System.out.println("Image : " + path);
            System.out.println("Audio : " + audioPath);

            Details.imageName[Details.counter] = path;
            Details.audioName[Details.counter] = audioPath;
            Details.positionx1[Details.counter] = ImageSeting.x1;
            Details.positiony1[Details.counter] = ImageSeting.y1;
            Details.positionx2[Details.counter] = ImageSeting.x2;
            Details.positiony2[Details.counter] = ImageSeting.y2;

            Details.counter++;
            this.dispose();
            new SettingPassword().setVisible(true);
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (audioPath.endsWith(".mp3")) {
            PlayMP3File p = new PlayMP3File();
            p.startMP3(audioPath);
        } else if (audioPath.endsWith(".wav")) {
            PlayWavFile p = new PlayWavFile();
            p.startSiren(audioPath);
        } else {
            JOptionPane.showMessageDialog(this, "First Select Audio File then Play");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new PCCPRegistration("").setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnShuffel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAudioLocation;
    private javax.swing.JLabel lblClicked;
    private javax.swing.JPanel pnlImage;
    // End of variables declaration//GEN-END:variables
}