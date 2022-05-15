
package iniciopoo;

public class Ex_001 {

    public static void main(String[] args) {
        
      //---------CANETA 1-----------
        Caneta c1 = new Caneta();
        c1.modelo = "Esferográfica";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 25;
        c1.tampada = true;
      //----------------------------
      
      c1.tampa();
      c1.escrever("SEXO NA RAVE");
      c1.rabiscar();
      
      c1.status();
      
      
      c1.rabiscar();
      c1.status();
      
      c1.escrever("sou lindo");
      
      c1.carga = 100;
      c1.rabiscar();
      
      c1.status();
      c1.rabiscar(); 
    }
}
