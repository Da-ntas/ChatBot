import java.time.LocalDate;
public class RespostaData extends Resposta{

    private String entrada;
    private String texto;
    private LocalDate Obj;

    public RespostaData(String entrada) {
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
        LocalDate Obj = LocalDate.now();
        return "Hoje é: " + Obj;
    }

    @Override 
    public String toString(){
     return " "; 
    }
}