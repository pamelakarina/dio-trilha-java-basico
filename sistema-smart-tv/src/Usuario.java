public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(18);


        System.out.println("Tv está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " +  smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo status: Tv está ligada? " + smartTv.ligada);

        smartTv.desligar ();
        System.out.println("Novo status: Tv está ligada? " + smartTv.ligada);

        


    


    }
}
