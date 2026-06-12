package servicos;

public class Icms implements IImpostos{
    public Icms(double valor){}

    @Override
    public double calcularValorTotal(double valor) {
        return valor * 1.18;
    }
}
