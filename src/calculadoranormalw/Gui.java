/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoranormalw;

/**
 *
 * @author Walls
 */
public class Gui extends javax.swing.JFrame implements INumeros2{

    /**
     * Creates new form Gui
     */
    public Gui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING:
     * Do NOT modify this code. The content of this method is always regenerated by the
     * Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        multiplicar = new javax.swing.JButton();
        restar = new javax.swing.JButton();
        sumar = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        txtA = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        txtres = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        multiplicar.setText("multiplicar");
        multiplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multiplicarMouseClicked(evt);
            }
        });

        restar.setText("restar");
        restar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restarMouseClicked(evt);
            }
        });

        sumar.setText("sumar");
        sumar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sumarMouseClicked(evt);
            }
        });

        dividir.setText("Dividir");
        dividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dividirMouseClicked(evt);
            }
        });

        txtA.setBorder(javax.swing.BorderFactory.createTitledBorder("Digite un numero"));
        txtA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAKeyTyped(evt);
            }
        });

        txtB.setBorder(javax.swing.BorderFactory.createTitledBorder("Digite un numero"));
        txtB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(sumar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(restar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(multiplicar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dividir))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(txtres, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtres, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dividir)
                    .addComponent(multiplicar)
                    .addComponent(restar)
                    .addComponent(sumar))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAKeyTyped
         int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }
    }//GEN-LAST:event_txtAKeyTyped

    private void txtBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBKeyTyped
        int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }
    }//GEN-LAST:event_txtBKeyTyped

    private void sumarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumarMouseClicked
       sumar(Integer.parseInt(txtB.getText()));
    }//GEN-LAST:event_sumarMouseClicked

    private void restarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restarMouseClicked
        restar(Integer.parseInt(txtB.getText()));
    }//GEN-LAST:event_restarMouseClicked

    private void multiplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplicarMouseClicked
         multiplicar(Integer.parseInt(txtB.getText()));
    }//GEN-LAST:event_multiplicarMouseClicked

    private void dividirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dividirMouseClicked
        dividir(Integer.parseInt(txtB.getText()));
    }//GEN-LAST:event_dividirMouseClicked

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
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dividir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton multiplicar;
    private javax.swing.JButton restar;
    private javax.swing.JButton sumar;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtres;
    // End of variables declaration//GEN-END:variables

    @Override
    public void sumar(int n) {
        double res = n+ Integer.parseInt(txtA.getText());
        txtres.setText(res+"");
    }

    @Override
    public void restar(int n) {
       double res = n- Integer.parseInt(txtA.getText());
        txtres.setText(res+"");
    }

    @Override
    public void multiplicar(int n) {
        double res = n* Integer.parseInt(txtA.getText());
         txtres.setText(res+"");
    }

    @Override
    public void dividir(int n) {
       double res = n/ Integer.parseInt(txtA.getText()); 
        txtres.setText(res+"");
    }
}
