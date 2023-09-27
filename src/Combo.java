public class Combo {
    private Burguer Burguer = new Burguer();
    private Sobremesa Sobremesa = new Sobremesa();

    private Bebida Bebida = new Bebida();

    public void CriarCombo (int tipo)
    {
if ( tipo == 1) {
    Burguer.setGramas(200);
    Burguer.setDescricao("Carne");
    Burguer.setPreco(1);
    Sobremesa.setTamanho("Grande");
    Sobremesa.setDescricao("Chocolate");
    Sobremesa.setPreco(2);
    Bebida.setMl(100);
    Bebida.setDescricao("Laranja");
    Bebida.setPreco(3);

    }
if ( tipo == 2) {
    Burguer.setGramas(500);
    Burguer.setDescricao("Carne");
    Burguer.setPreco(4);
    Sobremesa.setTamanho("Gigante");
    Sobremesa.setDescricao("Chocolate");
    Sobremesa.setPreco(4);
    Bebida.setMl(200);
    Bebida.setDescricao("Laranja");
    Bebida.setPreco(6);

}


}
@Override
public String toString() {

        String retorno = "Burguer; " + Burguer.getDescricao() + "Peso: " + Burguer.getGramas() + "Gramas: " + Burguer.getPreco() + "\r\n";
        retorno += "Bebida: " + Bebida.getDescricao() + "Ml: " + Bebida.getMl() + "Valor: " + Bebida.getPreco() + "\r\n";
        retorno += "Sobremesa: " + Sobremesa.getDescricao() + "Tamamanho: " + Sobremesa.getTamanho() + "Valor: " + Sobremesa.getPreco() + "\r\n";
        return retorno;

}


}
