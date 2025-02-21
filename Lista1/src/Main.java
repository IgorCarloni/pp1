//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // criando objetos da classe Carro
        // instanciar a classe Carro
        Carro obj1 = new Carro();
        obj1.ano = 2015;
        obj1.velocidade = 0.0f;
        obj1.marca = "Chevrolet";
        obj1.modelo = "Onix";
        obj1.exibirDetalhes();
        obj1.acelerar(50.0f);
        obj1.frear(60.0f);
        obj1.exibirDetalhes();

        Carro obj2 = new Carro(2018, 30.0f, "Volks", "Jetta");
        obj2.exibirDetalhes();
        obj2.acelerar(60.0f);
        obj2.exibirDetalhes();
        obj2.frear(30.0f);
        obj2.exibirDetalhes();

        Carro obj3 = new Carro();
        obj3.exibirDetalhes();

    }
}