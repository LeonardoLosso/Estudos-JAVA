
package visibildade;

public class Ex_002 {

    public static void main(String[] args) {
        
    //---------CANETA 1-----------
        Caneta c1 = new Caneta();
        c1.modelo = "Esferográfica";
        c1.cor = "Azul";
//        c1.ponta = 0.5f;
        c1.carga = 50;
//        c1.tampada = true;
    //----------------------------
        
        c1.status();
//        c1.rabiscar()
        c1.tampa();
        System.out.println("----------------------");
        c1.status();
        
    }
}
