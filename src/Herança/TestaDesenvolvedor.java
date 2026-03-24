package Herança;
public class TestaDesenvolvedor {
    public static void exibir(Desenvolvedor camaleao){
        camaleao.codar(); // polimorfismo
        System.out.println(camaleao.toString() + " Bônus " + camaleao.calcularBonus()); // polimorfismo
    }
    public static void main (String[] args){
        // criar um objeto Desenvolvedor
        Desenvolvedor dev1 = new Desenvolvedor();

        // criar um junior
        Junior jr1 = new Junior("Fulano", "Java", 4000, "Beltrano");
        exibir(jr1);
        // cria um pleno
        Pleno pl1 = new Pleno("Beltrano", "Java", 5000,5);
        exibir(pl1);
        // cria um senior
        Senior sr1 = new Senior("Ciclano","Java", 6000,3000);
        exibir(sr1);

    }
}
