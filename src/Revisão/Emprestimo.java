package Revisão;

import java.time.LocalDate;

public class Emprestimo {
    private LocalDate dataEmprestimo, dataDevolucao;
    private Leitor leitor;
    private Livro livro;

    public Emprestimo() {
    }

    public Emprestimo(LocalDate dataEmprestimo, LocalDate dataDevolucao, Leitor leitor, Livro livro) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.leitor = leitor;
        this.livro = livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                ", leitor=" + leitor +
                ", livro=" + livro +
                '}';
    }
}
