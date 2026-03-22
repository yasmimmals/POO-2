package Revisão;

public class Computador {
    private int id;
    private String marca;
    private Processador cpu;

    public Computador() {}

    public Computador(int id, String marca, String marcaCPU, String modeloCPU, double freqCPU) {
        this.id = id;
        this.marca = marca;
        this.cpu = new Processador(marcaCPU, modeloCPU, freqCPU);
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public Processador getCpu() { return cpu; }
    public void setCpu(Processador cpu) { this.cpu = cpu; }

    @Override
    public String toString() {
        return "Computador{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", cpu=" + cpu +
                '}';
    }
}