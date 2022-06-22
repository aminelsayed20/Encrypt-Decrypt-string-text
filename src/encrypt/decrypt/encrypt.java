/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package encrypt.decrypt;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author amine
 */
public class encrypt extends javax.swing.JFrame implements KeyListener {

    /**
     * Creates new form encrypt
     */
    public encrypt() {
        initComponents();
        this.addKeyListener(this);
    }

    
    private String encrypt (String massege, int key)
    {
        String str="";
        key+=204;

        for (int i = 0; i < massege.length(); i++) 
        {
            str += (char)( massege.charAt(i) + key );
        }
        return str;
    }
    private String decrypt (String massege, int key)
    {
        String str="";
        key+=204;

        for (int i = 0; i < massege.length(); i++) 
        {
            str += (char)( massege.charAt(i) - key );
        }
        return str;
    }
    
      private int toint (String num)
    {
        return Integer.parseInt(num);
    }
     private String tostring (long num)
    {
        
        return String.valueOf(num); 
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        keyT = new javax.swing.JTextField();
        encrypt = new javax.swing.JRadioButton();
        decrypt = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        ok = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        input = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ENCRYPT");
        setMinimumSize(new java.awt.Dimension(875, 415));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("ُEncryption key");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 50, 140, 30);

        keyT.setBackground(new java.awt.Color(0, 51, 102));
        keyT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        keyT.setForeground(new java.awt.Color(255, 255, 255));
        keyT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        keyT.setBorder(new javax.swing.border.MatteBorder(null));
        keyT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyTActionPerformed(evt);
            }
        });
        getContentPane().add(keyT);
        keyT.setBounds(30, 90, 90, 40);

        encrypt.setBackground(new java.awt.Color(0, 51, 102));
        buttonGroup1.add(encrypt);
        encrypt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        encrypt.setForeground(new java.awt.Color(204, 204, 204));
        encrypt.setText("Encrypt");
        encrypt.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(encrypt);
        encrypt.setBounds(40, 240, 90, 30);

        decrypt.setBackground(new java.awt.Color(0, 51, 102));
        buttonGroup1.add(decrypt);
        decrypt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        decrypt.setForeground(new java.awt.Color(204, 204, 204));
        decrypt.setText("Decrypt");
        decrypt.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(decrypt);
        decrypt.setBounds(40, 280, 90, 30);

        output.setBackground(new java.awt.Color(153, 153, 153));
        output.setColumns(20);
        output.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        output.setRows(5);
        output.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jScrollPane1.setViewportView(output);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 220, 630, 140);

        ok.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ok.setText("ok!");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        ok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                okKeyPressed(evt);
            }
        });
        getContentPane().add(ok);
        ok.setBounds(420, 170, 120, 40);

        input.setBackground(new java.awt.Color(153, 153, 153));
        input.setColumns(20);
        input.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        input.setRows(5);
        input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jScrollPane2.setViewportView(input);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(160, 10, 630, 140);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cryptography-banner.PNG"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1, 0, 860, 380);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
      if (encrypt.isSelected())
      {
          output.setText(encrypt (input.getText(), toint(keyT.getText())));
      }
      else if (decrypt.isSelected())
      {
          output.setText(decrypt (input.getText(), toint(keyT.getText())));
      }
      else
      {
          output.setText("plese chose encrypt or decrypt");
      }
    }//GEN-LAST:event_okActionPerformed

    private void keyTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keyTActionPerformed

    private void okKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_okKeyPressed
    
    }//GEN-LAST:event_okKeyPressed

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
            java.util.logging.Logger.getLogger(encrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(encrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(encrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(encrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new encrypt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton decrypt;
    private javax.swing.JRadioButton encrypt;
    private javax.swing.JTextArea input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField keyT;
    private javax.swing.JButton ok;
    private javax.swing.JTextArea output;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {
          if (e.getKeyCode() == KeyEvent.VK_ENTER)
       {
                 if (encrypt.isSelected())
      {
          output.setText(encrypt (input.getText(), toint(keyT.getText())));
      }
      else if (decrypt.isSelected())
      {
          output.setText(decrypt (input.getText(), toint(keyT.getText())));
      }
      else
      {
          output.setText("plese chose encrypt or decrypt");
      }
       }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
