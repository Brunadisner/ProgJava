interface Movel { 
    public void moveX(int q); public void moveY(int q);
}
interface Atualizavel { 
    public void atualiza();
}
interface Serializavel { 
    public int[] serializa(); 
    public void deserializa(int[] v); 
}
interface Combativel { 
    public boolean podeCombater(Combativel c); 
}






public class Main {
    public static void main(String[] args) {
        
    }
    
}
