public class AcessoOpcoes extends javax.swing.JFrame {
    ClasseComandosUserUm cd = new ClasseComandosUserUm();
    ClasseComandosUserDois cddois = new ClasseComandosUserDois();
    String user;
    double main_saldo;
    double main_saldoDois = cddois.getSaldo();
    public AcessoOpcoes(String nome,double valor) {
        this.user = nome;
        this.main_saldo = valor;
        initComponents();

    }

    private AcessoOpcoes() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }                       
    private void initComponents() {

        saqueBTTN = new javax.swing.JButton();
        transferBTTN = new javax.swing.JButton();
        depositoBTTN = new javax.swing.JButton();
        consultaBTTN = new javax.swing.JButton();
        sairBTTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        saqueBTTN.setFont(new java.awt.Font("Segoe UI", 1, 18));
        saqueBTTN.setText("SACAR");
        saqueBTTN.addActionListener(e -> saqueBTTNActionPerformed());

        transferBTTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        transferBTTN.setText("TRANSFERIR");
        transferBTTN.addActionListener(e ->transferBTTNActionPerformed());

        depositoBTTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        depositoBTTN.setText("DEPOSITAR");
        depositoBTTN.addActionListener(e -> depositoBTTNActionPerformed());
        consultaBTTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        consultaBTTN.setText("CONSULTAR");
        consultaBTTN.addActionListener(e-> consultaBTTNActionPerformed());
        sairBTTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        sairBTTN.setText("SAIR");
        sairBTTN.addActionListener(e -> sairBTTNActionPerformed());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transferBTTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saqueBTTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(consultaBTTN, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(depositoBTTN, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sairBTTN)
                .addGap(168, 168, 168))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saqueBTTN)
                    .addComponent(consultaBTTN))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transferBTTN)
                    .addComponent(depositoBTTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(sairBTTN)
                .addGap(33, 33, 33))
        );

        pack();
    }                     

    private void saqueBTTNActionPerformed() {                                          
        SaqueFrame sf = new SaqueFrame(user, main_saldo);
        sf.setVisible(true);
        dispose();
    }                                         

    private void transferBTTNActionPerformed() {                                             
           TransferenciaFrame tf = new TransferenciaFrame(user, main_saldo,main_saldoDois);
           tf.setVisible(true);
           
    }                                            

    private void sairBTTNActionPerformed() {                                         
        dispose();
    }                                        

    private void consultaBTTNActionPerformed() {     
        ConsultaFrame cf = new ConsultaFrame(user, main_saldo);                                      
        cf.setVisible(true);
    }                                            

    private void depositoBTTNActionPerformed() {                                             
        DepositoFrame df = new DepositoFrame(user, main_saldo);
        df.setVisible(true);
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
            java.util.logging.Logger.getLogger(AcessoOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcessoOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcessoOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcessoOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcessoOpcoes().setVisible(true);
            }
        });
    }
                    
    private javax.swing.JButton consultaBTTN;
    private javax.swing.JButton depositoBTTN;
    private javax.swing.JButton sairBTTN;
    private javax.swing.JButton saqueBTTN;
    private javax.swing.JButton transferBTTN;                   
}
