public class RespostaAleatoria  extends Resposta{
  public String entrada;
  public String resposta;
  public String texto;

  public RespostaAleatoria(String entrada, String resposta){
    super(entrada, resposta);
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
        return resposta;
    }
}
