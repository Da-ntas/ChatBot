import java.util.Random;
import java.util.ArrayList;

public class RespostaAleatoria  extends Resposta{
  private String entrada;
  private ArrayList<String> resposta;
  private String texto;
  private int selec;

  public RespostaAleatoria(String entrada, ArrayList<String> resposta){
    super(entrada, entrada);
    //this.entrada = entrada;
    this.resposta = resposta;
  }

  public void selecionaRandom(){
    Random gerador = new Random();

    //imprime sequência de 10 números inteiros aleatórios entre 0 e 25
    for (int i = 0; i < 10; i++) {
      this.selec = gerador.nextInt(resposta.size());
    }
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
      selecionaRandom();
      return resposta.get(selec);
    }

}
