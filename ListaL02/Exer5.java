import java.util.Scanner;

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
class Exer5{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Escreva o valor do raio");
        int raio = s.nextInt();


        Circulo r1 = new Circulo(raio);
        r1.setRaio(raio);
        r1.getRaio();
        

        System.out.println("O valor da area eh " + r1.area());
        System.out.println("O valor da circunferencia eh " + r1.circunf());




        
    }
}