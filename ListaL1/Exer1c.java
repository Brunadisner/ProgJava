class BlurayDisc {
    private String rotulo;
    protected int id;
    protected float densidade;
    public char[] dados;
    
    public BlurayDisc(String rotulo, int id) {
        setIdentificação(rotulo, id);
        this.dados = new char[4096];
    }
    public void setIdentificação(String rotulo, int id) {
        this.rotulo = rotulo;
        this.id = id;
    }
    private String getRotulo() {
        return this.rotulo;
    }
    }
public class Exer1c {
public static void main(String[] args) {
    BlurayDisc c;
    BlurayDisc h = new BlurayDisc("Teste", 1);
    //c = new BlurayDisc(rotulo, id);
    String st = "teste";
    float num = "";
    //c.dados[10] = 'i';
    //h.setIdentificacao(st, num);
    System.out.println("teste "+ num);
    
    
}


}
