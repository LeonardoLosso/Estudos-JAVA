
package metodosespeciais;

public class Caneta {
//==ATRIBUTOS
    
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampa;
    
//==MÉTODOS=====================================================================
    
    public Caneta(String m, String c, float p){ //Construtor tem o mesmo nome da classe
        
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.setTampa();
    }
    
    public void status(){
        System.out.println("-----------------------------\n");
        
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampa: " + this.getTampa());
        
        System.out.println("\n-----------------------------");
    }
//--modelo--------------------------
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
//..............................................................................
//--ponta---------------------------
    
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
//..............................................................................
//--cor-----------------------------
    
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
//..............................................................................
//--tampa---------------------------
    
    public String getTampa(){
        if(tampa){return "Tampada";}else{return "Destampada";}
    }
    public void setTampa(){
        if(tampa){
            this.tampa = false;
        }else{
            this.tampa = true;
        }
    }
}
