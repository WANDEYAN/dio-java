public class Usuario {
     public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        System.out.println("A TV está ligada? " + smartTv.ligada);

        smartTv.mudarCanal(10);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.desligar();
        System.out.println("A TV está ligada? " + smartTv.ligada);
     }
}
