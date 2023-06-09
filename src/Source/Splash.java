/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import java.awt.Toolkit;

/**
 *
 * @author Dwi Rifki Novianto
 */
public class Splash extends javax.swing.JFrame {

    /**
     * Creates new form Splash
     */
    public Splash() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Value = new javax.swing.JLabel();
        ProgressBar = new javax.swing.JProgressBar();
        Values = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("School Management Information");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SCHOOL MANAGEMENT INFORMATION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 10, 410, 27);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Create Your Information with Us");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-5, 40, 410, 15);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Images/icons8_news_50px.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 60, 50, 55);

        Value.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Value.setForeground(new java.awt.Color(255, 255, 255));
        Value.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Value.setText("99%");
        getContentPane().add(Value);
        Value.setBounds(170, 120, 80, 40);

        ProgressBar.setBackground(new java.awt.Color(255, 255, 255));
        ProgressBar.setForeground(new java.awt.Color(0, 102, 204));
        ProgressBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        getContentPane().add(ProgressBar);
        ProgressBar.setBounds(50, 170, 320, 16);

        Values.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Values.setForeground(new java.awt.Color(255, 255, 255));
        Values.setText("Loading Resources");
        getContentPane().add(Values);
        Values.setBounds(50, 190, 320, 15);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Images/the-background-292720_960_720.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 405, 230);

        setSize(new java.awt.Dimension(405, 230));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JProgressBar ProgressBar;
    public javax.swing.JLabel Value;
    public javax.swing.JLabel Values;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    public void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Images/icons8_news_10px.png")));
    }
    
}
