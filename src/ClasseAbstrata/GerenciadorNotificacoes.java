package ClasseAbstrata;

import Herança.Desenvolvedor;

import java.util.ArrayList;

public class GerenciadorNotificacoes {

    public static void main(String[] args) {
        ArrayList<CanalNotificacao> canais = new ArrayList<>();

        CanalNotificacao email1 = new Email("Yasmim", "Aula sobre POO", "Você está tendo aula sobre Classes Abstratas");
        CanalNotificacao Sms1 = new Sms("Sofia", "Vamos gravar um video", 993923510);
        CanalNotificacao Wpp1 = new Whatsapp("Hugo", "Vamos jogar truco", "Enviado");

        canais.add(email1);
        canais.add(Sms1);
        canais.add(Wpp1);

        for (CanalNotificacao c : canais){
            c.enviar();
            c.toString();
        }
    }
}
