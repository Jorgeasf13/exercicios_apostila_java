/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;



/**
 *
 * @author jorge
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // iniciar as variáveis que serão mostradas na mensagem
        int num, media, soma = 0;
        int totVal = 0;
        int totPar = 0;
        int totImp = 0;
        int acCem = 0;
        
          //laço de repetição   
        do{
           num = Integer.parseInt(JOptionPane.showInputDialog(null, 
                   "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
          
           soma += num;//soma total
           
           
           //numeros pares totais
           if(num % 2 ==0){
           totPar++;
           }else{totImp++;} //numeros impares totais
           if(num > 100){   //acima de 100
               acCem++;
           }
           // total de valores
           if(num != 0){
               totVal++;
           }
           media = soma/totVal;
           
           
        }while(num !=0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final<br><hr>"
                + "<br>Total de valores: "+ totVal
                + "<br>Total de pares: " + totPar
                + "<br>Total de ímpares: "+ totImp
                + "<br>Acima de 100: "+ acCem
                + "<br>Média dos valores: "+ media);
        
       
        
        
    }
    
}
