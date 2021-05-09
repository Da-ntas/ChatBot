public abstract class Resposta{
  
  private String entrada;
  private String resposta;
  
  public Resposta(String entrada, String resposta){
    this.entrada = entrada;
    this.resposta = resposta;

  }
  
  public abstract boolean verifica(String texto);

  public abstract String produz();

  public String toString(){
    return " ";
  }
  
}