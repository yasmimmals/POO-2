import javax.xml.crypto.Data;
import java.util.Date;

public class TestaCliente {
    public static void main(String[] args){
        // CLIENTE É INDEPENDENTE DO PEDIDO
        Cliente cl1 = new Cliente(100, "Fulano", "123", "Rua 10");
        Date data = new Date();
        Pedido pedido = new Pedido(180, data, cl1);
        Produto prod = new Produto(1, "Notebook", "Lenovo", 1000000);
        Produto prod2 = new Produto(2, "Mouse", "óptico", 200);
        pedido.adicionaItemPedido(1, 3, prod);
        pedido.adicionaItemPedido(12, 2, prod2);

        System.out.println(pedido.toString());
    }
}
