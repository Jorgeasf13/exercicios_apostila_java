
package aula11;

public class Aula11 {

    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
               
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Matemática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setCurso("Português");
        b1.setBolsa(50);
        b1.setSexo("M");
        b1.pagarMensalidade();
        System.out.println(a1.toString());
        
        Professor c1 = new Professor();
        c1.setNome("Valmir");
        c1.setSalario(4000f);
        c1.setEspecialidade("TI");
        c1.receberAumento();
        System.out.println(c1.toString());
    }
    
}
