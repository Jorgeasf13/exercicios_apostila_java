/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomadosistema;





import java.util.Locale;

import java.awt.Dimension;

import java.awt.Toolkit;







/**
 *
 * @author jorge
 */
public class IdiomaDoSistema {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Locale loc = Locale.getDefault(); 
        
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        
        int lar = (int) tela.getWidth();
        int alt = (int) tela.getHeight();
                      
        
        System.out.println("O idioma do seu sistema é: ");
        
        System.out.println(loc.getDisplayLanguage());
                       
        System.out.println(loc.getLanguage());
        
        System.out.println("A resolução da sua tela é: " + lar + " x " +  alt);
        
        
        
    }
    
}
