public abstract class Resposta{
  
  private String entrada;
  private String resposta;
  
  
  
  public Resposta(String entrada, String resposta){
    this.entrada = entrada;
    this.resposta = resposta;

  }
  
  public abstract boolean verifica(String entrada);

  public abstract String produz();
}