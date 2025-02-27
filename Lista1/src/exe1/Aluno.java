package exe1;
public class Aluno {

    public int numAluno, idade;
    public String nome;
    public float p1, p2;

    //construtor
    public Aluno() {
        this.nome = "sem nome";
    }

    public Aluno(int numAluno, int idade, String nome, float p1, float p2) {
        this.numAluno = numAluno;
        this.idade = idade;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }

     //calcula nota final
    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }

    // verifica se o aluno passou
    public String passou(){
        return this.notaFinal() >= 6 ? "Passou" : "Reprovado";
    }

    public void dadosAluno(){
        System.out.println("Nome: " + this.nome + " Num. Aluno: " + this.numAluno + " Situação: " + this.passou());
    }
}
