/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationsuma;

/**
 *
 * @author 311B-03
 */
public class ContainerSuma extends javax.swing.JFrame {

    /**
     * Creates new form ContainerSuma
     */
    public ContainerSuma() {
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

        valorUno = new javax.swing.JTextField();
        valorDos = new javax.swing.JTextField();
        resultado = new javax.swing.JTextField();
        sumarBtn = new javax.swing.JButton();
        restarBtn = new javax.swing.JButton();
        multiplicarBtn = new javax.swing.JButton();
        dividirBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sumarBtn.setText("Sumar");
        sumarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumarBtnActionPerformed(evt);
            }
        });

        restarBtn.setText("Restar");
        restarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restarBtnActionPerformed(evt);
            }
        });

        multiplicarBtn.setText("Multiplicar");
        multiplicarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarBtnActionPerformed(evt);
            }
        });

        dividirBtn.setText("Dividir");
        dividirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(valorUno)
                    .addComponent(valorDos)
                    .addComponent(resultado)
                    .addComponent(sumarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(restarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(multiplicarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(dividirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(valorUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valorDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(sumarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(restarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(multiplicarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dividirBtn)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sumarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumarBtnActionPerformed
        Operaciones oper = new Operaciones();
        resultado.setText( Integer.toString( oper.sumar( Integer.parseInt( valorUno.getText() ) , Integer.parseInt( valorDos.getText() )) ) );
    }//GEN-LAST:event_sumarBtnActionPerformed

    private void restarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restarBtnActionPerformed
        Operaciones oper = new Operaciones();
        resultado.setText( Integer.toString( oper.restar( Integer.parseInt( valorUno.getText() ) , Integer.parseInt( valorDos.getText() )) ) );
    }//GEN-LAST:event_restarBtnActionPerformed

    private void multiplicarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarBtnActionPerformed
        Operaciones oper = new Operaciones();
        resultado.setText( Integer.toString( oper.multiplicar( Integer.parseInt( valorUno.getText() ) , Integer.parseInt( valorDos.getText() )) ) );
    }//GEN-LAST:event_multiplicarBtnActionPerformed

    private void dividirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirBtnActionPerformed
        Operaciones oper = new Operaciones();
        resultado.setText( Integer.toString( oper.dividir( Integer.parseInt( valorUno.getText() ) , Integer.parseInt( valorDos.getText() )) ) );
    }//GEN-LAST:event_dividirBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ContainerSuma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContainerSuma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContainerSuma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContainerSuma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContainerSuma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dividirBtn;
    private javax.swing.JButton multiplicarBtn;
    private javax.swing.JButton restarBtn;
    private javax.swing.JTextField resultado;
    private javax.swing.JButton sumarBtn;
    private javax.swing.JTextField valorDos;
    private javax.swing.JTextField valorUno;
    // End of variables declaration//GEN-END:variables
}
