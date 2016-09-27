/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Map;
import javax.swing.JOptionPane;
import model.EmailValidator;
import model.MyClone;
import model.ShoutBox;

/**
 *
 * @author arulpeter
 */
public class VirtualCloneGui extends javax.swing.JFrame {

    /**
     * Creates new form VirtualCloneGui
     */
    public VirtualCloneGui() {
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

        try {
            jSayHiButton =(javax.swing.JButton)java.beans.Beans.instantiate(getClass().getClassLoader(), "view.VirtualCloneGui_jButton1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jScrollPane1 = new javax.swing.JScrollPane();
        jIntroTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jRandomMessageButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jRandomMessageTextArea = new javax.swing.JTextArea();
        jShowAdviseButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jAdviseTextArea = new javax.swing.JTextArea();
        jTakeInputButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jInputTextField = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTakeAdviseTextArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jEmailTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jEmailTextField2 = new javax.swing.JTextField();
        jSubmitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSayHiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSayHiButtonActionPerformed(evt);
            }
        });

        jIntroTextArea.setEditable(false);
        jIntroTextArea.setColumns(20);
        jIntroTextArea.setRows(5);
        jIntroTextArea.setAutoscrolls(false);
        jScrollPane1.setViewportView(jIntroTextArea);

        jLabel1.setText("Meet Jack !");

        jRandomMessageButton.setText("I can try to speak english");
        jRandomMessageButton.setToolTipText("");
        jRandomMessageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRandomMessageButtonActionPerformed(evt);
            }
        });

        jRandomMessageTextArea.setEditable(false);
        jRandomMessageTextArea.setColumns(20);
        jRandomMessageTextArea.setRows(5);
        jScrollPane2.setViewportView(jRandomMessageTextArea);

        jShowAdviseButton.setText("Show Free Advise");
        jShowAdviseButton.setToolTipText("");
        jShowAdviseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jShowAdviseButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Jack got some advise for you!");

        jAdviseTextArea.setColumns(20);
        jAdviseTextArea.setRows(5);
        jScrollPane3.setViewportView(jAdviseTextArea);

        jTakeInputButton.setText("Enter");
        jTakeInputButton.setToolTipText("");
        jTakeInputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTakeInputButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Take an advise you like ! Just enter the number :");

        jInputTextField.setToolTipText("");

        jTakeAdviseTextArea.setEditable(false);
        jTakeAdviseTextArea.setColumns(20);
        jTakeAdviseTextArea.setRows(5);
        jScrollPane4.setViewportView(jTakeAdviseTextArea);

        jLabel5.setText("Disclaimer: I have a poor choice of words. Literally.");

        jLabel2.setText("Get in touch");

        jLabel6.setText("Enter Email :");

        jLabel7.setText("Confirm Email:");

        jSubmitButton.setText("Submit");
        jSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRandomMessageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSayHiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTakeInputButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane4)
                            .addComponent(jShowAdviseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jEmailTextField1)
                    .addComponent(jEmailTextField2))
                .addGap(18, 18, 18)
                .addComponent(jSubmitButton)
                .addGap(130, 130, 130))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSayHiButton)
                    .addComponent(jShowAdviseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTakeInputButton)
                            .addComponent(jInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRandomMessageButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jEmailTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jEmailTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSayHiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSayHiButtonActionPerformed
        // TODO add your handling code here:
        //Jack's intro Say Hi button
        MyClone name = new MyClone("Jack", "Donaghy");
        jIntroTextArea.append(name.introduction());
        //after clicking, disables the Say Hi button
        jSayHiButton.setEnabled(false);
    }//GEN-LAST:event_jSayHiButtonActionPerformed
    ShoutBox shoutout = new ShoutBox();
    private void jRandomMessageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRandomMessageButtonActionPerformed
        // TODO add your handling code here:
        //performs code if the Say Hi button is disabled
        if (!jSayHiButton.isEnabled())
        {
            jRandomMessageTextArea.append(shoutout.shoutoutRandomMessage()+ "\n");
        }
        else 
        {
            //Dialog box/pane
            JOptionPane.showMessageDialog(null, "Please Say Hi first !");
        }
    }//GEN-LAST:event_jRandomMessageButtonActionPerformed

    private void jShowAdviseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jShowAdviseButtonActionPerformed
        // TODO add your handling code here:
        //performs code if the Say Hi button is disabled
        if (!jSayHiButton.isEnabled())
        {
            jAdviseTextArea.append(shoutout.shoutOutCannedMessage()+ "\n");
            jShowAdviseButton.setEnabled(false);
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Dont be rude Say Hi first !");
        }

    }//GEN-LAST:event_jShowAdviseButtonActionPerformed

    private void jTakeInputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTakeInputButtonActionPerformed
        // TODO add your handling code here:
       
        if (!jShowAdviseButton.isEnabled()) {
            try {
                //Range Checker
                Integer input = Integer.parseInt(jInputTextField.getText());
                if(input < 1 || input > 10) {
                    JOptionPane.showMessageDialog(null, "Please enter an Integer only from 1 to 10 !");
                } else {
                    Map<Integer, String> hashMap = shoutout.getMap();
                    jTakeAdviseTextArea.setText(hashMap.get(input));
                }
            } catch (NumberFormatException e) {
                //if input is not an Integer
                JOptionPane.showMessageDialog(null, "Please enter a valid input");
            }        
        } else {
            JOptionPane.showMessageDialog(null, "First see the advise I've got for you. Press Show Free Advise !");
        }
        
       
    }//GEN-LAST:event_jTakeInputButtonActionPerformed

    private void jSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubmitButtonActionPerformed
        // TODO add your handling code here:
        boolean isInRange = false;
        EmailValidator evalid = new EmailValidator(jEmailTextField1.getText() , jEmailTextField2.getText());
        if (jEmailTextField1.getText().equals("") || 
            jEmailTextField2.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "enter email");
        }
        else 
        {   
            if(jEmailTextField1.getText().equals(jEmailTextField2.getText()) && 
               jEmailTextField2.getText().equals(jEmailTextField1.getText()))
               {
                //simple regex only checks for "@" reference for regex http://howtodoinjava.com/
                String regex = "^(.+)@(.+)$"; 
                //only refering jEmailTextField1 as this code exectues if the above condition is true
                String email1 = jEmailTextField1.getText(); 
                Boolean b = email1.matches(regex);
                if (b)
                {
                        JOptionPane.showMessageDialog(null, "Thank you !"
                + " your email "+evalid.emailvalid()+" is submitted.");
                }
                
                else
                {
                        JOptionPane.showMessageDialog(null, "Enter a valid email");
                }

                   
               }
            else
            {
                JOptionPane.showMessageDialog(null, "Both emails do not match ! Please re-enter and confirm");
            }
        }
    }//GEN-LAST:event_jSubmitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(VirtualCloneGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VirtualCloneGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VirtualCloneGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VirtualCloneGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VirtualCloneGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea jAdviseTextArea;
    private javax.swing.JTextField jEmailTextField1;
    private javax.swing.JTextField jEmailTextField2;
    private javax.swing.JTextField jInputTextField;
    private javax.swing.JTextArea jIntroTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jRandomMessageButton;
    private javax.swing.JTextArea jRandomMessageTextArea;
    private javax.swing.JButton jSayHiButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jShowAdviseButton;
    private javax.swing.JButton jSubmitButton;
    private javax.swing.JTextArea jTakeAdviseTextArea;
    private javax.swing.JButton jTakeInputButton;
    // End of variables declaration//GEN-END:variables
}