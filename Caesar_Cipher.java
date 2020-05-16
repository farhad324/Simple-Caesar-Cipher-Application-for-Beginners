/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesar.cipher;

/**
 *
 * @author ASUS
 */
public class Caesar_Cipher extends javax.swing.JFrame {

    /**
     * Creates new form Caesar_Cipher
     */
    public Caesar_Cipher() {
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

        Encrypt = new javax.swing.JButton();
        ShiftBY = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        plainTEXTFIELD = new javax.swing.JTextField();
        encryptedTEXTFIELD = new javax.swing.JTextField();
        messageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caesar Cipher");
        setLocation(new java.awt.Point(420, 250));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        Encrypt.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Encrypt.setText("ENCRYPT");
        Encrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptActionPerformed(evt);
            }
        });

        ShiftBY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShiftBYActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter Your Text");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SHIFT:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel3.setText("Plain Text:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel4.setText("Encrypted Text:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Developed by Farhad, 2020");

        plainTEXTFIELD.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        plainTEXTFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plainTEXTFIELDActionPerformed(evt);
            }
        });

        encryptedTEXTFIELD.setEditable(false);
        encryptedTEXTFIELD.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        encryptedTEXTFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptedTEXTFIELDActionPerformed(evt);
            }
        });

        messageLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        messageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(encryptedTEXTFIELD, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(plainTEXTFIELD)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ShiftBY, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Encrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 86, Short.MAX_VALUE))
                    .addComponent(messageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plainTEXTFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShiftBY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Encrypt))
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(encryptedTEXTFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShiftBYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShiftBYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShiftBYActionPerformed
    /**
     * 
     * @param evt 
     */
    private void EncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncryptActionPerformed
        
        try{
        encryptedTEXTFIELD.setText("");
        String plaintext = plainTEXTFIELD.getText();
        int shiftAmount = Integer.parseInt(ShiftBY.getText());
        checkforSpecialCharacters(plaintext);
        String encryptedtext = shiftCipher(plaintext, shiftAmount);
        encryptedTEXTFIELD.setText(encryptedtext);
        messageLabel.setText("");
        }
        catch(NumberFormatException nfe){
            
          messageLabel.setText("Please Enter an integer value."); 
        }
        catch(Exception e){
            messageLabel.setText("Please enter your text without any special characters.");
        }
        
    }//GEN-LAST:event_EncryptActionPerformed
   /**
    * 
    * @param s
    * @throws Exception 
    */
    private void checkforSpecialCharacters(String s)throws Exception {
        for(int i=0;i<s.length();i++){
          if(s.charAt(i)<32||s.charAt(i)>126)
              throw new Exception();
     }
    }
    /**
     * 
     * @param pt
     * @param s
     * @return 
     */
    
    private String shiftCipher(String pt, int s){
      char[] ptArray = pt.toCharArray();
      char[] etArray = new char[ptArray.length];
      
      for(int i=0; i<ptArray.length;i++){
          int ascii = (int)ptArray[i];
          ascii = (ascii-32+s)%95 + 32;
          etArray[i]= (char)ascii;
      }
      String en=new String (etArray);
      return en;
    }
    
    
    
    
    
    private void plainTEXTFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plainTEXTFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plainTEXTFIELDActionPerformed

    private void encryptedTEXTFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptedTEXTFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_encryptedTEXTFIELDActionPerformed

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
            java.util.logging.Logger.getLogger(Caesar_Cipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caesar_Cipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caesar_Cipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caesar_Cipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caesar_Cipher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Encrypt;
    private javax.swing.JTextField ShiftBY;
    private javax.swing.JTextField encryptedTEXTFIELD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JTextField plainTEXTFIELD;
    // End of variables declaration//GEN-END:variables
}
