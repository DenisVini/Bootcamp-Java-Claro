public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();


        System.out.println("TV Ligada? " +smartTv.ligada);
        System.out.println("Canal Atual: " +smartTv.canal);
        System.out.println("Volume atual: " +smartTv.volume);


        smartTv.ligar();
        System.out.println("Novo status - TV Ligada? " +smartTv.ligada);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        
        /*se preferir apenas mudar o canal pelo controle ta configurado.
         *smartTv.mudarCanal(novoCanal); <- Escolha aqui o número do canal que você quer e ela vai mudar sozinha.
         *System.out.println("Canal atual: "+smartTv.canal);
        */
        System.out.println("Volume atual: " +smartTv.volume);
        System.out.println("Canal atual: "+smartTv.canal);
        /*A TV ja está na globo se quiser desligar a TV pode desligar:
          smartTv.desligar();
          System.out.println("Novo status - TV Ligada? " +smartTv.ligada);
        A minha eu vou deixar ligada e vocês??
        */
       }
}
