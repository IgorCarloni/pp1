import javax.swing.*;

public class Carro {
    // variaveis
    // tipo de dados primitivos
    public int ano;
    public float velocidade;

    // tipo de dado é uma classe
    public String marca, modelo;

    // metodos construtores
    // sem parametro
    public Carro() {
        this.marca = "Vazia";
        this.modelo = "Vazio";
    }

    public Carro(int ano, float velocidade, String marca, String modelo) {
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }

    // metodos
    public void exibirDetalhes() {
        // this representa o objeto que chama o metodo
        JOptionPane.showMessageDialog(null, "Marca: " + this.marca + "\nModelo: " + this.modelo + "\nAno: " + this.ano + "\nVelocidade: " + this.velocidade);
    }

    public void acelerar(float x) {
        this.velocidade = this.velocidade + x;
    }

    public void frear(float y) {
        if (this.velocidade - y >= 0) {
            this.velocidade = this.velocidade - y;
        } else {
            JOptionPane.showMessageDialog( null, "Não freou, bateu a: " + this.velocidade);
        }
    }
}
