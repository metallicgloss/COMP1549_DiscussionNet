package work.universitycourse.comp1549.Interfaces.Client;

import static javax.swing.JOptionPane.showMessageDialog;
import work.universitycourse.comp1549.Components.RoundJTextField;
import work.universitycourse.comp1549.Interfaces.Licenses;
import work.universitycourse.comp1549.Modules.ClientManager;
import work.universitycourse.comp1549.Modules.InterfaceManager;

/**
 *
 * @author Adnan Turan
 * @author Daniel Browne
 * @author Gabriel Netz
 * @author William Phillips
 * 
 */
public class ClientIdentitySetup extends javax.swing.JFrame {
    // TODO: Compress into object - temp quick passing of variables.
    public static String serverIPAddress;
    public static String serverPort;
    
    /**
     * Creates new form identitySetup
     */
    public ClientIdentitySetup(String serverIPAddress, String serverPort) {
        super();
        this.serverIPAddress = serverIPAddress;
        this.serverPort = serverPort;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientIdentitySetupPanel = new javax.swing.JPanel();
        mainImage = new javax.swing.JLabel();
        discussionNetIdentitySetupLabel1 = new javax.swing.JLabel();
        discussionNetIdentitySetupLabel2 = new javax.swing.JLabel();
        assignedIDNumberLabel = new javax.swing.JLabel();
        assignedIDNumberTextfield = new RoundJTextField();
        clientIPAddressLabel = new javax.swing.JLabel();
        clientIPAddressTextbox = new RoundJTextField();
        clientPortLabel = new javax.swing.JLabel();
        clientPortTextbox = new RoundJTextField();
        authenticateButton = new javax.swing.JButton();
        footerTextLabel = new javax.swing.JLabel();
        footerLicensesTextLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("work/universitycourse/comp1549/Interfaces/Client/Bundle"); // NOI18N
        setTitle(bundle.getString("ClientIdentitySetup.title")); // NOI18N
        setIconImage(InterfaceManager.programIcon.getImage());
        setMinimumSize(new java.awt.Dimension(854, 519));
        setName("DiscussionNet"); // NOI18N
        setResizable(false);

        clientIdentitySetupPanel.setBackground(new java.awt.Color(255, 255, 255));
        clientIdentitySetupPanel.setMaximumSize(new java.awt.Dimension(847, 519));
        clientIdentitySetupPanel.setMinimumSize(new java.awt.Dimension(847, 519));
        clientIdentitySetupPanel.setName(""); // NOI18N
        clientIdentitySetupPanel.setPreferredSize(new java.awt.Dimension(847, 519));
        InterfaceManager.detectExitRequest(clientIdentitySetupPanel);

        mainImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphics/identity.png"))); // NOI18N
        mainImage.setName("mainImage"); // NOI18N

        discussionNetIdentitySetupLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        discussionNetIdentitySetupLabel1.setForeground(new java.awt.Color(0, 36, 109));
        discussionNetIdentitySetupLabel1.setText(bundle.getString("ClientIdentitySetup.discussionNetIdentitySetupLabel1.text_1")); // NOI18N
        discussionNetIdentitySetupLabel1.setName("discussionNetIdentitySetupLabel1"); // NOI18N

        discussionNetIdentitySetupLabel2.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        discussionNetIdentitySetupLabel2.setText(bundle.getString("ClientIdentitySetup.discussionNetIdentitySetupLabel2.text_1")); // NOI18N
        discussionNetIdentitySetupLabel2.setName("discussionNetIdentitySetupLabel2"); // NOI18N

        assignedIDNumberLabel.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        assignedIDNumberLabel.setForeground(new java.awt.Color(47, 46, 65));
        assignedIDNumberLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_id.png"))); // NOI18N
        assignedIDNumberLabel.setText(bundle.getString("ClientIdentitySetup.assignedIDNumberLabel.text_1")); // NOI18N
        assignedIDNumberLabel.setName("assignedIDNumberLabel"); // NOI18N

        assignedIDNumberTextfield.setForeground(new java.awt.Color(0, 63, 143));
        assignedIDNumberTextfield.setAlignmentX(0.0F);
        assignedIDNumberTextfield.setAlignmentY(0.0F);
        assignedIDNumberTextfield.setCaretColor(new java.awt.Color(0, 63, 143));
        assignedIDNumberTextfield.setMargin(new java.awt.Insets(0, 0, 0, 0));
        assignedIDNumberTextfield.setName("assignedIDNumberTextfield"); // NOI18N
        assignedIDNumberTextfield.setSelectionColor(new java.awt.Color(0, 63, 143));

        clientIPAddressLabel.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        clientIPAddressLabel.setForeground(new java.awt.Color(47, 46, 65));
        clientIPAddressLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/wireless.png"))); // NOI18N
        clientIPAddressLabel.setText(bundle.getString("ClientIdentitySetup.clientIPAddressLabel.text_1")); // NOI18N
        clientIPAddressLabel.setName("clientIPAddressLabel"); // NOI18N

        clientIPAddressTextbox.setForeground(new java.awt.Color(0, 63, 143));
        clientIPAddressTextbox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        clientIPAddressTextbox.setName("clientIPAddressTextbox"); // NOI18N

        clientPortLabel.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        clientPortLabel.setForeground(new java.awt.Color(47, 46, 65));
        clientPortLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/port_icon.png"))); // NOI18N
        clientPortLabel.setText(bundle.getString("ClientIdentitySetup.clientPortLabel.text_1")); // NOI18N
        clientPortLabel.setName("clientPortLabel"); // NOI18N

        clientPortTextbox.setForeground(new java.awt.Color(255, 0, 51));
        clientPortTextbox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        clientPortTextbox.setName("clientPortTextbox"); // NOI18N

        authenticateButton.setBackground(new java.awt.Color(255, 255, 255));
        authenticateButton.setFont(new java.awt.Font("Montserrat", 0, 15)); // NOI18N
        authenticateButton.setForeground(new java.awt.Color(255, 255, 255));
        authenticateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/medium.png"))); // NOI18N
        authenticateButton.setText(bundle.getString("ClientIdentitySetup.authenticateButton.text_1")); // NOI18N
        authenticateButton.setBorder(null);
        authenticateButton.setBorderPainted(false);
        authenticateButton.setContentAreaFilled(false);
        authenticateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        authenticateButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        authenticateButton.setName("authenticateButton"); // NOI18N
        authenticateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                authenticateButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                authenticateButtonMouseExited(evt);
            }
        });
        authenticateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authenticateButtonActionPerformed(evt);
            }
        });

        footerTextLabel.setFont(new java.awt.Font("Montserrat", 0, 9)); // NOI18N
        footerTextLabel.setForeground(new java.awt.Color(47, 46, 65));
        footerTextLabel.setText(bundle.getString("ClientIdentitySetup.footerTextLabel.text_1")); // NOI18N
        footerTextLabel.setName("footerTextLabel"); // NOI18N

        footerLicensesTextLabel.setFont(new java.awt.Font("Montserrat", 2, 9)); // NOI18N
        footerLicensesTextLabel.setForeground(new java.awt.Color(47, 46, 65));
        footerLicensesTextLabel.setText(bundle.getString("ClientIdentitySetup.footerLicensesTextLabel.text")); // NOI18N
        footerLicensesTextLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        footerLicensesTextLabel.setName("footerLicensesTextLabel"); // NOI18N
        footerLicensesTextLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                footerLicensesTextLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout clientIdentitySetupPanelLayout = new javax.swing.GroupLayout(clientIdentitySetupPanel);
        clientIdentitySetupPanel.setLayout(clientIdentitySetupPanelLayout);
        clientIdentitySetupPanelLayout.setHorizontalGroup(
            clientIdentitySetupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientIdentitySetupPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(mainImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(clientIdentitySetupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assignedIDNumberLabel)
                    .addComponent(clientIPAddressLabel)
                    .addComponent(clientPortLabel)
                    .addGroup(clientIdentitySetupPanelLayout.createSequentialGroup()
                        .addComponent(discussionNetIdentitySetupLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(discussionNetIdentitySetupLabel2))
                    .addGroup(clientIdentitySetupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(assignedIDNumberTextfield, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(clientIPAddressTextbox, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(clientPortTextbox, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(authenticateButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69))
            .addGroup(clientIdentitySetupPanelLayout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(footerTextLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(footerLicensesTextLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        clientIdentitySetupPanelLayout.setVerticalGroup(
            clientIdentitySetupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientIdentitySetupPanelLayout.createSequentialGroup()
                .addGroup(clientIdentitySetupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clientIdentitySetupPanelLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(mainImage))
                    .addGroup(clientIdentitySetupPanelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(clientIdentitySetupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(discussionNetIdentitySetupLabel1)
                            .addComponent(discussionNetIdentitySetupLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(assignedIDNumberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(assignedIDNumberTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(clientIPAddressLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clientIPAddressTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(clientPortLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clientPortTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(authenticateButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(clientIdentitySetupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(footerLicensesTextLabel)
                    .addComponent(footerTextLabel)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clientIdentitySetupPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clientIdentitySetupPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName(bundle.getString("ClientIdentitySetup.AccessibleContext.accessibleName")); // NOI18N

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void authenticateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authenticateButtonActionPerformed
        InterfaceManager.changeWindow(
            this,
            new ClientMessaging(
                this.serverIPAddress,
                this.serverPort,
                assignedIDNumberTextfield.getText(),
                clientIPAddressTextbox.getText(),
                clientPortTextbox.getText()
            )
        );
    }//GEN-LAST:event_authenticateButtonActionPerformed

    private void authenticateButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authenticateButtonMouseEntered
        InterfaceManager.buttonHover(authenticateButton, true, "medium");
    }//GEN-LAST:event_authenticateButtonMouseEntered

    private void authenticateButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authenticateButtonMouseExited
        InterfaceManager.buttonHover(authenticateButton, false, "medium");
    }//GEN-LAST:event_authenticateButtonMouseExited

    private void footerLicensesTextLabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_footerLicensesTextLabelMouseClicked
        InterfaceManager.changeWindow(this, new Licenses());
    }// GEN-LAST:event_footerLicensesTextLabelMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientIdentitySetup.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientIdentitySetup(args[0], args[1]).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assignedIDNumberLabel;
    private javax.swing.JTextField assignedIDNumberTextfield;
    private javax.swing.JButton authenticateButton;
    private javax.swing.JLabel clientIPAddressLabel;
    private javax.swing.JTextField clientIPAddressTextbox;
    private javax.swing.JPanel clientIdentitySetupPanel;
    private javax.swing.JLabel clientPortLabel;
    private javax.swing.JTextField clientPortTextbox;
    private javax.swing.JLabel discussionNetIdentitySetupLabel1;
    private javax.swing.JLabel discussionNetIdentitySetupLabel2;
    private javax.swing.JLabel footerLicensesTextLabel;
    private javax.swing.JLabel footerTextLabel;
    private javax.swing.JLabel mainImage;
    // End of variables declaration//GEN-END:variables
}
