package ClasseInterface;

public class TestaSmart {
    public static void main(String[] args) {
        // Testando a Fechadura
        FechaduraEletronica fechadura = new FechaduraEletronica();
        fechadura.validarAcesso("1234");
        fechadura.ligar();

        System.out.println("----------");

        // Testando o Termostato
        TermostatoSmart termostato = new TermostatoSmart();
        termostato.ligar();
        System.out.println("Temperatura: " + termostato.lerTemperatura() + " graus.");
    }
}
