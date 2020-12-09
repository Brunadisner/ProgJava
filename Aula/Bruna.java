class Personagem{
    private int id;
    private double peso;
    private int altura;
    private String nome;
    private Ferramenta item;

    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public Ferramenta getItem() {
        return item;
    }
    public void setItem(Ferramenta item) {
        this.item = item;
    }
    

}

class Ferramenta{
    private String nome;
    private double peso;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPeso() {
        return peso;
    } 
    public void setPeso(double peso) {
        this.peso = peso;
    }
}

public class Bruna {
    public static void main(String[] args) {
        
    }
    
}
