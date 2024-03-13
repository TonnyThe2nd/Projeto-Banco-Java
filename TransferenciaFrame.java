/*CREATOR
#GitHub - > TonnyThe2nd
#Instagram - > @web_4ntonio
#E-mail - > antoniomarcos3577@gmail.com
#Linkedn - > www.linkedin.com/in/antonio-marcos-sousa-de-oliveira-25b902272*/

import javax.swing.JOptionPane;

public class TransferenciaFrame extends javax.swing.JFrame {
    private javax.swing.JTextField agenciaTF;
    private javax.swing.JButton sairBTTN;
    private javax.swing.JTextField destTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField numTF;
    private javax.swing.JButton transferirBTTN;
    private javax.swing.JTextField valTF;
    ClasseComandosUserUm cd = new ClasseComandosUserUm();
    ClasseComandosUserDois cddois = new ClasseComandosUserDois();
    
    String user;
    double main_saldoUm;
    double main_saldoDois;
    public TransferenciaFrame(String user, double valorUm, double valorDois) {
        initComponents();
        this.user = user;  
        this.main_saldoUm = valorUm;
        this.main_saldoDois = valorDois;
    }

    private TransferenciaFrame() {
        throw new UnsupportedOperationException("Not supported yet."); 
    };                       
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        valTF = new javax.swing.JTextField();
        transferirBTTN = new javax.swing.JButton();
        sairBTTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        destTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        agenciaTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        numTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel1.setText("INSIRA O VALOR DA TRANSFERÊNCIA:");

        valTF.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        valTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);


        transferirBTTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        transferirBTTN.setText("TRANSFERIR");
        transferirBTTN.addActionListener(e -> transferirBTTNActionPerformed());

        sairBTTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        sairBTTN.setText("SAIR");
        sairBTTN.addActionListener(e -> sairBTTNActionPerformed());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel2.setText("DESTINATÁRIO(NOME):");

        destTF.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        destTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        destTF.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel3.setText("NÚMERO:");

        agenciaTF.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        agenciaTF.setForeground(new java.awt.Color(0, 0, 0));
        agenciaTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        agenciaTF.setDisabledTextColor(new java.awt.Color(187, 187, 187));
        agenciaTF.setOpaque(true);


        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel4.setText("AGÊNCIA:");

        numTF.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        numTF.setForeground(new java.awt.Color(0, 0, 0));
        numTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numTF.setDisabledTextColor(new java.awt.Color(187, 187, 187));
        numTF.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(129, 129, 129)
                            .addComponent(transferirBTTN, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sairBTTN, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(valTF, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numTF, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(destTF, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(agenciaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(valTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(destTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(agenciaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(numTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transferirBTTN)
                    .addComponent(sairBTTN))
                .addGap(21, 21, 21))
        );

        pack();
    }                       


    private void transferirBTTNActionPerformed() {                                               
        String valor = valTF.getText();
        double valorDeposito = Double.parseDouble(valor);
        if(valorDeposito>main_saldoUm){
            JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE!!","ERRO",JOptionPane.ERROR_MESSAGE);
        }
        else{
            int agencia = Integer.parseInt(agenciaTF.getText());
            int numero = Integer.parseInt(numTF.getText());
            String userTF = destTF.getText();
            if(user.equalsIgnoreCase("Antonio")){
               if(agencia == cddois.getAgencia()&&numero == cddois.getNUM() && userTF.equalsIgnoreCase(cddois.getNome())){
                    main_saldoDois+=valorDeposito;
                    main_saldoUm-=valorDeposito;
                    JOptionPane.showMessageDialog(null, "Transferência Realizada com Sucesso!!","SUCESSO",JOptionPane.INFORMATION_MESSAGE);
                    System.out.println(main_saldoDois);
                    System.out.println(main_saldoUm);
                }
                else{
                    JOptionPane.showMessageDialog(null, "USUÁRIO NÃO ENCONTRADO","ERRO",JOptionPane.ERROR_MESSAGE);
                    }
            }else if(user.equalsIgnoreCase("Ana")){
                if(agencia == cd.getAgencia()&&numero == cd.getNUM() && userTF.equalsIgnoreCase(cd.getNome())){
                    main_saldoDois-=valorDeposito;
                    main_saldoUm+=valorDeposito;
                    JOptionPane.showMessageDialog(null, "Transferência Realizada com Sucesso!!","SUCESSO",JOptionPane.INFORMATION_MESSAGE);
                    System.out.println(main_saldoDois);
                    System.out.println(main_saldoUm);
                }
                else{
                    JOptionPane.showMessageDialog(null, "USUÁRIO NÃO ENCONTRADO","ERRO",JOptionPane.ERROR_MESSAGE);
                  
                    }
            } 
        }
        valTF.setText("");
        destTF.setText("");
        numTF.setText("");
        agenciaTF.setText("");
    }                                              

    private void sairBTTNActionPerformed() {  
        AcessoOpcoes ao = new AcessoOpcoes(user, main_saldoUm);
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
            java.util.logging.Logger.getLogger(TransferenciaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransferenciaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransferenciaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransferenciaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransferenciaFrame().setVisible(true);
            }
        });
    }
           
}
