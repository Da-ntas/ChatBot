public class Chatbot {

  private Resposta rs;
  private Resposta rh;
  private Resposta rd;
  private Resposta rc;
  private Resposta ra;
  private String respS;
  private String respH;
  private String respD;
  private String respC;
  private String respA;

  public void adiciona(Resposta r){
    if(r instanceof RespostaSimples){
      this.rs = r;
    }
    else if(r instanceof RespostaHora){
      this.rh = r;
    }
    else if(r instanceof RespostaData){
      this.rd = r;
    }
    else if(r instanceof RespostaContador){
      this.rc = r;
    }
    else if(r instanceof RespostaAleatoria){
      this.ra = r;
    }
  }

  public String processar(String texto){
    //COMO Q FAZ ESSA DESGRAÇA AQUI
    if(rs.verifica(texto) == true){
      this.respS = rs.produz();
      System.out.println(respS);
    
    }
    else if(rd.verifica(texto) == true){
      this.respD = rd.produz();
      System.out.println(respD);

    }
    else if(rh.verifica(texto) == true){
      this.respH = rh.produz();
    System.out.println(respH);

    }
    else if(rc.verifica(texto) == true){
      this.respC = rc.produz();
      System.out.println(respC);

    }
    else if(ra.verifica(texto) == true){
      this.respA = ra.produz();
      System.out.println(respA);

    }
    else{
      System.out.println("Opção inválida!");
    }
      return "";
  }
}