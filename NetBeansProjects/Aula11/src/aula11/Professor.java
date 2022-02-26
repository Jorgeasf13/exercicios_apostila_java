
package aula11;


public class Professor extends Pessoa{
    protected String especialidade;
    protected float salario;
    
    public void receberAumento(){
        this.salario += 500;
        System.out.println(this.getSalario());
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" + "especialidade=" + especialidade + ", salario=" + salario + '}';
    }
    
    
}
