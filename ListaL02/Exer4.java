import java.util.Scanner;

class Retangulo {
    private int base;
    private int altura;

    public Retangulo() {
        this.base = 7;
        this.altura = 4;
    }
    public int areaRetangulo(int base, int altura){
        int area;
        area = this.base*this.altura;
        return area;
    }
    
    public int perimetroRetangulo(int base, int altura){
        int perimetro = 2*this.base+2*this.altura;
        return perimetro;
    }

    public double diagonalRetangulo(int base, int altura){
        double diagonal, potencia1, potencia2;
        potencia1  = Math.pow(this.base, 2);
        potencia2 = Math.pow(this.altura, 2);
        double soma = potencia1+potencia2;
        diagonal = Math.sqrt(soma);
        return diagonal;
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
        System.out.println("A area do retangulo eh: "+ areaRetangulo(base, altura));
        System.out.println("A diagonal do retangulo eh: "+ diagonalRetangulo(base, altura));
        System.out.println("O perimetro do retangulo eh: "+ perimetroRetangulo(base, altura));
      
    }
}
public class Exer4 {
    public static void main(String[] args) {

        Retangulo r = new Retangulo();
        Retangulo r1 = new Retangulo();
        Scanner s = new Scanner(System.in);

        //r1.setBase(3);
        /*r1.areaRetangulo();
        r1.diagonalRetangulo(base1, altura1);
        r1.perimetroRetangulo(base1, altura1);
        r1.imprimeDimensoes();*/

        System.out.println("Digite o valor da Base do retangulo");
        int base = s.nextInt();
        r.setBase(base);
        System.out.println("Digite o valor da Altura do retangulo");
        int alt = s.nextInt();
        r.setAltura(alt);
        r.areaRetangulo(base, alt);
        r.diagonalRetangulo(base, alt);
        r.perimetroRetangulo(base, alt);

        r.imprimeDimensoes();


        
    }
    
}
