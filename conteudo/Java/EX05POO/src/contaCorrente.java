import javax.swing.JOptionPane;

public class contaCorrente {

    String nome;
    float saldo;
    float limite;
    char tipo;

    public contaCorrente() {}

    public contaCorrente(String nome, float saldo, char tipo) {

        this.nome = nome;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public contaCorrente(String nome, float saldo, float limite, char tipo) {

        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
        this.tipo = tipo;
    }

    
    void cadastrarDados(){

        JOptionPane.showMessageDialog(null, " ** Ferreiira's Bank ** ");
        nome = JOptionPane.showInputDialog("Nome: ");
        saldo = Float.parseFloat(JOptionPane.showInputDialog("Saldo: "));
        limite = (saldo*2);
        tipo = JOptionPane.showInputDialog("Fisico ou Juridico").charAt(0);
    }

    void imprimeDados(){

        JOptionPane.showMessageDialog(null, " ** Ferreiira's Bank ** "+
                                            "\nNome: " +nome + 
                                            "\nSaldo: "+saldo +
                                            "\nLimite de Credito: " +limite+
                                            "\nTipo de conta: " +tipo);

    }
    
    void depositar(float valor){

        valor = Float.parseFloat(JOptionPane.showInputDialog("Valor a Depositar: R$"));
        saldo += valor;
        JOptionPane.showMessageDialog(null, "Valor Disponivel apos Deposito: R$" +saldo);

    }

    void sacar(float valor){

        JOptionPane.showMessageDialog(null, "Valor Disponivel para o Saque: R$" +saldo);
        valor = Float.parseFloat(JOptionPane.showInputDialog("Valor a ser Sacado: R$"));
        saldo -= valor;
        JOptionPane.showMessageDialog(null, "Valor Disponivel apos o Saque: R$" +saldo);

    }
}