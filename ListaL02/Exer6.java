class Circulo {
    private int raio;

   Circulo(int raio) {
        //this.raio = raio;
    }
    void setRaio(int r){
        this.raio = r;
    }
    public int getRaio() {
        return raio;
    }
    double area() {
        double area;
        area = Math.pow(this.raio, 2)*(Math.PI);
        return area;

    }
    double circunf() {
        double c;
        c = 2*(this.raio)*(Math.PI);
        return c;

    }
}

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
    void aumenta(int valor){
        this.base = valor + this.base;
        this.altura = valor+ this.altura;

    }
    void aumentaparaconterCirculo(Circulo circulo){
        
    }
    
    
}
public class Exer6 {
    public static void main(String[] args) {
        
    }
    
}
