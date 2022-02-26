/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o nome do Aluno: ");
        
        String nome = teclado.nextLine();
        
        System.out.print("Digite a nota: ");
        
        float nota = teclado.nextFloat();
        
        System.out.println("A nota é " + nota);  //método padrão
        
        System.out.printf("A nota de %s é %.2f \n", nome, nota); //segundo método com duas casas decimais
        
        System.out.format("A nota de %s é %.2f \n", nome, nota); // terceiro método
    }
    
}
