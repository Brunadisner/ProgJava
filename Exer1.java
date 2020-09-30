import java.util.Scanner;

class Autor{

    public String nome;
    public int id;

}

class Exer1{
    public static void main(String[] args) {

        Autor sr = new Autor();

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome do Autor");
        sr.nome = s.nextLine();

        System.out.println("Digite o seu id");
        sr.id = s.nextInt();






        
    }
}