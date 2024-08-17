package pccp;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.GroupLayout.Alignment;

public class StartPage extends JFrame {
    private JPanel jPanel1;
    private JLabel lblHeading;
    private JLabel lblLogin;
    private JLabel lblRegister;

    public StartPage() {
        try {
            this.initComponents();
        } catch (Exception var2) {
            // Handle exceptions if necessary
        }

        this.setLocationRelativeTo(null);
        this.setTitle("Persuasive Cued Click-Points");
        String heading = "<html><center>Persuasive Cued Click Point: Design, Implementation, and Evaluation of a Knowledge-Based Authentication Mechanism</center></html>";
        this.lblHeading.setText(heading);
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.lblHeading = new JLabel();
        this.lblLogin = new JLabel();
        this.lblRegister = new JLabel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.lblHeading.setFont(new Font("Lucida Bright", Font.BOLD, 22));
        this.lblHeading.setForeground(new Color(64, 64, 64));
        this.lblHeading.setText("jLabel1");

        this.lblLogin.setFont(new Font("Lucida Bright", Font.BOLD, 18));
        this.lblLogin.setForeground(Color.BLUE);
        this.lblLogin.setText("Click Here to Login on System");
        this.lblLogin.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }

            public void mouseEntered(MouseEvent evt) {
                lblLoginMouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
                lblLoginMouseExited(evt);
            }
        });

        this.lblRegister.setFont(new Font("Lucida Bright", Font.BOLD, 18));
        this.lblRegister.setForeground(Color.BLUE);
        this.lblRegister.setText("Click Here to Register on System");
        this.lblRegister.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                lblRegisterMouseClicked(evt);
            }

            public void mouseEntered(MouseEvent evt) {
                lblRegisterMouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
                lblRegisterMouseExited(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(this.lblHeading, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(193, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
                                        .addComponent(this.lblLogin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(this.lblRegister, GroupLayout.PREFERRED_SIZE, 405, GroupLayout.PREFERRED_SIZE))
                                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(this.lblHeading, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(this.lblLogin)
                                .addGap(35, 35, 35)
                                .addComponent(this.lblRegister)
                                .addContainerGap(119, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(Alignment.LEADING)
                        .addComponent(this.jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(Alignment.LEADING)
                        .addComponent(this.jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        this.pack();
    }

    private void lblLoginMouseEntered(MouseEvent evt) {
        this.lblLogin.setFont(new Font("Lucida Bright", Font.BOLD, 20));
        this.lblLogin.setForeground(Color.MAGENTA);
        this.lblLogin.setText("<html><u>Click Here to Login on System</u></html>");
    }

    private void lblLoginMouseExited(MouseEvent evt) {
        this.lblLogin.setFont(new Font("Lucida Bright", Font.BOLD, 18));
        this.lblLogin.setForeground(Color.BLUE);
        this.lblLogin.setText("Click Here to Login on System");
    }

    private void lblRegisterMouseEntered(MouseEvent evt) {
        this.lblRegister.setFont(new Font("Lucida Bright", Font.BOLD, 20));
        this.lblRegister.setForeground(Color.MAGENTA);
        this.lblRegister.setText("<html><u>Click Here to Register on System</u></html>");
    }

    private void lblRegisterMouseExited(MouseEvent evt) {
        this.lblRegister.setFont(new Font("Lucida Bright", Font.BOLD, 18));
        this.lblRegister.setForeground(Color.BLUE);
        this.lblRegister.setText("Click Here to Register on System");
    }

    private void lblLoginMouseClicked(MouseEvent evt) {
        this.dispose();
        new Login().setVisible(true); // Open the login form
    }

    private void lblRegisterMouseClicked(MouseEvent evt) {
        this.dispose();
        new Registration().setVisible(true); // Open the registration form
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
                    new StartPage().setVisible(true);
                } catch (Exception var2) {
                    Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, var2);
                }
            }
        });
    }
}
