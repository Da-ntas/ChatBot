public class RespostaContador  extends Resposta{
  private String entrada;
  private String texto;
  private int cont;

  public RespostaContador(String entrada){
    super(entrada, entrada);
    this.entrada = entrada;
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
      this.cont++;
      return "A contagem é: " + this.cont;
    }

    @Override 
    public String toString(){
     return " "; 
    }
}
