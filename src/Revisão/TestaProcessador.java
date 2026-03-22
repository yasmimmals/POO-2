package Revisão;

public class TestaProcessador {
    public static void main(String[] args) {
        Computador meuPC = new Computador(1, "Dell", "Intel", "i7", 4.8);

        System.out.println(meuPC);

        meuPC = null;

        if (meuPC == null) {
            System.out.println("O computador e o processador foram removidos.");
        }
    }
}