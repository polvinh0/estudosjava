package Aulas;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome =entrada.nextLine();

        System.out.println("Qual seu nome?");
        String nome2 =entrada.nextLine();

        System.out.println("qual sua idade?");
        int idade = entrada.nextInt();

        System.out.println("qual sua altura ?(m)");
        double altura = entrada.nextDouble();

        System.out.println("qual seu peso?(kg)");
        double peso = entrada.nextDouble();

        //Calcule o IMC = PESO/ALTURA ^ 2
        double imc = peso / Math.pow(altura, 2);

        System.out.println("Ola, meu nome é "+ nome + " e tenho " + idade + " anos");
        System.out.println("Este é o seu IMC = " + imc);
        System.out.printf("este é o seu IMC = %.2f\n", imc);
        System.out.printf("Ola, meu nome é %s %s e tenho %d anos\n", nome, nome2, idade);

        //https://www.calculoimc.com.br/
        if (imc <= 16){
            System.out.println("Muito abaixo do peso");
        } else if (imc>=17 && imc <=18.49){
            System.out.println("Abaixo do peso");
        }else if (imc>=18.5 && imc <=24.99) {
            System.out.println("Peso Normal");
        } else if (imc>=25 && imc <=29.99) {
            System.out.println("Acima do peso");
        } else if (imc>=30 && imc <=34.99) {
            System.out.println("Obesidade 1");
        } else if (imc>=35 && imc <=39.99) {
            System.out.println("Obesidade 2");
        }else {
            System.out.println("Obesidade 3");
        }


        //Switch-case
        System.out.println("Selecione uma dieta (1 a 3)");
        System.out.println("1 - Agua");
        System.out.println("2 - Fruta");
        System.out.println("3 - Batata");
        int dieta = entrada.nextInt();

        switch (dieta){
            case 1:
                System.out.println("Você escolheu a dieta da água!");
                break;//impedir de testar as outras condições
            case 2:
                System.out.println("Você escolheu a dieta da fruta!");
                break;
            case 3:
                System.out.println("Você escolheu a dieta da batata!");
                break;
            default://""else""
                System.out.println("esta dieta não existe!");
        }


        System.out.println("você tem quantos alimentos preferidos?");
        int totalAlimentos = entrada.nextInt();

        for (int i = 0; i < totalAlimentos; i++){
            String alimento = entrada.nextLine();
            System.out.println("Você gosta de " + alimento);
        }

        int i = 0;
            while(i < totalAlimentos) {
            System.out.println(i);
            i++;
        }
    }
}
