package ClasseDeAssociacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// objeto-todo
public class Reserva {
    private int cod, poltrona;
    private LocalDateTime data;
    // associação
    private Passageiro passageiro;
    private Voo voo;

    public Reserva() {
    }

    public Reserva(int cod, int poltrona, LocalDateTime data, Passageiro passageiro, Voo voo) {
        this.cod = cod;
        this.poltrona = poltrona;
        this.data = data;
        this.passageiro = passageiro;
        this.voo = voo;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    @Override
    public String toString() {
        // vamos formatar a data no Brasil
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy' às' HH'h'mm");
        return "Reserva{" +
                "cod=" + cod +
                ", poltrona=" + poltrona +
                ", data=" + data.format(formatoBR) +
                ", passageiro=" + passageiro +
                ", voo=" + voo +
                '}';
    }
}
