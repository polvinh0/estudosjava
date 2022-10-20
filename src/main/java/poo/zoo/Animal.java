package poo.zoo;

public interface Animal {
    void dormir();
    void fazerSom();
    void comer(String comida);


}

class Gato implements Animal {
    @Override
    public void dormir(){
        System.out.println("zzzz Miau");}
    @Override
    public void fazerSom(){
        System.out.println("miau");
    }
    @Override
    public void comer(String comida){
        if(comida.equals("Peixe")){
            System.out.println("hmmmm gosto de peixe");
        }else {
            System.out.println("Só como peixe");
        }
    }
    public void ronronar(){
        System.out.println("RRRRRRRR");
    }
}
class Galinha implements Animal {
    @Override
    public void dormir() {
        System.out.println("Có có zzz");
    }

    @Override
    public void fazerSom() {
        System.out.println("Có có có");
    }

    @Override
    public void comer(String comida) {
        System.out.println("Humm có có " + comida);
    }
    public void botarOvo(){
        System.out.println("A new egg was found.");
    }

    static void main(String[] args) {
        Galinha galinha = new Galinha();
        Gato gato = new Gato();

        galinha.fazerSom();
        galinha.dormir();
        galinha.comer("Milho");

        System.out.println("=============");

        gato.fazerSom();
        gato.dormir();
        gato.comer("Peixe");

        // Interface não consigo criar um objeto
        //Animal novoAnimal = new Animal()//não consigo criar pos é interface


    }
}