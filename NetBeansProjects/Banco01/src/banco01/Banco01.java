 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco01;

/**
 *
 * @author Jorge
 */
public class Banco01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Maria");
        p2.abrirConta("CP");
        
        
        p1.depositar(300);
        p2.depositar(500);
        p2.sacar(100);
        p1.sacar(1000);
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
    
}
