package poo;

public class PessoaTeste {
    public static void main(String[] args) {
        // new -> constrói um NOVO objeto de Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Jose";
        pessoa1.sobrenome = "Almir";
        pessoa1.idade = 29;
        pessoa1.peso = 55.0;
        pessoa1.altura = 1.65;

        pessoa1.dizOla();

        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        System.out.println(pessoa2.nome);

        Pessoa pessoa4 = new Pessoa("pedro",
        "gomes", 36, 1.65, 50);
    }

}
