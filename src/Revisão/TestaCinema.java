
package Revisão;

import java.time.LocalDateTime;

public class TestaCinema {
    public static void main(String[] args) {
        Filme f1 = new Filme(1, "Batman", "Ação", 175);
        Filme f2 = new Filme(2, "Duna", "Ficção Científica", 155);

        LocalDateTime dataSessao = LocalDateTime.of(2026, 7, 20, 20, 0);
        Sessao sessaoNoturna = new Sessao(101, dataSessao, 1);

        sessaoNoturna.vincularFilme(f1);

        sessaoNoturna.venderIngresso(501, "A1", "Inteira", 40.0f);
        sessaoNoturna.venderIngresso(502, "A2", "Meia", 20.0f);
        sessaoNoturna.venderIngresso(503, "A3", "Inteira", 40.0f);

        System.out.println(sessaoNoturna);
    }
}