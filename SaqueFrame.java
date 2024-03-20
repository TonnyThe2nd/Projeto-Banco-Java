import javax.swing.JOptionPane;

public class SaqueFrame extends javax.swing.JFrame {
    private javax.swing.JButton cancelarBTTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton sacarBTTN;
    private javax.swing.JTextField saqueTF;
    
    ClasseComandosUserUm cd = new ClasseComandosUserUm("Antonio",123,0,1234,12345678);
    ClasseComandosUserUm cddois = new ClasseComandosUserUm("Ana",123,1000,1234,12345678);
    String user;
    double main_saldo;
    public SaqueFrame(String nome, double valor) {
        initComponents();
        this.user = nome;
        this.main_saldo = valor;
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
        sacarBTTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        sacarBTTN.setText("SACAR");
        sacarBTTN.addActionListener(evt -> sacarBTTNActionPerformed());

        cancelarBTTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        cancelarBTTN.setText("CANCELAR");
        cancelarBTTN.addActionListener(evt -> cancelarBTTNActionPerformed());

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
                                     

    private void sacarBTTNActionPerformed() {                                          
        String valor = saqueTF.getText();
        double valorSaque = Double.parseDouble(valor);
        if(user.equalsIgnoreCase("ANTONIO")){
            if(valorSaque>main_saldo){
                saqueTF.setText("");
                JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE!!","ERRO",JOptionPane.ERROR_MESSAGE);
            }
            else{
                saqueTF.setText("");
                main_saldo -= valorSaque;
                JOptionPane.showMessageDialog(null, "SAQUE REALIZADO COM SUCESSO!\nSALDO ATUAL: R$ "+main_saldo,"SAQUE FINALIZADO",JOptionPane.INFORMATION_MESSAGE);
                
            }
        } else if(user.equalsIgnoreCase("ANA")){
            if(valorSaque>main_saldo){
                JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE!!","ERRO",JOptionPane.ERROR_MESSAGE);
                saqueTF.setText("");
            }
            else{
                saqueTF.setText("");
                main_saldo -= valorSaque;;
                JOptionPane.showMessageDialog(null, "SAQUE REALIZADO COM SUCESSO!\nSALDO ATUAL: R$ "+main_saldo,"SAQUE FINALIZADO",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
    }                                         

    private void cancelarBTTNActionPerformed() {  
        AcessoOpcoes ac = new AcessoOpcoes(user, main_saldo); 
        ac.setVisible(true);                                          
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
