package servicos;

public class Icms implements IImpostos{

    @Override
    public double calcularValorTotal(double valor) {
        return valor * 1.18;
    }
}
