
package aula12;

public class Aula12 {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c= new Canguru();
        Cachorro k = new Cachorro();
        Cobra o = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();
                
        
        m.setPeso(31.3f);
        m.setCorPelo("marrom");
        m.setMembros(4);
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        a.locomover();
        p.locomover();
        r.locomover();
        
        
        t.locomover();
        k.emitirSom();
        c.locomover();
        
    }
    
}
