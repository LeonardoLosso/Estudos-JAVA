
package criaclasses;

public class Carro {
//--------------------------------------ATRIBUTOS-------------------------------
//---------DEFINIÇOES-DE-COMPRA---------
    private String marcaCarro = "";
    private String modeloCarro = "";
    private String corCarro = "";
    
//------------CARRO-COMPLETO------------    
    private boolean carroCompleto;
        private boolean arCondicionado = carroCompleto;
            private boolean arLigado = carroCompleto;
        private boolean freioAbs = carroCompleto;
//--------------------------------------
    private boolean andando;
    private int gas;
    private int vel;
//------------------------------------------------------------------------------
//--------------------------------------MÉTODOS---------------------------------
    protected void status(){
        System.out.println("\n-------------------------------");
        
        System.out.println("Marca: " + this.marcaCarro);
        System.out.println("Modelo: " + this.modeloCarro);
        System.out.println("Cor: " + this.corCarro);
        
        System.out.println("Completo? " + this.carroCompleto);
        System.out.println("Ar condicionado? " + this.arCondicionado);
        System.out.println("Ar ligado? " + this.arLigado);
        System.out.println("Freio ABS nas 4 rodas? " + this.freioAbs);
        
        System.out.println("Andando: " + this.andando);
        System.out.println("Gasolina: " + this.gas);
        System.out.println("Velocidade: " + this.vel);
        
        System.out.println("-------------------------------\n");
    }
    
    protected void comprarCarro(String marca, String modelo, String cor, boolean completo){
        System.out.println("Marca escolhida: " + (this.marcaCarro = marca));
        System.out.println("Modelo: " + (this.modeloCarro = modelo));
        System.out.println("Cor escolhida: " + (this.corCarro = cor));
        System.out.println("Carro completo? " + (this.carroCompleto = completo));
        
        this.arCondicionado = this.carroCompleto;
        this.arLigado = this.carroCompleto;
        this.freioAbs = this.carroCompleto;
    }
    
    protected void abastescer(int gasolina){
        System.out.printf("## Abasteceu: %dL ##\n", (this.gas = gasolina));
    }
    
    protected void andar(int velocidade){
        if((this.gas > 0) && (!this.andando)){
            this.andando = true;
            
            System.out.printf("Carro andando a %d Km/h\n", (this.vel = velocidade));
        }else{
            if(this.gas < 1){
                System.out.println("O carro está sem gasolina!");
            }else if(this.andando){
                System.out.printf("Velocidade alterada para: %d Km/h\n", (this.vel = velocidade));
            }
        }
    }
 }
