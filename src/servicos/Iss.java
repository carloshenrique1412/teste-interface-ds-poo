package servicos;

public class Iss implements IImpostos {

    public Iss(double valor){
    }
    @Override
    public double calcularValorTotal(double valor) {
        return valor * 1.05;
    }

}