package projectGUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author yisha
 */
public class LoginForm extends javax.swing.JFrame {
    Connection myConn;
    Statement myStatmt;
    ResultSet myRs;
    PreparedStatement pStatmt;
    
    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        labelError1.setVisible(false);
        labelError2.setVisible(false);
        setConnect();
    }

    public void setConnect(){
        try{
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_oop", "root", "");
            //JOptionPane.showMessageDialog(null, "Connection success!!");
 
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private boolean validate_login(String memberID,String password) {
        try{           
            labelError2.setVisible(false);
            pStatmt = myConn.prepareStatement("Select * from membership where memberID=? and password=?");
            pStatmt.setString(1, memberID); 
            pStatmt.setString(2, password);
            ResultSet myRs = pStatmt.executeQuery();                        
            if(myRs.next()) {           
                return true;   
            }
            else{
                return false; 
            }           
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }       
    }
    
    private boolean validate_newLogin(String memberID) {
        try{           
            pStatmt = myConn.prepareStatement("Select * from membership where memberID=?");
            pStatmt.setString(1, memberID); 
            ResultSet myRs = pStatmt.executeQuery();                        
            if(myRs.next()) {           
                return true;   
            }
            else{
                return false; 
            }           
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }       
    }
    
    private boolean validate_reg(String memberID) {
        try{           
            labelError1.setVisible(false);
            pStatmt = myConn.prepareStatement("Select * from membership where memberID=?");
            pStatmt.setString(1, memberID); 
            ResultSet myRs = pStatmt.executeQuery();                        
            if(myRs.next()) {           
                return true;   
            }
            else{
                return false; 
            }           
        }catch(Exception e){
            e.printStackTrace();
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

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        memberIDTxtFld = new javax.swing.JTextField();
        pwdLbl = new javax.swing.JLabel();
        memberLogBtn = new javax.swing.JButton();
        memberRegBtn = new javax.swing.JButton();
        labelError2 = new javax.swing.JLabel();
        labelError1 = new javax.swing.JLabel();
        memberPasswrdTxtFld = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        inputLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Member ID : ");

        pwdLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pwdLbl.setText("Password   : ");

        memberLogBtn.setBackground(java.awt.Color.lightGray);
        memberLogBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        memberLogBtn.setText("Login");
        memberLogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberLogBtnActionPerformed(evt);
            }
        });

        memberRegBtn.setBackground(java.awt.Color.lightGray);
        memberRegBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        memberRegBtn.setText("Register");
        memberRegBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberRegBtnActionPerformed(evt);
            }
        });

        labelError2.setForeground(java.awt.Color.red);
        labelError2.setText("Incorrect password!");

        labelError1.setForeground(java.awt.Color.red);
        labelError1.setText("Member ID already exists! Please proceed to login.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pwdLbl)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(memberRegBtn)
                            .addGap(118, 118, 118)
                            .addComponent(memberLogBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9))
                        .addComponent(memberPasswrdTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelError1))
                    .addComponent(memberIDTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelError2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(memberIDTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelError1)
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberPasswrdTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwdLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelError2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberLogBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memberRegBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setToolTipText("");

        inputLbl.setFont(new java.awt.Font("Calisto MT", 3, 22)); // NOI18N
        inputLbl.setText("<<<< WELCOME TO OUR BOOKING SYSTEM >>>>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(inputLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(inputLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void memberLogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberLogBtnActionPerformed
        String memberID = memberIDTxtFld.getText();
        String password = memberPasswrdTxtFld.getText();

        if(validate_login(memberID, password)){
            JOptionPane.showMessageDialog(null, "Login successfully!");
            StudentAdminfunction profileSelection = new StudentAdminfunction();
            profileSelection.setVisible(true);
            this.setVisible(false);
        }else{
            //JOptionPane.showMessageDialog(null, "Login Failed!");
            labelError2.setVisible(true);
            memberPasswrdTxtFld.setText("");
        }  
        
        if(validate_newLogin(memberID)){
        }else{
            JOptionPane.showMessageDialog(null, "New user please register before login!");
        }  
     
    }//GEN-LAST:event_memberLogBtnActionPerformed

    private void memberRegBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberRegBtnActionPerformed
        String memberID = memberIDTxtFld.getText();

        if(validate_reg(memberID)){
            labelError1.setVisible(true);
        }else{
            RegisterForm frame = new RegisterForm();
            this.setVisible(false);
            frame.setVisible(true);
        }  
    }//GEN-LAST:event_memberRegBtnActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel inputLbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelError1;
    private javax.swing.JLabel labelError2;
    private javax.swing.JTextField memberIDTxtFld;
    private javax.swing.JButton memberLogBtn;
    private javax.swing.JPasswordField memberPasswrdTxtFld;
    private javax.swing.JButton memberRegBtn;
    private javax.swing.JLabel pwdLbl;
    // End of variables declaration//GEN-END:variables
}