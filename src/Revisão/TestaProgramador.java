package Revisão;

public class TestaProgramador {
    public static void main(String[] args) {
        Programador p1 = new Programador(1, "Yasmim Alves", "Java");
        Programador p2 = new Programador(2, "Vinicius", "Python");
        Programador p3 = new Programador(3, "Beatriz", "JavaScript");

        Projeto gestaoAtivos = new Projeto(101, "Sistema de Gestão de Ativos");

        gestaoAtivos.adicionarProgramador(p1);
        gestaoAtivos.adicionarProgramador(p2);
        gestaoAtivos.adicionarProgramador(p3);

        System.out.println("--- Teste de Listagem de Equipe ---");
        gestaoAtivos.listarEquipe();

        System.out.println("\n--- Finalizando o projeto (anulando objeto) ---");
        gestaoAtivos = null;

        if (p1 != null) {
            System.out.println("O projeto acabou, mas a " + p1.getNome() +
                    " continua disponível para novos projetos!");
        }
    }
}