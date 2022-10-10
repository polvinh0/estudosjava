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
    }
}
