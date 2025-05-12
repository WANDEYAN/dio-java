public class SmartTv {
    // Atributos da classe
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    // Métodos para ligar e desligar a TV
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    // Métodos para mudar de canal
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    // Métodos para ajustar o volume
    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }
}