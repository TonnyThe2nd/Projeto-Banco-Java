import javax.swing.JOptionPane;

public class SaqueFrame extends javax.swing.JFrame {
    private javax.swing.JButton cancelarBTTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton sacarBTTN;
    private javax.swing.JTextField saqueTF;
    
    ClasseComandosUserUm cd = new ClasseComandosUserUm();
    ClasseComandosUserDois cddois = new ClasseComandosUserDois();
    String user;
    public SaqueFrame(String nome) {
        initComponents();
        this.user = nome;
    }
    private SaqueFrame() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }                         
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        saqueTF = new javax.swing.JTextField();
        sacarBTTN = new javax.swing.JButton();
        cancelarBTTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); 
        jLabel1.setText("INSIRA O VALOR DO SAQUE");

        saqueTF.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        saqueTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        saqueTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saqueTFActionPerformed(evt);
            }
        });

        sacarBTTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        sacarBTTN.setText("SACAR");
        sacarBTTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacarBTTNActionPerformed(evt);
            }
        });

        cancelarBTTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        cancelarBTTN.setText("CANCELAR");
        cancelarBTTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBTTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(saqueTF, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(sacarBTTN, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(cancelarBTTN)
                .addGap(0, 57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(saqueTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sacarBTTN)
                    .addComponent(cancelarBTTN))
                .addGap(43, 43, 43))
        );

        pack();
    }                      

    private void saqueTFActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
    }                                       

    private void sacarBTTNActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String valor = saqueTF.getText();
        double valorSaque = Double.parseDouble(valor);
        if(user.equalsIgnoreCase("ANTONIO")){
            if(valorSaque>cd.getSaldo()){
                saqueTF.setText("");
                JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE!!","ERRO",JOptionPane.ERROR_MESSAGE);
            }
            else{
                saqueTF.setText("");
                cd.setSaldoSub(valorSaque);
                JOptionPane.showMessageDialog(null, "SAQUE REALIZADO COM SUCESSO!\nSALDO ATUAL: R$ "+cd.getSaldo(),"SAQUE FINALIZADO",JOptionPane.INFORMATION_MESSAGE);
                
            }
        } else if(user.equalsIgnoreCase("ANA")){
            if(valorSaque>cddois.getSaldo()){
                JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE!!","ERRO",JOptionPane.ERROR_MESSAGE);
                saqueTF.setText("");
            }
            else{
                saqueTF.setText("");
                cddois.setSaldoSub(valorSaque);
                JOptionPane.showMessageDialog(null, "SAQUE REALIZADO COM SUCESSO!\nSALDO ATUAL: R$ "+cddois.getSaldo(),"SAQUE FINALIZADO",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
    }                                         

    private void cancelarBTTNActionPerformed(java.awt.event.ActionEvent evt) {                                             
        dispose();
    }                                            

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SaqueFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaqueFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaqueFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaqueFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaqueFrame().setVisible(true);
            }
        });
    }                                    
}
