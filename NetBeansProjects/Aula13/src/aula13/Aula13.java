
package aula13;


public class Aula13 {

    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.reagir("Olá");    //Abanar e latir
        c.reagir("Vai apanhar");    //Rosnar
        c.reagir(11, 45);   //Abanar
        c.reagir(21, 00);   //Ignorar
        c.reagir(true);     //Abanar
        c.reagir(false);    //Rosnar e latir
        c.reagir(2, 12.5f); //latir
        c.reagir(17, 4.5f); //Rosnar
        
        
    }
    
}
