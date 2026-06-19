package menu;

import javax.swing.JOptionPane;

import servicos.Icms;
import servicos.IImpostos;
import servicos.Ipi;
import servicos.Iss;

public class Menu {

    public void executar() {

        String tipo = JOptionPane.showInputDialog(
                "Digite se é serviço ou produto:");

        String entradaValor =
                JOptionPane.showInputDialog(
                        "Digite o valor:");

        double valor = Double.parseDouble(entradaValor);

        IImpostos iss = new Iss();
        IImpostos icms = new Icms();
        IImpostos ipi = new Ipi();

        JOptionPane.showMessageDialog(null,
                "Valor informado: " + valor +
                "\nISS (5%): " + iss.calcularValorTotal(valor) +
                "\nICMS (18%): " + icms.calcularValorTotal(valor) +
                "\nIPI (10%): " + ipi.calcularValorTotal(valor));
    }
}