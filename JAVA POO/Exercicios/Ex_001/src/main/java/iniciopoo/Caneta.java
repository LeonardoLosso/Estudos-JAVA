
package iniciopoo;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Carga: " + this.carga + "%");
        System.out.printf("Ponta: %.1f\n", this.ponta);
        System.out.println("Modelo: " + this.modelo);
    }
    
    boolean utilizavel(){
        if(this.tampada || this.carga < 1){return false;} else{return true;}
    }
    
    void rabiscar(){
        if(utilizavel()){
            System.out.println("~~~~~~~~~~~~");
            this.carga-=10;
        }else{
            System.out.println("##ERRO##");
        }
    }
    
    void tampa(){
        if(this.tampada){
            this.tampada = false;
        }else{
            this.tampada = true;
        }
    }
    
    void escrever(String msg){
        if(utilizavel()){
            System.out.println(msg);
            this.carga -= 5;
        }else{
            System.out.println("##ERRO##");
        }
    }
}
