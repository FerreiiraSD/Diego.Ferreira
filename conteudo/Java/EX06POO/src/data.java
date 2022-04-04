import javax.swing.JOptionPane;

public class data {
    
    int dia;
    int mes;
    int ano;

    public data() {}

    public data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    void cadastroDados () {
        dia = Integer.parseInt(JOptionPane.showInputDialog("Dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Mes: "));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
    }

    void imprimeDados () {
        JOptionPane.showMessageDialog(null,+dia+" / "+mes+" / "+ano);
    }
    
}
