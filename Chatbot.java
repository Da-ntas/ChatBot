public class Chatbot {

  private Resposta rs, rh, rd, rc, ra;
  private String respS;
  private String respH;
  private String respD;
  private String respC;
  private String respA;

  public Chatbot(){
    
  }

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
    if(texto.contains("nome")){
      this.respS = rs.produz();
      System.out.println(respS);
    
    }
    else if(texto.contains("dia") ||texto.contains("data") ){
      this.respD = rd.produz();
      System.out.println(respD);

    }
    else if(texto.contains("hora") || texto.contains("horário")){
      this.respH = rh.produz();
    System.out.println(respH);

    }
    else if(texto.contains("contador")){
      this.respC = rc.produz();
      System.out.println(respC);

    }
    else if(texto.contains("piada")){
      this.respA = ra.produz();
      System.out.println(respA);

    }
    else{
      System.out.println("Opção inválida!");
    }
      return "";
  }
}