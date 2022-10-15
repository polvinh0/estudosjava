package Aulas;

import java.util.ArrayList;

public class EstudoListas {
    public static void main(String[] args) {
        // Cria um novo Arraylist vazio que guarda Integer(APENAS NÃO PRIMITIVAS)
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println(numeros);

        //adicionando elemetos no Array
        numeros.add(10);
        numeros.add(20);
        numeros.add(1000);

        System.out.println(numeros);
        System.out.println(numeros.get(2)); // numeros[2]
        //numeros[0] = 500
        numeros.set(0, 500);

        System.out.println(numeros);
        //remove o elemento na posição 0
        numeros.remove(0);

        System.out.println(numeros);

        numeros.remove(0);

        System.out.println(numeros);
        numeros.add(0, 0);
        numeros.add(1, 10);
        numeros.add(2, 100);

        for (int i = 0; i<numeros.size();i++){
            System.out.println(numeros.get(i));
        }

        System.out.println("-------");
        for (int numero : numeros){ //Para cada valor dentro do array ele execura o codigo
            System.out.println(numero);
        }
        System.out.println(numeros.contains(500));
        System.out.println(numeros.contains(0));
        System.out.println(numeros.indexOf(0));
        System.out.println(numeros.indexOf(1000));
        System.out.println(numeros.indexOf(500));

    }
}
