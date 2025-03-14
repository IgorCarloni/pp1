package exe3;

public class Produto {
    public int id, qtde;
    public String descricao;
    public float preco;

    // criar um objeto produto sem valores
    public Produto(){
        this.descricao = "sem descricao";
    }

    // criar um objeto produto com valores
    public Produto(int id, int qtde, String descricao, float preco){
        this.id = id;
        this.qtde = qtde;
        this.descricao = descricao;
        this.preco = preco;
    }

    // comprar x unidades
    public void comprar(int x){
        this.qtde += x;
    }

    // subir preço do produto em x unidades
    public void subir(float x){
        this.preco += x;
    }

    // abaixar o preço do produto
    public void abaixarPreco(float x){
        if(this.preco >= x){
            this.preco -= x;
        }
        else {
            System.out.println("Preço nao pode ser negativo");
        }
    }

    public void vender(int x){
        if(this.qtde >= x){
            this.qtde -= x;
        }
        else {
            System.out.println("Estoque insuficiente");
        }
    }
    public String exibeDetalhes() {
        return "Produto {" +
                "id = " + this.id +
                ", qtde = " + this.qtde +
                ", descricao = " + this.descricao + '\'' +
                ", preco = " + this.preco +
                '}';
    }
}
