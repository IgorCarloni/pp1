import exe4.Rio;

public class MainRio {
    public static void main(String[] args) {
        Rio obj1 = new Rio();
        Rio obj2 = new Rio("Solimoes", 15, false);
        System.out.println(obj1.exibirDetalhes());
        System.out.println(obj2.exibirDetalhes());
        obj2.poluir();
        obj2.limpar();
        obj2.chover(5);
        obj2.ensolarar(3);
        System.out.println(obj2.exibirDetalhes());
    }
}

