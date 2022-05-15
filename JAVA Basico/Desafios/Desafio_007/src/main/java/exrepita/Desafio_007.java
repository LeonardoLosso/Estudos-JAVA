
package exrepita;

import javax.swing.JOptionPane;

public class Desafio_007 {

    public static void main(String[] args) {
         
//        JOptionPane.showMessageDialog(null, "Olá, imundo!", "lindo eu sou", JOptionPane.ERROR_MESSAGE);   
        int n;
        int soma = 0;
        int totN = 0;
        int pares = 0;
        int impares = 0;
        int mais100 = 0;
        float media = 0;
        
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
            soma += n;
            
            if(n != 0){
                totN++;
            
                if(n % 2 == 0){pares++;}else{impares++;}

                if(n>100){mais100++;}
            }
        }while(n != 0);
        
        media = (float) (soma / totN);
        
        JOptionPane.showMessageDialog(null, String.format("Resultado\n------------\nTotal de valores: %d\nTotal de pares: %d\nTotal de impares: %d\nAcima de 100: %d\n Soma: %d\nMédia dos valores: %.1f", totN, pares, impares, mais100, soma, media));
    }
}
