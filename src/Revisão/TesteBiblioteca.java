package Revisão;

import java.time.LocalDate;

public class TesteBiblioteca {
    public static void main(String[] args){
        Leitor l1 = new Leitor(50, "Yasmim Alves");

        Livro b1 = new Livro(10, "Pai Rico, Pai Pobre", "Vinicius");

        LocalDate hoje = LocalDate.now();
        LocalDate devolucao = hoje.plusDays(7);

        Emprestimo emp = new Emprestimo(hoje, devolucao, l1, b1);

        System.out.println(emp);
    }
}
