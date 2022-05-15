
package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_013 {

    public static void main(String[] args) {
        int vetor[] = {3, 5, 99, 8, 0, 7, 100};
        Scanner teclado = new Scanner(System.in);
//        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
//        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        
//        int i = 0; //para o for each com mais argumentos, count 
//        for(int valor: dias){
//            
//            System.out.printf("O mês %s tem %d dias\n", mes[i], valor);
//            i++;  
//        }
        
        System.out.printf("O meu vetor possui %d casas\nCom inicio em 0 e fim em %d\n", vetor.length, (vetor.length - 1));

        Arrays.sort(vetor);
        
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
        
        System.out.println("Qual elemento quer buscar? ");
        int n = teclado.nextInt();
        
        int posicao = Arrays.binarySearch(vetor, n);
        
        System.out.printf("O valor %d está na posição %d", n, posicao+1);
    }
}
