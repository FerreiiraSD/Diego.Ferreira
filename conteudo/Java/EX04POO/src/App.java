import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {

        cargo c = new cargo();
        funcionario f = new funcionario();

        JOptionPane.showMessageDialog(null, "Ferreiira's Coorp");

        c.codCargo = Integer.parseInt(JOptionPane.showInputDialog("Cod. Cargo:"));
        c.nomeCargo = JOptionPane.showInputDialog("Cargo:");
        c.cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Carga Horaria:"));

        f.codFunc = Integer.parseInt(JOptionPane.showInputDialog("Cod. Colaborador"));
        f.nomeFunc = JOptionPane.showInputDialog("Nome Colaborador:");
        f.codCargo = c.codCargo;
        f.endFunc = JOptionPane.showInputDialog("Endereço:");
        f.emailFunc = JOptionPane.showInputDialog("E-Mail:");
        f.salarioFunc = Integer.parseInt(JOptionPane.showInputDialog("Salario:"));

        JOptionPane.showMessageDialog(null, "Ferreiira's Coorp\n"+
                                            "\nCargo: " + c.codCargo+" - "+c.nomeCargo+
                                            "\nCarga Horaria: " +c.cargaHoraria+"h");

        JOptionPane.showMessageDialog(null, "Ferreiira's Coorp\n"+
                                            "\nFuncionario: " +f.codFunc+ " - " +f.nomeFunc+
                                            "\nCargo: " + c.codCargo+" - "+c.nomeCargo+
                                            "\nEndereço: " +f.endFunc+
                                            "\nE-mail: " +f.emailFunc+
                                            "\nSalario: R$" + f.salarioFunc);
    }
}
