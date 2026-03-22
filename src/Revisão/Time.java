package Revisão;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private int id;
    private String nome, tecnico;
    private List<Atleta> elenco;

    public Time() {
        this.elenco = new ArrayList<>();
    }

    public Time(int id, String nome, String tecnico) {
        this.id = id;
        this.nome = nome;
        this.tecnico = tecnico;
        this.elenco = new ArrayList<>();
    }

    public void contratarAleta(Atleta a){
        this.elenco.add(a);
        System.out.println(a.getNome() + " foi contratado pelo " + this.nome);
    }

    @Override
    public String toString() {
        return "Time{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", tecnico='" + tecnico + '\'' +
                ", elenco=" + elenco +
                '}';
    }
}
