public class RespostaContador  extends Resposta{
  public String entrada;
  public String texto;  

  public RespostaContador(String entrada){
    super(entrada, entrada);
  }

  @Override
    public boolean verifica(String texto){
        if (texto.contains(entrada)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String produz() {
        return entrada;
    }
}
