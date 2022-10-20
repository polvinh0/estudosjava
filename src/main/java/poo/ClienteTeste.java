package poo;

import java.time.LocalDate;

//Encapsulamento->
//Escolhe quais atributos/metodos serão visiveis fora da classe
//public (padrão) -> visivel para todos
//private -> os metodos/atributos são visiveis apenas na classe(arquivo.java dentro do package)
public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1,"José","Carlos", LocalDate.of(1992,1,13),1.72,79);

        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getSobrenome());
        System.out.println(cliente1.getNomeCompleto());
        cliente1.setAltura(50);

    }
}//FIM
