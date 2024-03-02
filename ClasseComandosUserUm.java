/*CREATOR
#GitHub - > TonnyThe2nd
#Instagram - > @web_4ntonio
#E-mail - > antoniomarcos3577@gmail.com
#Linkedn - > www.linkedin.com/in/antonio-marcos-sousa-de-oliveira-25b902272*/
public class ClasseComandosUserUm {
    private final String USER = "Antonio";
    private final int PASSWORD = 123;
    private double saldo = 1000;
    private final int AGENCIA = 1234;
    private final int NUMERO_CONTA = 12345678;
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
