
package visibildade;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga = 100;
    private boolean tampada = true;
    
    protected void status(){
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Carga: " + this.carga + "%");
        System.out.printf("Ponta: %.1f\n", this.ponta);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Está utilizavel? " + this.utilizavel());
    }
    
    private boolean utilizavel(){
        if(this.tampada || this.carga < 1){return false;} else{return true;}
    }
    
    protected void rabiscar(){
        if(utilizavel()){
            System.out.println("~~~~~~~~~~~~");
            this.carga-=10;
        }else{
            System.out.println("##ERRO##");
        }
    }
    
    protected void tampa(){
        if(this.tampada){
            this.tampada = false;
        }else{
            this.tampada = true;
        }
    }
    
    protected void escrever(String msg){
        if(utilizavel()){
            System.out.println(msg);
            this.carga -= 5;
        }else{
            System.out.println("##ERRO##");
        }
    }
}
