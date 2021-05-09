import java.time.LocalDate;
public class RespostaData extends Resposta{

    private String entrada;
    private String texto;
    LocalDate Obj = LocalDate.now();

    public RespostaData(String entrada) {
      super(entrada, entrada);
      //this.entrada = entrada;
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
        return "Hoje é: " + Obj;
    }

}