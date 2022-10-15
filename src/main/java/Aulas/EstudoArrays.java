package Aulas;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EstudoArrays {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};//possui tamanho fixo
        System.out.println(numeros.length);// tamanho do array
        numeros[3] = 1000;
        System.out.println(numeros[3]);
        for (int i = 0; i < numeros.length;i++){
            System.out.println("A posição " + i + " com valor de " + numeros[i]);
        }
        int[] numeros2 = new int [50];
        numeros2[0] = 500;
        numeros2[1] = -200;
        //...
        numeros2[49] = 1;

        double[] notas = new double[5];
        String[] nomes= {"jose", "renato", "victor"};
        String[] sobrenomes = new String[10];

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero");
//        int quantidade


        System.out.println("Digite o total de notas: ");
        int totalNotas = entrada.nextInt();//5


        double[] notasProva = new double[totalNotas];


        for (int i = 0; i < totalNotas;i++) {
            System.out.println("digite o valor da " + (i+1) + "ª nota: ");
            notasProva[i] = entrada.nextDouble();
        }
        double soma = 0.0;
        for(double nota: notasProva) {
            soma += nota;
        }
        double media = soma/totalNotas;
        System.out.println(media);
//        condição ternaria
        String mensagem = (media <7 ) ? "vocÊ está reprovado" : "você está aprovado";
        System.out.println(mensagem);
    }
}
