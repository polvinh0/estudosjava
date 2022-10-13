import java.sql.Struct;
import java.util.Scanner;

public class EstudoStrings {
    public static void main(String[] args) {
        //Strings são cadeias de caracteres
        //"jose" -> J, O, S, E

        String nome = "Pedro";

        if (nome == "Pedro "){
            System.out.println("são iguais");
       }
        System.out.println("Digite seu Sobrenome: ");
        Scanner entrada = new Scanner(System.in);
        String sobrenome = entrada.nextLine();

        if(sobrenome == "Pereira") {
            System.out.println("São Iguais");
        }else {
            System.out.println("são diferentes");
        }
        if(sobrenome.equals("Pereira")) {//equals compara o CONTEUDO das strings
            System.out.println("São Iguais");
        }else {
            System.out.println("são diferentes");
        }

        // spbrenome.equalsIgnoreCase("pereira"); // IGNORA maiusculo e minusculo

        //Outros metodos
        String java = "Java";
        String ja = java.substring(0, 2);// começa do 0 e vai ate o 2(não incluso)
        String va = java.substring(2);// corta do 2 ate o final da string

        System.out.println(ja);
        System.out.println(va);

    }
}
