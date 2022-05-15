/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora;

/**
 *
 * @author Acer
 */
public class CalculadoraRaizes extends javax.swing.JFrame {

    public CalculadoraRaizes() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entrada = new javax.swing.JSpinner();
        btnCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        restoDiv2 = new javax.swing.JLabel();
        elevadoCubo = new javax.swing.JLabel();
        raizQuadrada = new javax.swing.JLabel();
        raizCubica = new javax.swing.JLabel();
        valorAbs = new javax.swing.JLabel();
        resultadoRestoDiv = new javax.swing.JLabel();
        resultadoElevado = new javax.swing.JLabel();
        resultadoRaizQ = new javax.swing.JLabel();
        resultadoRaizC = new javax.swing.JLabel();
        resultadoAbs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        entrada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnCalcular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCalcular.setText("Calcular!");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Informe um valor");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Super Calculadora");

        restoDiv2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        elevadoCubo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        raizQuadrada.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        raizCubica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        valorAbs.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        resultadoRestoDiv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resultadoRestoDiv.setForeground(new java.awt.Color(51, 0, 255));

        resultadoElevado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resultadoElevado.setForeground(new java.awt.Color(51, 0, 255));

        resultadoRaizQ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resultadoRaizQ.setForeground(new java.awt.Color(51, 0, 255));

        resultadoRaizC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resultadoRaizC.setForeground(new java.awt.Color(51, 0, 255));

        resultadoAbs.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resultadoAbs.setForeground(new java.awt.Color(51, 0, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(106, 106, 106))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(valorAbs)
                    .addComponent(raizCubica)
                    .addComponent(raizQuadrada)
                    .addComponent(elevadoCubo)
                    .addComponent(restoDiv2))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultadoAbs)
                    .addComponent(resultadoRaizC)
                    .addComponent(resultadoRaizQ)
                    .addComponent(resultadoElevado)
                    .addComponent(resultadoRestoDiv)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(resultadoRestoDiv)
                        .addGap(18, 18, 18)
                        .addComponent(resultadoElevado)
                        .addGap(18, 18, 18)
                        .addComponent(resultadoRaizQ)
                        .addGap(18, 18, 18)
                        .addComponent(resultadoRaizC)
                        .addGap(18, 18, 18)
                        .addComponent(resultadoAbs))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(restoDiv2)
                        .addGap(18, 18, 18)
                        .addComponent(elevadoCubo)
                        .addGap(18, 18, 18)
                        .addComponent(raizQuadrada)
                        .addGap(18, 18, 18)
                        .addComponent(raizCubica)
                        .addGap(18, 18, 18)
                        .addComponent(valorAbs)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        int num = (int) entrada.getValue();
        int par = num%2;
        int pot = (int) Math.pow(num, 3);
        float raizQ = (float) Math.sqrt(num);
        float raizC = (float) Math.cbrt(num);
        int absolem = (int) Math.abs(num);
        
        restoDiv2.setText("Resto da Divisão por 2:");
        resultadoRestoDiv.setText(Integer.toString(par));
        
        elevadoCubo.setText("Elevado ao Cubo:");
        resultadoElevado.setText(Integer.toString(pot));
        
        raizQuadrada.setText("Raiz Quadrada:");
        resultadoRaizQ.setText(String.format("%.2f", raizQ));
        
        raizCubica.setText("Raiz Cubica:");
        resultadoRaizC.setText(String.format("%.2f", raizC));
        
        valorAbs.setText("Valor Absoluto:");
        resultadoAbs.setText(Integer.toString(absolem));
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraRaizes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraRaizes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraRaizes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraRaizes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraRaizes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel elevadoCubo;
    private javax.swing.JSpinner entrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel raizCubica;
    private javax.swing.JLabel raizQuadrada;
    private javax.swing.JLabel restoDiv2;
    private javax.swing.JLabel resultadoAbs;
    private javax.swing.JLabel resultadoElevado;
    private javax.swing.JLabel resultadoRaizC;
    private javax.swing.JLabel resultadoRaizQ;
    private javax.swing.JLabel resultadoRestoDiv;
    private javax.swing.JLabel valorAbs;
    // End of variables declaration//GEN-END:variables
}
