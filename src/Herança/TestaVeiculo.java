package Herança;

public class TestaVeiculo {

    public static void main(String[] args) {
        Aviao tecoTeco = new Aviao("Cessna", "172", 220.0f, 3000.0f);
        CarroEletrico tesla = new CarroEletrico("Tesla", "Model S", 110.0f, 500);

        Veiculo v;

        System.out.println("=== TESTE 1: VARIÁVEL ÚNICA ===");
        v = tecoTeco;
        v.mover();

        v = tesla;
        v.mover();
    }
}
