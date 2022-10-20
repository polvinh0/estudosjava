package poo;

public class Cachorro extends Pet{
    private String comidaFavorita;
    private String raca;

    public Cachorro(String nome, int idade, double peso, String comidaFavorita, String raca) {

        super(nome, idade, peso);//comando construtor, chamando a classe pai
        this.comidaFavorita = comidaFavorita;
        this.raca = raca;
    }
     @Override
    public void fazerSom() {
         System.out.println("Au au au");
     }


    public static void main(String[] args) {
        //testar herança
        Pet pet1 = new Pet("Rex",1,12);
        pet1.dormir();
        pet1.comer("Ração");
        pet1.fazerSom();
        System.out.println("==============");
        Cachorro bolota = new Cachorro("bolota",2,25.5,"bacon","vira-lata");
        bolota.dormir();
        bolota.fazerSom();
        bolota.comer("pão");
        System.out.println("==================");


    }

}
