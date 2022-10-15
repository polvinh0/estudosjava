package Aulas;

public class Variaveis {
    public static void main(String[] args){
        System.out.println("Hello, World!"); //Equivalente ao console.log

        // Variáveis no Java
        // fortemente tipado e estaticament tipado(tipado de tipo)
        int idade = 20; // numero inteiro ate 2 bilhoes
        double salario = 5600.54; // dupla precisão
        float nota = 7.5f; // o F apos o sufixo é obrigatorio para o float
        long populacaoTerra = 79000000000l; //o L apos o sufixo é obrigatorio para o long
        boolean tarefaConcluida = false; // (true or false)
        String nomeCompleto = "Daniel Assis"; // sempre aspas duplas

        int teste = 10;
        teste = 9; // reatribuição de variaveis

        final int teste2 = 100; // final = const
        //teste2 = 130;

       //Operadores
       int a = 10;
       int b = 5;

       int soma = a + b; //15
       int subtacao = a - b;//5
       int multiplicacao = a * b;//50
       int divisao = a / b ;//2

       System.out.println("o Resultado da soma é " + soma); // "o resultado da soma é 15"
        //divisão entre dois INT sera um numero inteiro
        int sete =7;
        int dois = 2;
        double dois2 = 2.0;
        System.out.println(sete / dois);
        System.out.println(sete / dois2);


        //Math
        double x = Math.sqrt(144);// 12
        double y = Math.pow(5,2);// 25
        //Math.PI
        double resultado3 = sete / (double) dois;

        //Operadores 2
        int valor = 5;
        valor++;
        valor--;
        valor+=10; //valor = valor+10

        //Operadores relacionais
        boolean teste1 = 5>1; //true
        boolean teste3 = 5>1; //false
        boolean teste4 = 5==5; //true
        boolean teste5 = 5!= 1; //true
        boolean teste6 = 6>=5; //true
        boolean teste7 = 5<=9; //true

        //Operadores logicos
        boolean teste8 = true && false; //false
        boolean teste9 = true || false; //true
        boolean teste10 = (5>10)&&(10<5);// false
        boolean teste11 = (10>=0)||(1<5); //true
        boolean teste12 = (5>1);//true
        boolean teste13 = !teste12;//false
    }
}

