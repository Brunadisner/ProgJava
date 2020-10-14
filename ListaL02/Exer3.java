import java.util.Scanner;

class Retangulo {
    private int base;
    private int altura;

    Retangulo(int base, int altura){
        setBase(base);
        setAltura(altura);

    }
    public void imprimeDimensoes() {
        System.out.println("A base eh: "+this.base);
        System.out.println("A Altura eh: "+this.altura);
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
    
}
public class Exer3 {
    public static void main(String[] args) {
        Retangulo r = new Retangulo(7,4);
        Scanner s = new Scanner(System.in);
        
        r.imprimeDimensoes();

        System.out.println("Digite o valor da Base do retangulo");
        //int base = s.nextInt();
        r.setBase(s.nextInt());
        System.out.println("Digite o valor da Altura do retangulo");
        r.setAltura(s.nextInt());

        r.imprimeDimensoes();


        
    }
    
}
