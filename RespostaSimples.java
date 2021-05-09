public class RespostaSimples extends Resposta{

    private String entrada;
    private String resposta; 
    private String texto;

    
    
    public RespostaSimples(String entrada, String resposta) {
      super(entrada, resposta);
      this.entrada = entrada;
      this.resposta = resposta;
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