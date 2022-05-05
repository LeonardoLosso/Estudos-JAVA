package resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDaTela {
    public static void main(String[] args) {
        Dimension tamanho = Toolkit.getDefaultToolkit().getScreenSize();
        
        System.out.println("Sua tela tem tamanho de: " + tamanho.width + "x" + tamanho.height);
    }
}
