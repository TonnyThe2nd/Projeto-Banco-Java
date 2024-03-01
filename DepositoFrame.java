import javax.swing.JOptionPane;

public class DepositoFrame extends javax.swing.JFrame {
    private javax.swing.JButton cancelarBTTN;
    private javax.swing.JButton depositoBTTN;
    private javax.swing.JTextField depositoTF;
    private javax.swing.JLabel jLabel1;
    ClasseComandosUserUm cd = new ClasseComandosUserUm();
    ClasseComandosUserDois cddois = new ClasseComandosUserDois();
    String user;
    public DepositoFrame(String nome) {
        initComponents();
        this.user = nome;
    }
    private DepositoFrame() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        depositoTF = new javax.swing.JTextField();
        cancelarBTTN = new javax.swing.JButton();
        depositoBTTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        jLabel1.setText("DIGITE O VALOR DO DEPÓSITO");

        depositoTF.setFont(new java.awt.Font("Segoe UI", 1, 24));
        depositoTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cancelarBTTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        cancelarBTTN.setText("CANCELAR");
        cancelarBTTN.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBTTNActionPerformed(evt);
            }
        });

        depositoBTTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        depositoBTTN.setText("DEPOSITAR");
        depositoBTTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositoBTTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(depositoBTTN, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(cancelarBTTN))
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
                    .addComponent(cancelarBTTN))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }                                         

    private void depositoBTTNActionPerformed(java.awt.event.ActionEvent evt) {                                             
        String valor = depositoTF.getText();
        double valorDeposito = Double.parseDouble(valor);
        if(user.equalsIgnoreCase("ANTONIO")){
            depositoTF.setText("");
            cd.deposito(valorDeposito);
            JOptionPane.showMessageDialog(null, "DEPOSITO REALIZADO COM SUCESSO!\nSALDO ATUAL: R$ "+cd.getSaldo(),"SAQUE FINALIZADO",JOptionPane.INFORMATION_MESSAGE);

        }else if(user.equalsIgnoreCase("ANA")){
            depositoTF.setText("");
            cddois.deposito(valorDeposito);
            JOptionPane.showMessageDialog(null, "DEPOSITO REALIZADO COM SUCESSO!\nSALDO ATUAL: R$ "+cddois.getSaldo(),"SAQUE FINALIZADO",JOptionPane.INFORMATION_MESSAGE);
            
        }

    }
    private void cancelarBTTNActionPerformed(java.awt.event.ActionEvent evt){
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
