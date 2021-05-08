import java.time.LocalTime;
public class RespostaHora extends Resposta{

    public String entrada;
    public String texto;
    LocalTime Obj = LocalTime.now();

    public RespostaHora(String entrada) {
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
        return "São: " + Obj;
    }

}