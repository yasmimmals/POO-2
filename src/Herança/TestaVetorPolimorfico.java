package Herança;

public class TestaVetorPolimorfico {
    public static void main(String[] args) {

        Desenvolvedor[] timeDev = new Desenvolvedor[4];

        timeDev[0] = new Junior("Yasmim", "Python", 4000, "Sênior Paulo");
        timeDev[1] = new Pleno("Vinicius", ".NET", 8500, 10);
        timeDev[2] = new Senior("Geraldo", "JavaScript", 9000, 2000);
        timeDev[3] = new Desenvolvedor("Daniel", "Java", 3000);
        for (Desenvolvedor dev : timeDev) {
            dev.codar();
            System.out.println(dev.toString());
            System.out.println("Bônus: R$ " + dev.calcularBonus());
        }
    }
}
