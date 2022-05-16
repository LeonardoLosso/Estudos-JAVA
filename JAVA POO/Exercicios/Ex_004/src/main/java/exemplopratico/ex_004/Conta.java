
package exemplopratico.ex_004;
public class Conta {
//==============================================================================    
    
    public int numConta;
    protected char tipo;
    private String titular;
    private float saldo;
    private boolean status;
    
//==============================================================================
    
    public Conta(String t){
        this.setTitular(t);
        this.status = false;
        this.saldo = 0f;
    }
//==============================================================================  
    
    public void abrirConta(char t){
        if(!this.status){
            this.setTipo(t);
            this.setStatus();
            this.setNumConta();
            if(this.tipo == 'c' || this.tipo == 'C'){
                this.setSaldo(50);
            }else{
                this.setSaldo(150);
            }
        }else{
            System.out.println("Conta já aberta");
            this.Status();
        }
    }
    public void fecharConta(){
        if(this.status){
            if(this.saldo > 0){
                System.out.println("Retire o dinheiro antes de fechar a conta");
            }else if(this.saldo < 0){
                System.out.println("Há pendencias na sua conta");
            }else{
                this.setStatus();
            }
        }else{
            System.out.println("Conta já fechada ou inexistente");
        }
    }
    public void depositar(float d){
        if(this.status){
            this.setSaldo(d);
        }else{
            System.out.println("Operação não realizada conta fechada");
        }
    }
    public void sacar(float s){
        if(this.status){
            if(s > this.saldo){
                System.out.printf("Saldo insuficiente!\nSaldo atual: R$%.2f\n", this.getSaldo());
            }else{
                this.setSaldo(-s);
            }
        }else{
            System.out.println("Operação não realizada conta fechada");
        }
    }
    public void pagarMensalidade(){
        if(this.status){
            if((this.tipo == 'c'|| this.tipo == 'C')){
                this.setSaldo(-12);
            }else{
                this.setSaldo(-20);
            }
        }else{
            System.out.println("Operação não realizada conta fechada");
        }
    }
    public void Status(){
        System.out.println("-------------[CONTA]------------\n");
        
        System.out.printf("Número: %4d\n", this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Títular: " + this.getTitular());
        System.out.printf("Saldo: R$%.2f\n", this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        
        System.out.println("\n--------------------------------");
    }
//==============================================================================
    
    protected int getNumConta(){
        return this.numConta;
    }
    private void setNumConta(){
        this.numConta = (int) (1 + Math.random() * (9999 - 1));
    }
//-----------------------------------
    
    protected String getTipo(){
        if(this.tipo == 'C' || this.tipo == 'c'){
            return "Conta corrente";
        }else if(this.tipo == 'p' || this.tipo == 'P'){
            return "Conta poupança";
        }else{
            return "Conta fechada";
        }
    }
    protected void setTipo(char t){
        this.tipo = t;
    }
//-----------------------------------
    
    protected String getTitular(){
        return this.titular;
    }
    private void setTitular(String t){
        this.titular = t;
    }
//-----------------------------------
    
    protected float getSaldo(){
        return this.saldo;
    }
    private void setSaldo(float s){
        this.saldo += s;
    }
//-----------------------------------
    
    protected String getStatus(){
        if(!this.status){
            return "Fechada";
        }else{
            return "Aberta";
        }
    }
    private void setStatus(){
        if(this.status){
            this.status = false;
        }else{
            this.status = true;
        }
    }
}
