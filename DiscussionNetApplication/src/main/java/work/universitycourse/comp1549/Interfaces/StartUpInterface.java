/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work.universitycourse.comp1549.Interfaces;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Adnan Turan
 * @author Daniel Browne
 * @author Gabriel Netz
 * @author William Phillips
 * 
 */
public class StartUpInterface extends javax.swing.JFrame {

    /**
     * Creates new form StartUpInterface
     */
    public StartUpInterface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon img = new ImageIcon(getClass().getResource("/icon.png"));
        mainPanel = new javax.swing.JPanel();
        existingNetworkLabel = new javax.swing.JLabel();
        createNetworkLabel = new javax.swing.JLabel();
        titleLabel2 = new javax.swing.JLabel();
        titleLabel3 = new javax.swing.JLabel();
        titleLabel1 = new javax.swing.JLabel();
        mainImage = new javax.swing.JLabel();
        configureServerButton = new javax.swing.JButton();
        configureClientButton = new javax.swing.JButton();
        footerTextLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DiscussionNet V1.0 ");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(img.getImage());
        setMinimumSize(new java.awt.Dimension(854, 519));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setMaximumSize(new java.awt.Dimension(847, 519));
        mainPanel.setMinimumSize(new java.awt.Dimension(847, 519));
        mainPanel.setPreferredSize(new java.awt.Dimension(847, 519));

        existingNetworkLabel.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        existingNetworkLabel.setForeground(new java.awt.Color(47, 46, 65));
        existingNetworkLabel.setText("I want to connect to an existing network...");

        createNetworkLabel.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        createNetworkLabel.setForeground(new java.awt.Color(47, 46, 65));
        createNetworkLabel.setText("I want to create a new network...");

        titleLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        titleLabel2.setForeground(new java.awt.Color(0, 36, 109));
        titleLabel2.setText("DiscussionNet");

        titleLabel3.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        titleLabel3.setForeground(new java.awt.Color(47, 46, 65));
        titleLabel3.setText("Initial Setup");

        titleLabel1.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        titleLabel1.setForeground(new java.awt.Color(47, 46, 65));
        titleLabel1.setText("Welcome To");

        mainImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/welcome_image.png"))); // NOI18N

        configureServerButton.setBackground(new java.awt.Color(255, 255, 255));
        configureServerButton.setFont(new java.awt.Font("Montserrat", 0, 15)); // NOI18N
        configureServerButton.setForeground(new java.awt.Color(255, 255, 255));
        configureServerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medium_button_background.png"))); // NOI18N
        configureServerButton.setText("Configure Server");
        configureServerButton.setBorder(null);
        configureServerButton.setBorderPainted(false);
        configureServerButton.setContentAreaFilled(false);
        configureServerButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        configureClientButton.setBackground(new java.awt.Color(255, 255, 255));
        configureClientButton.setFont(new java.awt.Font("Montserrat", 0, 15)); // NOI18N
        configureClientButton.setForeground(new java.awt.Color(255, 255, 255));
        configureClientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medium_button_background.png"))); // NOI18N
        configureClientButton.setText("Configure Client");
        configureClientButton.setBorder(null);
        configureClientButton.setBorderPainted(false);
        configureClientButton.setContentAreaFilled(false);
        configureClientButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        footerTextLabel.setFont(new java.awt.Font("Montserrat", 0, 9)); // NOI18N
        footerTextLabel.setForeground(new java.awt.Color(47, 46, 65));
        footerTextLabel.setText("DiscussionNet V1.0 - © Code Squad 2021 - Software Licenses");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addGap(247, 247, 247)
                            .addComponent(mainImage))
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addGap(139, 139, 139)
                            .addComponent(titleLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(titleLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(titleLabel3))
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addComponent(configureClientButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(configureServerButton)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(existingNetworkLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createNetworkLabel)
                        .addGap(81, 81, 81)))
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(footerTextLabel)
                .addGap(291, 291, 291))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(mainImage)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel1)
                    .addComponent(titleLabel2)
                    .addComponent(titleLabel3))
                .addGap(51, 51, 51)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(existingNetworkLabel)
                    .addComponent(createNetworkLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(configureClientButton)
                    .addComponent(configureServerButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(footerTextLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }// GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartUpInterface.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartUpInterface.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartUpInterface.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartUpInterface.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartUpInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton configureClientButton;
    private javax.swing.JButton configureServerButton;
    private javax.swing.JLabel createNetworkLabel;
    private javax.swing.JLabel existingNetworkLabel;
    private javax.swing.JLabel footerTextLabel;
    private javax.swing.JLabel mainImage;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel titleLabel1;
    private javax.swing.JLabel titleLabel2;
    private javax.swing.JLabel titleLabel3;
    // End of variables declaration//GEN-END:variables
}
