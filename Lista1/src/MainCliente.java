import exe2.Cliente;

public class MainCliente {
    public static void main(String[] args) {

        Cliente obj1 = new Cliente(421, 114, "Max", 25.0f);
        obj1.realizarDeposito(1000);
        obj1.realizarSaque(300);
        obj1.exibirDetalhes();

        Cliente obj2 = new Cliente(123, 456, "Julios", 300.0f);
        obj2.realizarDeposito(1500);
        obj2.realizarSaque(175);
        obj2.exibirDetalhes();
    }
}
