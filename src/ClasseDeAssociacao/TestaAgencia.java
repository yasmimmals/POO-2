package ClasseDeAssociacao;

import java.time.LocalDateTime;

public class TestaAgencia {
    public static void main(String[] args){
        Passageiro pas1 = new Passageiro("456.635.108-42","Yasmim");
        System.out.println(pas1.toString());

        LocalDateTime data = LocalDateTime.of(2026,10, 14,10,15);
        Voo vo1 = new Voo(999, "Guarulhos", "Salvador",data);
        System.out.println(vo1.toString());
        Reserva res1 = new Reserva(890,45,LocalDateTime.now(),pas1, vo1);
        System.out.println(res1);

    }
}
