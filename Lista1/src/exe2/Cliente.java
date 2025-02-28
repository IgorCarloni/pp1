package exe2;

public class Cliente {

    public int numConta, numAgencia;
    public String nome;
    public float saldo;

    public Cliente() {
        this.nome = "sem nome";

    }

    public Cliente(int numConta, int numAgencia, String nome, float saldo) {
        this.numConta = numConta;
        this.numAgencia = numAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void realizarDeposito(float valorDeposito) {
        this.saldo += valorDeposito;
        System.out.println("Deposito realizado com sucesso!");
    }

    public void exibirDetalhes(){
        System.out.println("Num Conta: " + this.numConta + " Nome: " + this.nome + " Saldo: " + this.saldo);
    }

    public void realizarSaque(float valorSaque) {
        if (this.saldo >= valorSaque){
            this.saldo -= valorSaque;
            System.out.println("Saque realizado com sucesso!");
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }
}
