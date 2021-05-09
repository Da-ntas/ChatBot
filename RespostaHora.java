import java.time.*;
public class RespostaHora extends Resposta{

    private String entrada;
    private String texto;
    ZoneId zid = ZoneId.of("America/Sao_Paulo");
    LocalTime Obj = LocalTime.now(zid);

    public RespostaHora(String entrada) {
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
      LocalTime Obj = LocalTime.now(zid);
      return "São: " + Obj;
    }

}