
package dowhile;

import java.util.Scanner;

public class Ex_012 {

    public static void main(String[] args) {
        
        int numero;
        int soma = 0;
        Scanner teclado = new Scanner(System.in);
        String resposta;
        
        do{
            System.out.println("Digite um numero:");
            numero = teclado.nextInt();
            
            soma += numero;
            
            System.out.println("Quer continuar? [S/N]");
            resposta = teclado.next();
        }while(resposta.equals("S") || resposta.equals("s"));
        
        System.out.printf("\nA soma dos valores é: %d\n", soma);
    }
}
