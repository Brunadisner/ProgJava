class Data{
    private int hora;
    private int minuto;
    private int segundo;

    public void setHora(int hora) throws ErroHoraNegativa {
        this.hora = hora;
        if(this.hora < 0){
        ErroHoraNegativa erro = new ErroHoraNegativa ();
            throw erro;
        }
    }
    public int getHora(){
        return hora;
    }

    public void setMinuto(int minuto) throws ErroMinutoNegativo {
        this.minuto = minuto;
        if(this.minuto < 0){
            throw new ErroMinutoNegativo();
        }
    }
    public int getMinuto(){
        return minuto;
    }

    public void setSegundo(int segundo) throws ErroSegundoNegativo {
        this.segundo = segundo;
        if(this.segundo < 0){
            throw new ErroSegundoNegativo();
        }
    }
    public int getSegundo(){
        return segundo;
    }
 
}

class ErroHoraNegativa extends Exception {

    public String getMessage() {
        return " Número negativo foi passado como parametro para hora ";
    }

}

class ErroMinutoNegativo extends Exception {

    public String getMessage() {
        return " Número negativo foi passado como parametro para minuto ";
    }

}

class ErroSegundoNegativo extends Exception {

    public String getMessage() {
        return " Número negativo foi passado como parametro para Segundo ";
    }

}

class ExerAula{

    public static void main(String[] args) {
        
        Data d = new Data();
        
        try {
            d.setHora(2);
            d.setMinuto(-35);
            d.setSegundo(-3);
            
        } catch (ErroHoraNegativa e){
            System.out.println(" Parametro errado " + e.getMessage());
        } catch (ErroMinutoNegativo e1){
            System.out.println("Parametro errado " + e1.getMessage());
        } catch (ErroSegundoNegativo e2){
            System.out.println("Parametro errado " + e2.getMessage());
        } catch (Exception e3){
            System.out.println("Erro " + e3.getMessage());
        }
        finally{
            System.out.println(d.getHora() + "h" + d.getMinuto() + "min" +  d.getSegundo() + "s");
        }
    }
}


