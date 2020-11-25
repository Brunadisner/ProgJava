import java.util.Vector;
/*6) Implemente uma classe chamada Parser que contenha um método estático analize(). O método deve receber
como parâmetro um vetor de Stringse retornar quantas vezes a palavra "token"ou qualquer outra palavra que
inicie pela letra 'h' aparecem no vetor.*/
class Parser{
    public static int analize(String[] vetor){
        int contT = 0;
        for(int i = 0; i<=vetor.length; i++){
        
            if(vetor[i].equals("token")){
                contT++;
            }
            if(vetor[i].equals("h")){
                contT++;
            }
        }
        return contT;


    }



}

public class Exer6 {
    public static void main(String[] args) {
        
        String vet[] = {"hoje", "bruna","token","token"};
        int p = Parser.analize(vet);
        System.out.println("Aparece: " + p);


    }
    
}
