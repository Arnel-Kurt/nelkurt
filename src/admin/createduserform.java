/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import register.registF;
import static register.registF.email;
import static register.registF.username;
import testappnew.loginF;
import user.userDash;

/**
 *
 * @author unabi
 */
public class createduserform extends javax.swing.JFrame {

    /**
     * Creates new form createduserform
     */
    public createduserform() {
        initComponents();
    }
 public boolean duplicateCheck(){
        
        dbConnector dbc = new dbConnector();
        
        try{
            String query = "SELECT * FROM tbl_user  WHERE u_username = '" + us.getText() + "' OR u_email = '" + mail.getText() + "'";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                email = resultSet.getString("u_email");
                if(email.equals(mail.getText())){
                      JOptionPane.showMessageDialog(null, "Email is Already Used!");
                      mail.setText("");
                }
                username = resultSet.getString("u_username");
                if(username.equals(us.getText())){
                      JOptionPane.showMessageDialog(null, "Username is Already Used!");
                      us.setText("");
            }
            return true;
            }else{
                return false;
            }
          
        }catch (SQLException ex) {
            System.out.println(""+ex);
            return false;
        }
    }
 public boolean updateCheck(){
        
        dbConnector dbc = new dbConnector();
        
        try{
            String query = "SELECT * FROM tbl_user  WHERE (u_username = '" + us.getText() + "' OR u_email = '" + mail.getText() + "')AND u_id !='"+uid.getText()+"'";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                email = resultSet.getString("u_email");
                if(email.equals(mail.getText())){
                      JOptionPane.showMessageDialog(null, "Email is Already Used!");
                      mail.setText("");
                }
                username = resultSet.getString("u_username");
                if(username.equals(us.getText())){
                      JOptionPane.showMessageDialog(null, "Username is Already Used!");
                      us.setText("");
            }
            return true;
            }else{
                return false;
            }
          
        }catch (SQLException ex) {
            System.out.println(""+ex);
            return false;
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

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ut = new javax.swing.JComboBox<>();
        ust = new javax.swing.JComboBox<>();
        pw = new javax.swing.JTextField();
        us = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        fn = new javax.swing.JTextField();
        uid = new javax.swing.JTextField();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, -1));

        update.setText("Update");
        update.setEnabled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 70, -1));

        delete.setText("Delete");
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 70, -1));

        clear.setText("Clear");
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 60, -1));

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 70, -1));

        refresh.setText("Refresh");
        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 70, -1));

        jLabel2.setText("User ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel9.setText("First Name:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel3.setText("Last Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel4.setText("Email:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel5.setText("User Name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel6.setText("Password:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel8.setText("User Status: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 20));

        jLabel7.setText("Account Type:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));
        jPanel1.add(ut, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 130, -1));

        ust.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        jPanel1.add(ust, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 130, -1));
        jPanel1.add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 130, -1));
        jPanel1.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 130, -1));
        jPanel1.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 130, -1));
        jPanel1.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 130, -1));
        jPanel1.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 130, -1));

        uid.setEnabled(false);
        jPanel1.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
       userLoginF usf = new userLoginF();
       usf.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
       if(fn.getText().isEmpty()|| ln.getText().isEmpty() || mail.getText().isEmpty()
                || us.getText().isEmpty()|| pw.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if(pw.getText().length() < 8){
            JOptionPane.showMessageDialog(null, "Characters password is 8 above!");
            pw.setText("");
        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist!");
            
        }else{
        
        dbConnector dbc = new dbConnector();
        dbc.updateData("UPDATE tbl_user SET u_fname = '"+fn.getText()+"',u_lname ='"+ln.getText()+"',u_email ='"+mail.getText()+"',"
                + "u_username ='"+us.getText()+"',"
                + "u_password ='"+pw.getText()+"',,u_type ='"+ut.getSelectedItem()+"'WHERE u_id ='"+uid.getText()+"'");
         
          JOptionPane.showMessageDialog(null, "Updated Successfully!");
          loginF ads = new loginF();
         ads.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_updateActionPerformed
    }
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       
        if(fn.getText().isEmpty()|| ln.getText().isEmpty() || mail.getText().isEmpty()
                || us.getText().isEmpty()|| pw.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if(pw.getText().length() < 8){
            JOptionPane.showMessageDialog(null, "Characters password is 8 above!");
            pw.setText("");
        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist!");
            
        }else{
            
             dbConnector dbc = new dbConnector();
       
      if (dbc.insertData("INSERT INTO tbl_user (u_fname, u_lname, u_email, u_username, u_password, u_type, u_status) VALUES('"
     + fn.getText() + "','"+ln.getText()+"','"+ mail.getText() + "','" + us.getText() + "','" + pw.getText() + "','" + ut.getSelectedItem() + "','Pending')")){
          
        
          JOptionPane.showMessageDialog(null, "Inserted Successfully!");
          loginF ads = new loginF();
         ads.setVisible(true);
         this.dispose();
          
      }else{
          JOptionPane.showMessageDialog(null, "Connection Error!");
      }
            
        }        
        
                                           

    }//GEN-LAST:event_addActionPerformed

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
            java.util.logging.Logger.getLogger(createduserform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createduserform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createduserform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createduserform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createduserform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    public javax.swing.JTextField fn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    public javax.swing.JTextField ln;
    public javax.swing.JTextField mail;
    public javax.swing.JTextField pw;
    private javax.swing.JButton refresh;
    public javax.swing.JTextField uid;
    public javax.swing.JButton update;
    public javax.swing.JTextField us;
    public javax.swing.JComboBox<String> ust;
    public javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables
}
