package Revisão;

public class TestaMercado {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Arroz 5kg", 25.50);
        Produto p2 = new Produto(2, "Feijão 1kg", 8.90);

        Cliente c1 = new Cliente(10, "Yasmim Alves Ferreira");

        Venda minhaVenda = new Venda(1001, c1);
        minhaVenda.adicionarItem(1, 2, p1);
        minhaVenda.adicionarItem(2, 3, p2);

        System.out.println(minhaVenda);

        minhaVenda = null;

        if (p1 != null && c1 != null) {
            System.out.println("\n--- Prova de Independência ---");
            System.out.println("A venda sumiu, mas o " + p1.getNome() + " e o cliente " + c1.getNome() + " continuam no sistema.");
        }
    }
}