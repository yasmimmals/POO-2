package ClasseInterface;

public class CheckOut {
    public static void main(String[] args){
        IPagamento seletor; // objeto do tipo interface

        seletor = new CartaoCredito("11111123156789");
        seletor.autorizar(600); // polimorfismo
        seletor.exibirComprovante(); // polimorfismo

        seletor = new Pix("78945610");
        seletor.autorizar(600); // polimorfismo
        seletor.exibirComprovante(); // polimorfismo
    }
}
