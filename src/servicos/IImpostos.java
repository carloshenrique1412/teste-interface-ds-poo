package servicos;

public interface IImpostos {

    double ICMS = 0.18;
    double ISS = 0.05;
    double IPI = 0.10;

    public double calcularValorTotal(double valor);

}