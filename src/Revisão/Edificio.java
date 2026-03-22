package Revisão;

import java.util.ArrayList;
import java.util.List;

public class Edificio {
    private String nome;
    private String endereco;
    private List<Apartamento> apartamentos;

    public Edificio() {
        this.apartamentos = new ArrayList<>();
    }

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();
    }

    public void construirApartamento(int num, int andar) {
        Apartamento novoApto = new Apartamento(num, andar);
        this.apartamentos.add(novoApto);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    @Override
    public String toString() {
        return "Edifício: " + nome + " | Endereço: " + endereco + " | Unidades: " + apartamentos;
    }
}
