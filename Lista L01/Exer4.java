class Compra {
    private String nomeProduto;
    private float preco;
    private int quantidade;


    public void setNomep(String novoNome){
        this.nomeProduto = novoNome;
    }

    public void setPreco(float novoPreco){
        this.preco = novoPreco;
    }

    public void setQuant(int novaQuant){
        this.quantidade = novaQuant;
    }

    public String getNomep(){
        return nomeProduto;
    }

    public float getPreco(){
        return preco;
    }

    public int getQuant(){
        return quantidade;
    }
    public Compra (String produto, float preco, int quantidade) {
        this .nomeProduto = produto;
        this .preco = preco;
        this .quantidade = quantidade;
    }
    
    public Compra (String produto, float preco) {
        this .nomeProduto = produto;
        this .preco = preco;
        this .quantidade = 0 ;
    }
    
    public Compra (String produto) {
        this .nomeProduto = produto;
        this .preco = 5.0f ;
        this .quantidade = 0 ;
    }
    
    public Compra () {
        this .nomeProduto = "Nenhum" ;
        this .preco = 2.0f ;
        this .quantidade = 0 ;
    }
}

public class Exer4 {
    public static void main(String[] args) {

        String nome = "vestido midi";
        float preco = 150;
        int quantidade = 2;
        
        Compra c = new Compra(); Compra c2 = new Compra();

    
        c.setNomep(nome);
        c.setPreco(preco);
        c.setQuant(quantidade);

        System.out.println(c.getNomep());
        System.out.println(c.getPreco());
        System.out.println(c.getQuant());




}
    
}
