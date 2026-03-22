package Revisão;

public class TestaAtleta {
    public static void main(String[] args){
        Atleta jogador = new Atleta(7, "Lucas Dias", "ALa-Pivô");

        Time franca = new Time(1, "Sesi Franca Basquete", "Helinho Garcia");
        franca.contratarAleta(jogador);

        System.out.println("Estado atual: " + franca);

        System.out.println("O time foi anulado");
        franca = null;

        if(jogador != null){
            System.out.println("O " + jogador + " continua existindo normalmente!");
        }
    }
}
