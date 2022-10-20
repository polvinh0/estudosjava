package poo.escola;

public class Aluno extends Pessoa {
    private double media;
    //chamada do super deve vir em primeiro
    public Aluno(String nome, String email, String cpf, double media) {
        super(nome, email, cpf);
        this.media = media;
    }
    @Override
    public void seApresentar() {
        super.seApresentar(); // super = Pessoa
        System.out.println("Eu sou um aluno com media = " + media);
    }

    public double getMedia() {
        return media;
    }
}
