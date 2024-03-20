/*CREATOR
#GitHub - > TonnyThe2nd
#Instagram - > @web_4ntonio
#E-mail - > antoniomarcos3577@gmail.com
#Linkedn - > www.linkedin.com/in/antonio-marcos-sousa-de-oliveira-25b902272*/
public class ClasseComandosUserUm {
    private String USER;
    private int PASSWORD;
    private double saldo;
    private int AGENCIA;
    private int NUMERO_CONTA;

    public ClasseComandosUserUm(String USER, int PASSWORD, double saldo, int AGENCIA, int NUMERO_CONTA){
        this.USER = USER;
        this.PASSWORD = PASSWORD;
        this.saldo = saldo;
        this.AGENCIA =AGENCIA;
        this.NUMERO_CONTA = NUMERO_CONTA;
    }
    public int getSenha(){
        return PASSWORD;
    }
    public String getNome(){
        return USER;
    }
    public double getSaldo(){
        return saldo;
    }
     public double setSaldoSub(double val){
        this.saldo-=val;
        return saldo;
    }
    public double deposito(double val){
        this.saldo+=val;
        return saldo;
    }
    public int getAgencia(){
        return AGENCIA;
    }
    public int getNUM(){
        return NUMERO_CONTA;
    }
}

