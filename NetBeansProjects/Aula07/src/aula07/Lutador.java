
package aula07;


public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Métodos públicos
    
    public void apresentar(){
        System.out.println("---------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " +
                this.getNome());
        System.out.println("Diretamente de "+ this.getNacionalidade());
        System.out.println("Idade: "+ this.getIdade());
        System.out.println("Com altura de "+ this.getAltura());
        System.out.println("Pesando: "+ this.getPeso() + " Kg");
        System.out.println("Ganhou: "+ this.getVitorias() + " lutas");
        System.out.println("Perdeu: "+this.getDerrotas() + " lutas");
        System.out.println("Empatou: "+ this.getEmpates());
    }
    public void status(){
        System.out.println("----------------------------------------------");
        System.out.println(this.getNome());
        System.out.println("É um peso "+ this.getCategoria());
        System.out.println(this.getVitorias() +" vitórias");
        System.out.println(this.getDerrotas() +" derrotas");
        System.out.println(this.getEmpates() +" empates");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    //Métodos especiais

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "frango, vai comer, chassi de grilo!";}
        else if (this.peso <= 70.3){
            this.categoria = "leve";
        }
        else if (this.peso <= 83.9){
            this.categoria = "Médio";
        }
        else if (this.peso <= 120.2){
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Obeso não pode lutar!";
        }
        }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    }
    


