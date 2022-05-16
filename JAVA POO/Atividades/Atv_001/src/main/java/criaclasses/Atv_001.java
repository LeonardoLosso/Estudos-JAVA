package criaclasses;

public class Atv_001 {

    public static void main(String[] args) {
        Carro car1 = new Carro();
        
        car1.status();
        
        car1.comprarCarro("Wolks", "Golf", "Azul", true);
        car1.status();
        
        car1.andar(50);
        car1.status();
        
        car1.abastescer(100);
        car1.andar(50);
        car1.andar(70);
        car1.status();
        
        
    }
}

