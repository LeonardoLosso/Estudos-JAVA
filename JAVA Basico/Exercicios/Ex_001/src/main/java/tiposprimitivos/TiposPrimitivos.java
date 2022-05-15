package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //criei um objeto de leitura
        String nome;
        float nota;
        
        
        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();
        
        System.out.println("Digite sua nota: ");
        nota = teclado.nextFloat();
        
        System.out.format("\n%s, sua nota é %.1f\n ", nome, nota);
        
        
    }
}
/*
    vai ficar esperando uma entrada
ao dar enter confirma a entrada 
*/