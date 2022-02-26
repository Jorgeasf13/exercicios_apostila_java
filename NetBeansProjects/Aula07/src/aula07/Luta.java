package aula07;
import java.util.Random;

public class Luta {
    //atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;
    
    //métodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if ((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)){
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
        
    }
    public void Lutar(){
        if (this.aprovado){
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            Random ran = new Random();
            int x = ran.nextInt(3);
            switch (x){
                    case 0:
                        System.out.println("######RESULTADO DA LUTA#####");
                        System.out.println("Empate");
                        this.desafiado.empatarLuta();
                        this.desafiante.empatarLuta();
                        break;
                    case 1:
                        System.out.println("######RESULTADO DA LUTA#####");
                        System.out.println("O "+ this.desafiado.getNome() +" venceu");
                        this.desafiado.ganharLuta();
                        this.desafiante.perderLuta();
                        break;
                    case 2:
                        System.out.println("######RESULTADO DA LUTA#####");
                        System.out.println("O "+ this.desafiante.getNome() +" venceu");
                        this.desafiado.perderLuta();
                        this.desafiante.ganharLuta();
                        break;
            }
        }else{
            System.out.println("Essa luta não pode acontecer");
        }
    }
    //métodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador dt) {
        this.desafiante = dt;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
}
