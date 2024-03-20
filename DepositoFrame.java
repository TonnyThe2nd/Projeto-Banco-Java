import javax.swing.JOptionPane;

public class DepositoFrame extends javax.swing.JFrame {
    private javax.swing.JButton sairBTTN;
    private javax.swing.JButton depositoBTTN;
    private javax.swing.JTextField depositoTF;
    private javax.swing.JLabel jLabel1;
    ClasseComandosUserUm cd = new ClasseComandosUserUm("Antonio",123,0,1234,12345678);
    ClasseComandosUserUm cddois = new ClasseComandosUserUm("Ana",123,1000,1234,12345678);
    String user;
    double main_saldo;
    public DepositoFrame(String nome,double valor) {
        initComponents();
        this.user = nome;
        this.main_saldo = valor;
    }
    private DepositoFrame() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        depositoTF = new javax.swing.JTextField();
        sairBTTN = new javax.swing.JButton();
        depositoBTTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        jLabel1.setText("DIGITE O VALOR DO DEPÓSITO");

        depositoTF.setFont(new java.awt.Font("Segoe UI", 1, 24));
        depositoTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sairBTTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        sairBTTN.setText("CANCELAR");
        sairBTTN.addActionListener(evt -> sairBTTNActionPerformed());
        depositoBTTN.setFont(new java.awt.Font("Segoe UI", 1, 15)); 
        depositoBTTN.setText("DEPOSITAR");
        depositoBTTN.addActionListener(evt -> depositoBTTNActionPerformed());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(depositoBTTN, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 70)
                        .addComponent(sairBTTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(depositoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(depositoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositoBTTN)
                    .addComponent(sairBTTN))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }                                         

    private void depositoBTTNActionPerformed() {                                             
        String valor = depositoTF.getText();
        double valorDeposito = Double.parseDouble(valor);
        if(user.equalsIgnoreCase("ANTONIO")){
            depositoTF.setText("");
            main_saldo+=valorDeposito;
            JOptionPane.showMessageDialog(null, "DEPOSITO REALIZADO COM SUCESSO!\nSALDO ATUAL: R$ "+main_saldo,"SAQUE FINALIZADO",JOptionPane.INFORMATION_MESSAGE);

        }else if(user.equalsIgnoreCase("ANA")){
            depositoTF.setText("");
            main_saldo+=valorDeposito;
            JOptionPane.showMessageDialog(null, "DEPOSITO REALIZADO COM SUCESSO!\nSALDO ATUAL: R$ "+main_saldo,"SAQUE FINALIZADO",JOptionPane.INFORMATION_MESSAGE);
            
        }

    }
    private void sairBTTNActionPerformed(){
        AcessoOpcoes ao = new AcessoOpcoes(user, main_saldo);
        ao.setVisible(true);
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
            java.util.logging.Logger.getLogger(DepositoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepositoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepositoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepositoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepositoFrame().setVisible(true);
            }
        });
    }
}
