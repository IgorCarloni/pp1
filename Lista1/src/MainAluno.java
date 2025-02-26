import exe1.Aluno;

public class MainAluno {
    public static void main(String[] args) {

        // instancia a classe Aluno -> objeto
        Aluno obj1 = new Aluno(); // chama o construtor

        Aluno obj2 = new Aluno(123, 19, "Dominic", 5.4f, 8.9f);
        System.out.println("Nome: " + obj2.nome + " Média: " + obj2.notaFinal());
    }
}
