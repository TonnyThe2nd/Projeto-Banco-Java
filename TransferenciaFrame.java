/*CREATOR
#GitHub - > TonnyThe2nd
#Instagram - > @web_4ntonio
#E-mail - > antoniomarcos3577@gmail.com
#Linkedn - > www.linkedin.com/in/antonio-marcos-sousa-de-oliveira-25b902272*/

import javax.swing.JOptionPane;

public class TransferenciaFrame extends javax.swing.JFrame {
    private javax.swing.JTextField agenciaTF;
    private javax.swing.JButton cancelarBTTN;
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

    public TransferenciaFrame(String user) {
        initComponents();
        this.user = user;
        
    }

    private TransferenciaFrame() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    };                       
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        valTF = new javax.swing.JTextField();
        transferirBTTN = new javax.swing.JButton();
        cancelarBTTN = new javax.swing.JButton();
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
        valTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valTFActionPerformed(evt);
            }
        });

        transferirBTTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        transferirBTTN.setText("TRANSFERIR");
        transferirBTTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferirBTTNActionPerformed(evt);
            }
        });

        cancelarBTTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        cancelarBTTN.setText("CANCELAR");
        cancelarBTTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBTTNActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("DESTINATÁRIO(NOME):");

        destTF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        destTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        destTF.setOpaque(true);
        destTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                destTFFocusLost(evt);
            }
        });
        destTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destTFActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel3.setText("NÚMERO:");

        agenciaTF.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        agenciaTF.setForeground(new java.awt.Color(0, 0, 0));
        agenciaTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        agenciaTF.setDisabledTextColor(new java.awt.Color(187, 187, 187));
        agenciaTF.setOpaque(true);
        agenciaTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                agenciaTFFocusLost(evt);
            }
        });
        agenciaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agenciaTFActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel4.setText("AGÊNCIA:");

        numTF.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        numTF.setForeground(new java.awt.Color(0, 0, 0));
        numTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numTF.setDisabledTextColor(new java.awt.Color(187, 187, 187));
        numTF.setOpaque(true);
        numTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                numTFFocusLost(evt);
            }
        });
        numTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTFActionPerformed(evt);
            }
        });

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
                            .addComponent(cancelarBTTN, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(cancelarBTTN))
                .addGap(21, 21, 21))
        );

        pack();
    }                       

    private void valTFActionPerformed(java.awt.event.ActionEvent evt) {                                      
        
    }                                     

    private void transferirBTTNActionPerformed(java.awt.event.ActionEvent evt) {                                               
        String valor = valTF.getText();
        double valorDeposito = Double.parseDouble(valor);
        if(valorDeposito>cd.getSaldo()){
            JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE!!","ERRO",JOptionPane.ERROR_MESSAGE);
        }
        else{
            int agencia = Integer.parseInt(agenciaTF.getText());
            int numero = Integer.parseInt(numTF.getText());
            String userTF = destTF.getText();
            if(user.equalsIgnoreCase("Antonio")){
               if(agencia == cddois.getAgencia() && numero == cddois.getNUM() && userTF.equalsIgnoreCase(cddois.getNome())){
                    cddois.deposito(valorDeposito);
                    cd.setSaldoSub(valorDeposito);
                    JOptionPane.showMessageDialog(null, "Transferência Realizada com Sucesso!!","SUCESSO",JOptionPane.INFORMATION_MESSAGE);
                    System.out.println(cddois.getSaldo());
                    System.out.println(cd.getSaldo());
                }
                else{
                    JOptionPane.showMessageDialog(null, "USUÁRIO NÃO ENCONTRADO","ERRO",JOptionPane.ERROR_MESSAGE);
                    }
            }else if(user.equalsIgnoreCase("Ana")){
                if(agencia == cd.getAgencia() && numero == cd.getNUM() && userTF.equalsIgnoreCase(cd.getNome())){
                    cd.deposito(valorDeposito);
                    cddois.setSaldoSub(valorDeposito);
                    JOptionPane.showMessageDialog(null, "Transferência Realizada com Sucesso!!","SUCESSO",JOptionPane.INFORMATION_MESSAGE);
                    System.out.println(cddois.getSaldo());
                    System.out.println(cd.getSaldo());
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

    private void destTFActionPerformed(java.awt.event.ActionEvent evt) {                                       

    }                                      

    private void destTFFocusLost(java.awt.event.FocusEvent evt) {                                 
        
    }                                

    private void agenciaTFFocusLost(java.awt.event.FocusEvent evt) {                                    
        
    }                                   

    private void agenciaTFActionPerformed(java.awt.event.ActionEvent evt) {                                          
       
    }                                         

    private void numTFFocusLost(java.awt.event.FocusEvent evt) {                                
       
    }                               

    private void numTFActionPerformed(java.awt.event.ActionEvent evt) {                                      
        
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
