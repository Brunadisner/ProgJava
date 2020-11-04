/*
1) Dado o código da classe abaixo:
class BlurayDisc {
private String rotulo;
protected int id;
protected float densidade;
public char[] dados;

public BlurayDisc(String rotulo, int id) {
setIdentificação(rotulo, id);
this.dados = new char[4096];
}
public void setIdentificação(String rotulo, int id) {
this.rotulo = rotulo;
this.id = id;
}
private String getRotulo() {
return this.rotulo;
}
}
Dadas as variáveis abaixo, indique se cada uma dos comandos seguintes funciona. Se houver algum erro nesses
comandos, diga qual é esse erro (e justifique).
BlurayDisc c;
BlurayDisc h = new BlurayDisc("Teste", 1);
String st = "teste";
float num;
a) c.dados[10] = ' i ; Não funciona pois o C não foi criado como um objeto

b) h.setIdentificacao(st, num);Funciona, porém como o num não tem valor atribuido será 0.

c) c.setIdentificacao(12, "Outro rótulo");Não funciona, pois a ordem de passagem dos parametros
está errada, o certo seria primeiro o "outro rotulo" e depois os 12, assim iria funcionar

d) c = new BlurayDisc(); - Funciona

e) h.rotulo = "Outro rótulo"; -Não funciona pois o rotulo é um atributo private.

f) num = 2.34f; - funciona

g) num = h.densidade; - funciona

h) st = h.getRotulo();-Funciona

i)c = new BlurayDisc(st, 234); - Funciona

j) c.dados[100] = "Dado posição 100"; - funciona
*/
