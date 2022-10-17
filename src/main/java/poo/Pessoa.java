package poo;

public class Pessoa {
    //propiedades/atributos de uma Pessoa
    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;


    Pessoa() { // construtor da classe
        //this -> representa o objeto
        this.nome = "jose";
        this.sobrenome = "almir";
        this.idade = 29;
        this.peso = 55.0;
        this.altura = 1.65;
    }

    Pessoa(String nome, String sobrenome,
           int idade, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    //Ações de uma Pessoa(métodos)
    void dizOla() {
        System.out.println("Ola, tudo bem? ");
    }
}
