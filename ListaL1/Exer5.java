import java.util.Scanner;

class Autor {
    private String nome;
    private int id;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }

}
    
class Post{
    private Autor autor;
    private String texto;

    public Post(){
        this.autor = new Autor();
    }

    public void setAutor(Autor autor){
        this.autor = autor;
        
    }
    public void setTexto(String texto){
        this.texto = texto;
    }
    public Autor getAutor() {
        return autor;
    }
    public String getTexto() {
        return texto;
    }

    // Imprime todas as propriedades da classe no formato:
    public void imprimeResumo() {
        System.out.println("Nome do autor é: "+ this.autor.getNome());
  		System.out.println("O ID é "+ this.autor.getId());
        System.out.println("Texto: "+ this.texto);
        
    }
}





public class Exer5 {
    public static void main(String[] args) {
        Autor autor = new Autor();
        Post post = new Post();
        java.util.Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome do autor:");
        autor.setNome(s.next());
        System.out.println("Digite o id:");
        autor.setId(s.nextInt());
        post.setAutor(autor);
        System.out.println("Digite o texto:");
        post.setTexto(s.next());
        post.imprimeResumo();
    

    }
    
}
