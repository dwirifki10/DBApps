/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author ACER
 */
public class ForgetPassword extends javax.swing.JFrame {
    int mousexdrag;
    int mouseydrag;
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    
    public void Password(){
        TXTP.setText(null);
        TXTField.setText(null);
    }
    
    
    /**
     * Creates new form Login
     */
    public ForgetPassword() {
        initComponents();
        setIcon();
        TXTP.setText(null);
        TXTField.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Panel = new javax.swing.JPanel();
        SPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        UserIcon = new javax.swing.JLabel();
        TextUsername = new javax.swing.JLabel();
        UserIcon1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Button = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        TXTField = new javax.swing.JLabel();
        Description = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        TXTP = new javax.swing.JTextField();
        Username = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Halaman Login");
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SPanel.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Images/icons8_news_135px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("School Management Information");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Create your information with us");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Version 1.0 BETA");

        javax.swing.GroupLayout SPanelLayout = new javax.swing.GroupLayout(SPanel);
        SPanel.setLayout(SPanelLayout);
        SPanelLayout.setHorizontalGroup(
            SPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(SPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        SPanelLayout.setVerticalGroup(
            SPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SPanelLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        Panel.add(SPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -9, 310, 470));

        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Images/icons8_close_window_30px_9.png"))); // NOI18N
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.setPreferredSize(new java.awt.Dimension(34, 50));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitMouseExited(evt);
            }
        });
        Panel.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 1, -1, 30));

        Email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        Panel.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 230, 30));

        UserIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Images/icons8_email_30px.png"))); // NOI18N
        Panel.add(UserIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 34, -1));

        TextUsername.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        TextUsername.setText("Masukan Username");
        Panel.add(TextUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 130, 20));

        UserIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Images/icons8_contacts_30px.png"))); // NOI18N
        Panel.add(UserIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 34, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel4.setText("Masukan E-mail");
        Panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 115, -1));

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("FORGET PASSWORD");
        Panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 270, -1));

        Button.setBackground(new java.awt.Color(0, 102, 204));
        Button.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        Button.setForeground(new java.awt.Color(255, 255, 255));
        Button.setText("LUPA PASSWORD");
        Button.setBorder(null);
        Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonMouseClicked(evt);
            }
        });
        Button.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ButtonKeyPressed(evt);
            }
        });
        Panel.add(Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 270, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        Panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 100, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        Panel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 110, 20));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("HASIL");
        Panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 50, 26));

        TXTField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TXTField.setForeground(new java.awt.Color(0, 102, 204));
        TXTField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TXTField.setText("PASSWORD BERHASIL DIUBAH ");
        Panel.add(TXTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 260, 30));

        Description.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Description.setForeground(new java.awt.Color(0, 102, 204));
        Description.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Description.setText("SIMPAN DAN JAGA PASSWORD ANDA BAIK - BAIK");
        Panel.add(Description, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 250, -1));

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Images/icons8_back_to_60px.png"))); // NOI18N
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackMouseExited(evt);
            }
        });
        Panel.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 60, 50));

        TXTP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TXTP.setForeground(new java.awt.Color(255, 51, 0));
        TXTP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXTP.setText("ABCDEFGHIJ");
        TXTP.setBorder(null);
        TXTP.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TXTP.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        Panel.add(TXTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 270, 20));

        Username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        Panel.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 230, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(617, 457));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - mousexdrag,y - mouseydrag);
        System.out.println(x + "," + y );
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        mousexdrag = evt.getX();
        mouseydrag = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseEntered
        // TODO add your handling code here:
        ImageIcon A = new ImageIcon(getClass().getResource("Images/close_window_30px.png"));
        Exit.setIcon(A);
    }//GEN-LAST:event_ExitMouseEntered

    private void ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseExited
        // TODO add your handling code here:
        ImageIcon A = new ImageIcon(getClass().getResource("Images/icons8_close_window_30px_9.png"));
        Exit.setIcon(A);
    }//GEN-LAST:event_ExitMouseExited

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void ButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ButtonKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        }
    }//GEN-LAST:event_ButtonKeyPressed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        // TODO add your handling code here:
        Login A = new Login();
        A.show();
        show(false);
        Password();
    }//GEN-LAST:event_BackMouseClicked

    private void BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseEntered
        // TODO add your handling code here:
        ImageIcon A = new ImageIcon(getClass().getResource("Images/icons8_back_to_60px_1.png"));
        Back.setIcon(A);
    }//GEN-LAST:event_BackMouseEntered

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited
        // TODO add your handling code here:
        ImageIcon A = new ImageIcon(getClass().getResource("Images/icons8_back_to_60px.png"));
        Back.setIcon(A);
    }//GEN-LAST:event_BackMouseExited

    private void ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonMouseClicked
        // TODO add your handling code here:
        String username, email;
        
        username = Username.getText().toLowerCase();
        email = Email.getText();
        
        if(username.equals("") || email.equals("")){
            Mistakes A = new Mistakes();
            A.show();
        }else{
            try{
                conn = Connections.getConnection();
                pst = conn.prepareStatement("SELECT * FROM sign_in WHERE username = ? and email = ?");
                pst.setString(1, username);
                pst.setString(2, email);
                rs = pst.executeQuery();
                
                if(rs.next()){
                    String A,B,PS;
                    A = rs.getString("username");
                    B = rs.getString("email");
                    PS = rs.getString("password");
                    if(username.equalsIgnoreCase(A) && email.equalsIgnoreCase(B)){
                       TXTField.setText("PASSWORD BERHASIL DIUBAH");
                       TXTP.setText(PS);
                       TXTField.setForeground(new Color (0,102,204));
                    }
                }else{
                    ForgetError Er = new ForgetError();
                    Er.show();
                    TXTField.setText("DATA YANG DIMASUKAN TIDAK COCOK");
                    TXTP.setText(null);
                    TXTField.setForeground(new Color(255,51,0));
                }
                
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_ButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgetPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JButton Button;
    private javax.swing.JLabel Description;
    private javax.swing.JTextField Email;
    private javax.swing.JLabel Exit;
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel SPanel;
    private javax.swing.JLabel TXTField;
    private javax.swing.JTextField TXTP;
    private javax.swing.JLabel TextUsername;
    private javax.swing.JLabel UserIcon;
    private javax.swing.JLabel UserIcon1;
    private javax.swing.JTextField Username;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    public void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Images/icons8_news_10px.png")));
    }

}