package Revisão;

import java.time.LocalDateTime;

public class TestaClinica {
    public static void main(String[] args){
        Medico med1 = new Medico(1, "Dr. Vinicius", "Cardiologia");

        Paciente pac1 = new Paciente(101, "Yasmim ALves Ferreira", "456.635.108-42");

        LocalDateTime dataConsulta = LocalDateTime.of(2026, 5, 20, 14, 30);

        Consulta consulta1 = new Consulta(dataConsulta, 250.00, med1, pac1);

        System.out.println(consulta1);

    }
}
