import exe3.Produto;

public class MainProduto {
    public static void main(String[] args) {
        // chama construtor sem parametro
        Produto obj1 = new Produto();

        // chama construtor com parametros
        Produto obj2 = new Produto(123, 5, "Bola de basquete", 130f);
        System.out.println(obj1.exibeDetalhes());
        System.out.println(obj2.exibeDetalhes());
        obj2.comprar(3);
        obj2.subir(14);
        obj2.vender(1);
        obj2.abaixarPreco(12);
        System.out.println(obj2.exibeDetalhes());
    }
}
