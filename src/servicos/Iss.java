package servicos;

public class Iss implements IImpostos {

    @Override
    public double calcularValorTotal(double valor) {
        return valor * 1.05;
    }

}