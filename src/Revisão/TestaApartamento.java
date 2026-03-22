package Revisão;

public class TestaApartamento {
    public static void main(String[] args) {
        Edificio predio = new Edificio("Residencial Franca", "Rua das Flores, 123");

        predio.construirApartamento(101, 1);
        predio.construirApartamento(202, 2);
        predio.construirApartamento(303, 3);

        System.out.println(predio);

        predio = null;

        if (predio == null) {
            System.out.println("O edifício e todos os seus apartamentos foram removidos.");
        }
    }
}
