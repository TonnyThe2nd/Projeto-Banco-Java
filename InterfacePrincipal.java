import javax.swing.JOptionPane;

public class InterfacePrincipal extends javax.swing.JFrame {
    private javax.swing.JButton entrarBTTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField senhaPF;
    private javax.swing.JTextField userTF;
    ClasseComandosUserUm cd = new ClasseComandosUserUm("Antonio",123,0,1234,12345678);
    ClasseComandosUserUm cddois = new ClasseComandosUserUm("Ana",123,1000,1234,12345678);
    public String mainUser;
    public double main_saldoUm = cd.getSaldo();
    public double main_saldoDois  = cddois.getSaldo();
    public InterfacePrincipal() {
        initComponents();
    }                      
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        senhaPF = new javax.swing.JPasswordField();
        entrarBTTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        jLabel1.setText("USUÁRIO");

        userTF.setFont(new java.awt.Font("Segoe UI", 1, 24)); 

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        jLabel2.setText("SENHA");

        senhaPF.setFont(new java.awt.Font("Segoe UI", 1, 24)); 

        entrarBTTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        entrarBTTN.setText("ENTRAR");
        entrarBTTN.addActionListener(evt -> entrarBTTNActionPerformed());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2)))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userTF, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(senhaPF)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(entrarBTTN)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(userTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(senhaPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(entrarBTTN)
                .addGap(40, 40, 40))
        );
        pack();
    }
    private void entrarBTTNActionPerformed() {                                           
        userTF.getText();
        char[]senha = senhaPF.getPassword();
        String convert = String.valueOf(senha);
        int senhaVal = Integer.parseInt(convert);
        if(senhaVal == cd.getSenha() && userTF.getText().equals(cd.getNome())){
            mainUser = "Antonio";
            AcessoOpcoes acesso = new AcessoOpcoes(mainUser,main_saldoUm);
            acesso.setVisible(true);
        }else if(senhaVal == cddois.getSenha() && userTF.getText().equalsIgnoreCase(cddois.getNome())){
            System.out.println(cddois.getNome());
            mainUser = "Ana";
            AcessoOpcoes acesso = new AcessoOpcoes(mainUser,main_saldoDois);
            acesso.setVisible(true);      
        }
        else{
            System.out.println(cddois.getNome());
            JOptionPane.showMessageDialog(null, "USUÁRIO E/OU SENHA INVÁLIDOS!!\nTENTE NOVAMENTE.","ERRO",JOptionPane.ERROR_MESSAGE);
        }
        userTF.setText("");
        senhaPF.setText("");     
    }                                          

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfacePrincipal().setVisible(true);
            }
        });
    }
                                       
}
