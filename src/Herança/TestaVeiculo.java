package Herança;

public class TestaVeiculo {
    public static void exibe(Veiculo referencia){
        referencia.mover(); // Poliformismo;
        referencia.abastecer(); // Poliformismo;
    }
    public static void main(String[] args) {
        // Fazendo a variavel apontar para um objeto FILHO
        System.out.println("--- Testando Avião ---");
        Aviao av1 = new Aviao("Cessna", "172", 220.0f, 3000.0f);
        exibe(av1);
        System.out.println("--- Testando Carro Elétrico ---");
        // Mudando a mesma variavel para apontar para outro objeto
        CarroEletrico ce1 = new CarroEletrico("Tesla", "Model S", 110.0f, 500);
        exibe(ce1);
    }
}

