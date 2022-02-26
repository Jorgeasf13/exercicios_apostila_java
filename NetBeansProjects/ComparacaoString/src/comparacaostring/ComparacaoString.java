/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author jorge
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nome1 = "Jorge";
        String nome2 = "Jorge";
        String nome3 = new String("Jorge");
        String res;
        
        res = (nome1.equals(nome3)) ? "Igual":"Diferente";// para objetos se usa "equals"
        
        System.out.println(res);
        
    }
    
}
