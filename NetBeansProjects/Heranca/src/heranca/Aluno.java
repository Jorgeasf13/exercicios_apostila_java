/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author Jorge
 */
public class Aluno extends Pessoa {
    //Atributos
    private int matr;
    private String curso;
    
    //Métodos
    public void cancelarMatr(){
        System.out.println("Matrícula será cancelada");
    }
    //Métodos especiais

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
