/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import com.mysql.jdbc.*;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author hp
 * 
 * 
 * 
 */
public class log extends javax.swing.JFrame {

    /**
     * Creates new form log
     */
    public log() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jtxtUsername = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jbnLogin = new javax.swing.JButton();
        jbnReset = new javax.swing.JButton();
        jbnExit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Enter College Email:");

        jtxtUsername.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jtxtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPassword.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Enter Password:");

        jbnLogin.setBackground(new java.awt.Color(0, 0, 255));
        jbnLogin.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jbnLogin.setText("LOGIN");
        jbnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnLoginActionPerformed(evt);
            }
        });

        jbnReset.setBackground(new java.awt.Color(255, 255, 0));
        jbnReset.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jbnReset.setText("RESET");
        jbnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnResetActionPerformed(evt);
            }
        });

        jbnExit.setBackground(new java.awt.Color(255, 0, 0));
        jbnExit.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jbnExit.setText("EXIT");
        jbnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnExitActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jButton1.setText("Sign Up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jbnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                            .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(101, 101, 101))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnLogin)
                    .addComponent(jbnReset)
                    .addComponent(jbnExit)
                    .addComponent(jButton1))
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnLoginActionPerformed

        String password= jPassword.getText();
        String username= jtxtUsername.getText();
        String url = "jdbc:mysql://localhost:3306/inventory";
        boolean in=true;
        try{
                Class.forName("java.sql.Driver");
                Connection con = DriverManager.getConnection(url,"root","root");
                Statement stmt = con.createStatement();
                String qry = "Select * from details;";
                ResultSet rs = stmt.executeQuery(qry);
                while(rs.next()){
                 if(username.equals(rs.getString(1))){
                     
                     if (password.equals(rs.getString(2))){
                         UserInterface p = new UserInterface();
                         this.setVisible(false);
                         p.setVisible(true);
                          in = true;
                     break;
                     }else {
                     javax.swing.JOptionPane.showMessageDialog(this, "Invalid Password!");
                     }
                     in = false;
                 }else{
                     
                  }
                }
                
                if (!in ){
               javax.swing.JOptionPane.showMessageDialog(this, "User Not Found");
                }
                stmt.close();
                con.close();
                
            }
            catch (Exception e){
                System.out.print(e.toString());}

        /*if(password.contains("1") && (username.contains("1")))
        {
            //System.out.println("Logged in");
            JOptionPane.showMessageDialog(null,"SUCCESS","Login Confirmed", JOptionPane.ERROR_MESSAGE);
            this.setVisible(false);
            jtxtUsername.setText(null);
            jPassword.setText(null);
            SystemExit();

            signup Info = new signup();
            Info.setVisible(true);

        }
        else{
            JOptionPane.showMessageDialog(null,"Invalid Login Details","Login Error", JOptionPane.ERROR_MESSAGE);
            jtxtUsername.setText(null);
            jPassword.setText(null);
        }*/
    }//GEN-LAST:event_jbnLoginActionPerformed

    private void jbnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnResetActionPerformed
        jtxtUsername.setText(null);
        jPassword.setText(null);
    }//GEN-LAST:event_jbnResetActionPerformed

    private void jbnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbnExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        signup p1 = new signup();
        p1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    void SystemExit(){
        {
         WindowEvent winCloseing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
         }
    }
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
            java.util.logging.Logger.getLogger(log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new log().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JButton jbnExit;
    private javax.swing.JButton jbnLogin;
    private javax.swing.JButton jbnReset;
    private javax.swing.JTextField jtxtUsername;
    // End of variables declaration//GEN-END:variables
}
