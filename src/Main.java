import servicos.Icms;
import servicos.Ipi;
import servicos.Iss;

import javax.swing.JOptionPane;


void main() {
    String tipo =  JOptionPane.showInputDialog("Digite se é serviços ou produto: ");
    if( tipo.equalsIgnoreCase("serviços")){
        String entradaValor = JOptionPane.showInputDialog("Digite o valor do serviço: ");
        double valor = Double.parseDouble(entradaValor);

        Iss iss = new Iss(valor);
        Icms icms = new Icms(valor);
        Ipi ipi = new  Ipi(valor);

        double resultadoIss = iss.calcularValorTotal(valor);
        double resultadoImcs = icms.calcularValorTotal(valor);
        double resultadoIpi = ipi.calcularValorTotal(valor);

        JOptionPane.showMessageDialog(null, "Valor serviço : "+ valor +
                "\nValor com ISS: " + resultadoIss+
                "\nValor com IMCS: " + resultadoImcs  +
                "\nValor com IPI: " + resultadoIpi
        );

    }else{
        String entradaValor = JOptionPane.showInputDialog("Digite o valor do produto");
        double valor = Double.parseDouble(entradaValor);

        Iss iss = new Iss(valor);
        Icms icms = new Icms(valor);
        Ipi ipi = new  Ipi(valor);

        double resultadoIss = iss.calcularValorTotal(valor);
        double resultadoImcs = icms.calcularValorTotal(valor);
        double resultadoIpi = ipi.calcularValorTotal(valor);

        JOptionPane.showMessageDialog(null, "Valor produto : "+ valor +
                "\nValor com ISS: " + resultadoIss+
                "\nValor com IMCS: " + resultadoImcs  +
                "\nValor com IPI: " + resultadoIpi
        );
    }
    String entradaValor = JOptionPane.showInputDialog("Digite o valor do produto");
    double valor = Double.parseDouble(entradaValor);


}