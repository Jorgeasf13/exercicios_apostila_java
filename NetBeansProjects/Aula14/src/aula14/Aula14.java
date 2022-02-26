
package aula14;

public class Aula14 {

    public static void main(String[] args) {
        Video v[] = new Video[5];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula de HTML");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Maria", 46, "F", "mari");
        
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0],v[1]); //Jubileu assiste HTML
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[0], v[2]);//Jubileu assiste PHP
        vis[1].avaliar(35.6f);
        System.out.println(vis[1].toString());
        
       /* System.out.println("VIDEOS\n-------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGAFANHOTOS\n-----------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
    }
    
}
