package Revisão;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private int id;
    private Cliente cliente; // Agregação
    private List<ItemVenda> itens; // Composição

    public Venda() {
        this.itens = new ArrayList<>();
    }

    public Venda(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(int idItem, int qtd, Produto p) {
        ItemVenda novoItem = new ItemVenda(idItem, qtd, p);
        this.itens.add(novoItem);
    }

    public double calcularTotalVenda() {
        double total = 0;
        for (ItemVenda item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Venda ID: " + id + "\n" + cliente + "\nItens: " + itens +
                "\nTOTAL: R$ " + calcularTotalVenda();
    }
}