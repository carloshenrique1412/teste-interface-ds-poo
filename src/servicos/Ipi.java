package servicos;

public class Ipi implements IImpostos{

         @Override
    public double calcularValorTotal(double valor) {
        return valor * 1.10;
    }
}
