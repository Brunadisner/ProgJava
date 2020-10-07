import java.util.Scanner;

class Pessoa{
    private String nome;
    private int idade;
    private float peso;

    public void setIdade(int idade) {
            this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getPeso() {
        return peso;
    }

    public void imprimiDados(){
        System.out.println("Seu nome eh "+getNome());
        System.out.println("Sua idade eh "+getIdade());
        System.out.println("Seu peso eh "+getPeso());



    }

}



public class Exer1 {
    public static void main(String[] args) {
        
        Scanner s  = new Scanner(System.in);

        Pessoa p1 = new Pessoa();
        
        
        System.out.println("Digite o nome: ");
        String nome = s.next();
        p1.setNome(nome);

        System.out.println("Digite a idade: ");
        int idade = s.nextInt();
        p1.setIdade(idade);

        System.out.println("Digite o seu peso");
        float peso = s.nextFloat();
        //lembrar que precisa digitar o número com virgula
        p1.setPeso(peso);

        p1.imprimiDados();

    }
    
}

