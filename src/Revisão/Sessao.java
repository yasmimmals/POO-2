package Revisão;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Sessao {
    private int id;
    private LocalDateTime horario;
    private int sala;
    private Filme filme; // Agregação
    private List<Ingresso> ingressos; // Composição

    public Sessao() {
        this.ingressos = new ArrayList<>();
    }

    public Sessao(int id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
        this.ingressos = new ArrayList<>();
    }

    public void vincularFilme(Filme f) {
        this.filme = f;
    }

    public void venderIngresso(int id, String assento, String tipo, float preco) {
        Ingresso novoIngresso = new Ingresso(id, assento, tipo, preco);
        this.ingressos.add(novoIngresso);
    }

    @Override
    public String toString() {
        return "--- DADOS DA SESSÃO ---\n" +
                "ID: " + id + " | Sala: " + sala + "\n" +
                "Horário: " + horario + "\n" +
                (filme != null ? filme : "Nenhum filme vinculado") + "\n" +
                "Ingressos Vendidos: " + ingressos;
    }
}