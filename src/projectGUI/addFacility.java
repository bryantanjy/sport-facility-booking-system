/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectGUI;

/**
 *
 * @author vero_
 */
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class addFacility extends javax.swing.JFrame {
    Connection myConnect;
    Statement myStat;
    ResultSet myRs;
    PreparedStatement pstmt;
    
    public addFacility() {
        initComponents();
        setConnect();
    }

    public void setConnect(){
        try{
            myConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_oop", "root", "");
            //JOptionPane.showMessageDialog(null, "Connection Success");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        addPanel1 = new javax.swing.JPanel();
        addLbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        idLbl = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        listActivityLbl4 = new javax.swing.JLabel();
        listActivityLbl3 = new javax.swing.JLabel();
        typeLbl = new javax.swing.JLabel();
        typeTxt = new javax.swing.JTextField();
        descLbl = new javax.swing.JLabel();
        descTxt = new javax.swing.JTextField();
        amountLbl = new javax.swing.JLabel();
        amountTxt = new javax.swing.JTextField();
        displayyBtn = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();
        profileUpdateBtn = new javax.swing.JButton();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(998, 671));

        addPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        addLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addLbl.setText("ADD FACILITY");
        addLbl.setToolTipText("");

        javax.swing.GroupLayout addPanel1Layout = new javax.swing.GroupLayout(addPanel1);
        addPanel1.setLayout(addPanel1Layout);
        addPanel1Layout.setHorizontalGroup(
            addPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanel1Layout.createSequentialGroup()
                .addGap(459, 459, 459)
                .addComponent(addLbl)
                .addContainerGap(494, Short.MAX_VALUE))
        );
        addPanel1Layout.setVerticalGroup(
            addPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        idLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        idLbl.setText("FacilityID: ");

        idTxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        listActivityLbl4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        listActivityLbl4.setForeground(new java.awt.Color(0, 51, 255));
        listActivityLbl4.setText("BADMINTION     PING PONG     TENNIS     BASKETBALL     ");

        listActivityLbl3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        listActivityLbl3.setForeground(new java.awt.Color(0, 51, 255));
        listActivityLbl3.setText("NETBALL     SQUASH     VOLLEYBALL     FUTSAL");

        typeLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        typeLbl.setText("Type: ");

        typeTxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        descLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        descLbl.setText("Description: ");

        descTxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        amountLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        amountLbl.setText("Amount:");

        amountTxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        displayyBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        displayyBtn.setForeground(new java.awt.Color(255, 0, 153));
        displayyBtn.setText("Display facility");
        displayyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayyBtnActionPerformed(evt);
            }
        });

        submitBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(255, 0, 153));
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        profileUpdateBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        profileUpdateBtn.setText("UPDATE PROFILE");
        profileUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileUpdateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(idLbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeLbl)
                            .addComponent(descLbl)
                            .addComponent(amountLbl)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(profileUpdateBtn)))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listActivityLbl3)
                            .addComponent(listActivityLbl4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(amountTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                .addComponent(typeTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(descTxt, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(145, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(displayyBtn)
                        .addGap(313, 313, 313)
                        .addComponent(submitBtn)
                        .addGap(46, 46, 46))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLbl)
                    .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(listActivityLbl3)
                .addGap(28, 28, 28)
                .addComponent(listActivityLbl4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeLbl))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descLbl)
                    .addComponent(descTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountLbl)
                    .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayyBtn)
                    .addComponent(submitBtn)
                    .addComponent(profileUpdateBtn))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        String SQL = "INSERT INTO facility VALUES (?,?,?,?)";
        try{
            pstmt = myConnect.prepareStatement(SQL);
            pstmt.setString(1, idTxt.getText());
            pstmt.setString(2, typeTxt.getText());
            pstmt.setInt(4, Integer.parseInt(amountTxt.getText()));
            pstmt.setString(3, descTxt.getText());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data is insert sucessfully");
            clearInput();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void displayyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayyBtnActionPerformed
        // TODO add your handling code here:
        updateFacility update = new updateFacility();
        update.setVisible(true);
        this.setVisible(false);
                
    }//GEN-LAST:event_displayyBtnActionPerformed

    private void profileUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileUpdateBtnActionPerformed
        profileUpdate profileUpdt = new profileUpdate();
        profileUpdt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_profileUpdateBtnActionPerformed
    
    public void clearInput(){
        idTxt.setText("");
        typeTxt.setText("");
        amountTxt.setText("");
        descTxt.setText("");
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
            java.util.logging.Logger.getLogger(addFacility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addFacility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addFacility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addFacility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addFacility().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addLbl;
    private javax.swing.JPanel addPanel1;
    private javax.swing.JLabel amountLbl;
    private javax.swing.JTextField amountTxt;
    private javax.swing.JLabel descLbl;
    private javax.swing.JTextField descTxt;
    private javax.swing.JButton displayyBtn;
    private javax.swing.JLabel idLbl;
    private javax.swing.JTextField idTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel listActivityLbl3;
    private javax.swing.JLabel listActivityLbl4;
    private javax.swing.JButton profileUpdateBtn;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel typeLbl;
    private javax.swing.JTextField typeTxt;
    // End of variables declaration//GEN-END:variables
}
