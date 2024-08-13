public class SmartTv{

    boolean ligada= false;
    int canal=1;
    int volume=30;


    public void aumentarCanal(){
        System.out.println("Canal:" +canal);
        canal++;
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Canal:" +canal);
    }
     /*Se quiser só escolher o canal. Ta configurado!
      *public void mudarCanal(int novoCanal){
      *   canal = novoCanal; }
      */

    public void aumentarVolume(){
    //volume = volume + 1; outra forma de fazer.
        volume++;
        System.out.println("Aumentando o volume para:" +volume);
    }
    public void diminuirVolume(){
        //volume = volume -1; outra forma de fazer.
            volume--;
            System.out.println("Diminuindo o volume para:" +volume);
        
        }
    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
}
