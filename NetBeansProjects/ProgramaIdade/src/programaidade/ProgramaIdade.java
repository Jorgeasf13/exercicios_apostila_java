/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu ano de nascimento: ");
         int nasc = teclado.nextInt();
                  
         int ano = LocalDate.now().getYear();
         
         int idade = ano - nasc;
         
         if (idade >= 18){
             System.out.println("Maior de idade");
         }else{
             System.out.println("Menor de idade");
         }
         
        
    }
    
}
