package poo;

import java.util.ArrayList;

public class Pessoa {
    //propiedades/atributos de uma Pessoa
    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;

        ArrayList<Pessoa> conhecidos = new ArrayList<>();
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
    Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = 0;
        this.altura = 0.5;
        this.peso = 2.0;
    }
    //Ações de uma Pessoa(métodos)
    void dizOla() {
        System.out.println("Ola, tudo bem? ");
    }
    void mostrarImc() {
//        double imc = this.peso / (this.altura * this.altura);
        double imc = this.calculaImc();
        System.out.println("O meu IMC é " + imc);
    }
    double calculaImc() { // DEVE retornar um valor
        double imc = this.peso / (this.altura * this.altura);
        return imc;
    }
    void comer(String comida) {
        System.out.println("Estou comendo " + comida);
        this.peso += 1.5;
    }
    void cumprimentar(Pessoa pessoa) {
        this.dizOla();
        pessoa.dizOla();

        if (!this.conhecePessoa(pessoa)){
            this.addPessoaNova(pessoa);
            pessoa.addPessoaNova(this);// this é o objeto que chama a função cumprimitar()
        }
    }
    void addPessoaNova(Pessoa pessoa) {//faz o objeto "conhecer"
        System.out.println(this.nome + " conheceu " + pessoa.nome + "!!!");
        this.conhecidos.add(pessoa);
    }
    boolean conhecePessoa(Pessoa pessoa) {
        //se true a pessoa(this) conhece a outra pessoa
        //se false, não conhece
        return this.conhecidos.contains(pessoa);
    }



}//FIM
