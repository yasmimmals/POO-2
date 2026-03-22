package Revisão;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private int id;
    private String nomeProjeto;
    private List<Programador> equipe;

    public Projeto() {
        this.equipe = new ArrayList<>();
    }

    public Projeto(int id, String nomeProjeto) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
        this.equipe = new ArrayList<>();
    }

    public void adicionarProgramador(Programador p) {
        this.equipe.add(p);
    }

    public void listarEquipe() {
        System.out.println("\n--- Equipe do Projeto: " + this.nomeProjeto + " ---");
        if (equipe.isEmpty()) {
            System.out.println("Nenhum programador alocado ainda.");
        } else {
            for (Programador p : equipe) {
                System.out.println("- " + p.getNome() + " [" + p.getLinguagemPrincipal() + "]");
            }
        }
    }

    @Override
    public String toString() {
        return "Projeto: " + nomeProjeto + " | Total de membros: " + equipe.size();
    }
}