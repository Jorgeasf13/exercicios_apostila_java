/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

/**
 *
 * @author Jorge
 */
public class Tecnico extends Aluno{
    protected int registro;
    
    public void praticar(){
        System.out.println(this.nome +" está praticando");
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }
    
    
}
