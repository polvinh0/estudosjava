package poo;

public class Carro {
    String modelo;
    String marca;
    int ano;
    boolean ehFlexx;
    int qtsPortas;
    double combustivelAtual;

    double consumo;
    boolean estaLigado;


    Carro(String modelo, String marca, int ano, boolean ehflex, int qtsPortas, double consumo){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.ehFlexx = ehflex;
        this.qtsPortas = qtsPortas;
        this.combustivelAtual = 30.0;
        this.consumo = consumo; //quantos km por litro
        this.estaLigado = false;
    }


    //Abastecer
    void abastecer (double total){
        this.combustivelAtual += total;
    }

    //Ligar
    void ligar(){
        this.estaLigado = true;
    }
    //Desligar
    void desligar(){
        this.estaLigado = false;
    }
    //viajar
    boolean viajar(String local, double distancia) { // tenta viajar, se conseguir true, senão false
        if (this.estaLigado) {
            this.ligar();

        }
        //Calcula quantos litros erão necessarios para a viagem
        double totalLitros = distancia / this.consumo;

        if(this.combustivelAtual - totalLitros > 0){
            this.combustivelAtual -= totalLitros;
            System.out.println("A viagem para " + local + " aconteceu. Sobrou " + this.combustivelAtual + " L");
            return true;
        }else{
            System.out.println("A viagem não aconteceu, faltou gasolina");
            return false;
        }
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("XY","Ferrari",2019,true,4,40);
        Carro carro2 = new Carro("z","ford",2000,false,2,50);

        System.out.println(carro1.combustivelAtual);
        carro1.abastecer(5);
        System.out.println(carro1.combustivelAtual);
    }
}
