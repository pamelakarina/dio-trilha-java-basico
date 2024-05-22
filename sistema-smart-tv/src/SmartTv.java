public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    //ligar a tv
    public void ligar (){
        ligada = true;
    }

    public void desligar (){
        ligada = false;
    }

  //mexer no volume
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Abaixando o volume para: " + volume);
    }

    //alterar canal
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }






    }

