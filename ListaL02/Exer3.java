import java.util.Scanner;

class Retangulo {
    private int base;
    private int altura;

    public Retangulo() {
        this.base = 7;
        this.altura = 4;

    }
    public void setBase(int base){
        this.base = base;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    public int getBase(){
        return base;
    }
    public int getAltura(){
        return altura;
    }
    // Imprime as dimensoes do retangulo
    public void imprimeDimensoes() {
        System.out.println("A base eh: "+getBase());
        System.out.println("A Altura eh: "+getAltura());
    }
}
public class Exer3 {
    public static void main(String[] args) {

        Retangulo r = new Retangulo();
        Scanner s = new Scanner(System.in);
        
        r.imprimeDimensoes();

        System.out.println("Digite o valor da Base do retangulo");
        int base = s.nextInt();
        r.setBase(base);
        System.out.println("Digite o valor da Altura do retangulo");
        int alt = s.nextInt();
        r.setAltura(alt);

        r.imprimeDimensoes();


        
    }
    
}
