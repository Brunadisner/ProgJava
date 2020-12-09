import java.util.List;

public class GuardaNumeros
{
  private List<Integer> numeros;
  
  public GuardaNumeros()
  {
    this.numeros = new ArrayList<Integer>();
  }

  public addicionaNumero(int num)
  {
    numeros.add(num);
  }

  public float getMedia()
  {
    float media = 0;
    for(int num : numeros)
    {
      media += (float) num;
    }

    media /= numeros.lenght;
    return media;
  }
  public void printaNumeros()
  {
      for(int num : numeros)
      {
          System.out.println(num);
      }
  }

  public int getMaior()
  {
    int maior = numeros.get(0);
    for(int num : numeros)
    {
        if(maior < num)
            maior = num;
    }
    return maior;
  }

  public int getMenor()
  {
    int menor = numeros.get(0);
    for(int num : numeros)
    {
        if(menor < num)
            menor = num;
    }
    return maior;
  }
  public int getPrimos()
  {
    int cont=0;
    for(int num : numeros){
        for (int j = 2; j < num;j++) {
            if(ehPrimo(numero))
                cont++;
        }
    

                 
    }
    return cont;
  }

  public int getDiv(){
      
  }



  public boolean ehPrimo(int numero) {
    for (int j = 2; j < numero; j++) {
        if (numero % j == 0)
            return false;   
        }
        return true;
    }
  
}
class At{
    public static void main(String[] args) {
        
    }
}
