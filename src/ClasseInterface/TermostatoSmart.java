package ClasseInterface;

public class TermostatoSmart implements DispositivoLigavel, SensorTemperatura {
    private boolean ligado = false;

    @Override
    public void ligar() {
        this.ligado = true;
        System.out.println("Termostato ligado.");
    }

    @Override
    public void desligar() {
        this.ligado = false;
        System.out.println("Termostato desligado.");
    }

    @Override
    public double lerTemperatura() {
        if (ligado) {
            return 24.5; // Valor exemplo
        } else {
            System.out.println("Aparelho desligado, sem leitura.");
            return 0.0;
        }
    }
}