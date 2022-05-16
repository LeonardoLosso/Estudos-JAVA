
package exemplopratico.ex_004;

public class Ex_004 {

    public static void main(String[] args) {
       
        Conta leo = new Conta("Leonardo Losso");
        Conta bia = new Conta("Beatriz Vespa");
        
        leo.abrirConta('c');
        leo.depositar(500);
        
        
        bia.abrirConta('p');
        bia.sacar(50);
        bia.pagarMensalidade();
        
        leo.sacar(550);
        leo.fecharConta();
        leo.Status();
        bia.Status();
    }
}
