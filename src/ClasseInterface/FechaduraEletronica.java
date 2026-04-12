package ClasseInterface;

public class FechaduraEletronica implements IAutenticavel, DispositivoLigavel {
    private boolean autenticado = false;
    private String senhaCorreta = "1234";

    @Override
    public void validarAcesso(String senha) {
        if (this.senhaCorreta.equals(senha)) {
            this.autenticado = true;
            System.out.println("Acesso validado!");
        } else {
            this.autenticado = false;
            System.out.println("Senha incorreta!");
        }
    }

    @Override
    public void ligar() {
        if (autenticado) {
            System.out.println("Fechadura: Destrancada.");
        } else {
            System.out.println("Erro: Precisa validar o acesso antes.");
        }
    }

    @Override
    public void desligar() {
        this.autenticado = false;
        System.out.println("Fechadura: Trancada.");
    }
}