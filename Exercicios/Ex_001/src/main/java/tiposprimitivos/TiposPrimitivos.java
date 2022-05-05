package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //criei um objeto de leitura
        String nome;
        float nota;
        
        //System.out.println("Sua nota é: " + nota);
        //System.out.printf("%s, sua nota é %.2f\n", nome, nota); //posso trocar o printf por format
        
        //System.out.print("Digite o nome do aluno: ");
        nome = teclado.nextLine();
        
        //System.out.print("Digite a nota do aluno: ");
        nota = teclado.nextFloat();
        
        System.out.format("\n%s, sua nota é %.1f\n ", nome, nota);
        
        
    }
}
/*
    vai ficar esperando uma entrada
ao dar enter confirma a entrada 
*/