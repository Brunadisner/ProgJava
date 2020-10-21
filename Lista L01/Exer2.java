import java.util.Scanner;


class Autora{
    
    private String nome;
    private int id;

    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    public void setId(int novoId){
        this.id = novoId;
    } 
    public String getNome(){
        return nome;
    }
    public int getId(){
        return id;
    }
    public void carregaDoTeclado(){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome ");
        this.nome = s.nextLine();
        System.out.println("Digite o id ");
        this.id = s.nextInt();


    }

    }

    class Exer2 {

    public static void main(String[] args) {

        Autora autor1 = new Autora();


        autor1.carregaDoTeclado();
        
        
        System.out.println(autor1.getNome());
        System.out.println(autor1.getId());



        



        
    }
    
}
