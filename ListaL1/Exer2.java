import java.util.Scanner;

class Compra {
    private String nomeProduto;
    private float preço;
    private int quantidade;
    
    public Compra(String produto, float preço, int quantidade) {
        setNomeProduto(produto);
        setPreço(preço);
        setQuantidade(quantidade);
    }
    public void setNomeProduto(String novo) {
        this.nomeProduto = novo;

    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setPreço(float preço) {
        this.preço = preço;
    }
    public float getPreço() {
        return preço;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getQuantidade() {
        return quantidade;
    }
    // Imprime todas as propriedades da classe
    public void imprimeResumo() {
        System.out.println("Nome do produto: " + getNomeProduto());
        System.out.println("Preço do produto: " + getPreço());
        System.out.println("Quantidade do produto: " + getQuantidade());
    }
    }

public class Exer2 {
    public static void main(String[] args) {
        java.util.Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome do produto");
        String nome = s.next();
        System.out.println("Digite o preço do produto");
        float preço = s.nextFloat();
        System.out.println("Digite a quantidade do produto");
        int quantidade = s.nextInt();
        
        
        Compra compra1 = new Compra(nome, preço, quantidade);
        compra1.imprimeResumo();
    }
    
}
