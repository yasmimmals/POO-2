public class TestaAcademico {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(1, "Ana Silva", "RA123", "Engenharia");
        Aluno a2 = new Aluno(2, "Bruno Costa", "RA456", "Ciência da Computação");


        Disciplina poo = new Disciplina(101, "Programação Orientada a Objetos", "Dr. Alan Turing");

        poo.matricularAluno(a1);
        poo.matricularAluno(a2);


        poo.criarAvaliacao(1, "Prova Semestral");



        poo.getAvaliacao(0).adicionarQuestao(1, "O que é Polimorfismo?", 3.5f);
        poo.getAvaliacao(0).adicionarQuestao(2, "Explique a diferença entre Agregação e Composição.", 3.5f);
        poo.getAvaliacao(0).adicionarQuestao(3, "Implemente uma classe Singleton.", 3.0f);


        System.out.println(poo.toString());
    }
}