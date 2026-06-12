package servicos;

public class Ipi implements IImpostos{

    public Ipi(double valor){}
         @Override
    public double calcularValorTotal(double valor) {
        return valor * 1.10;
    }
}
