package poo.escola;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Carlos José","carlos.jose@gmail.com","000",7.5);
        aluno.seApresentar();

        Professor prof = new Professor("joao pedro", "joao@gmail.com","020","TI");
        prof.seApresentar();

        Pessoa p1 = new Pessoa("maria ", "maria@gmail.com","244");
        p1.seApresentar();
        // Aluno é um subclasse de Pessoa, então aluno é uma pessoa tbm
        Pessoa p2 = new Aluno("Carlos José","carlos.jose@gmail.com","000",7.5);
        p2.seApresentar();
        Pessoa p3 = new Professor("joao pedro", "joao@gmail.com","020","TI");
        p3.seApresentar();


    }
}
