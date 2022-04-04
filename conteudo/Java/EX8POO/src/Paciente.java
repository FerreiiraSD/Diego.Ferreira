import javax.swing.JOptionPane;

public class Paciente {

    String nome;
    String rg;
    String endereco;
    String telefone;
    int anoNascimento;
    String profissao;


    public Paciente() {}

    public Paciente(String nome, String rg, String endereco, String telefone, int anoNascimento, String profissao) {

        this.nome = nome;
        this.rg = rg;
        this.endereco = endereco;
        this.telefone = telefone;
        this.anoNascimento = anoNascimento;
        this.profissao = profissao;
    }

    void cadastraDados(){

        nome = JOptionPane.showInputDialog("Nome: ");
        rg = JOptionPane.showInputDialog("RG: ");
        endereco = JOptionPane.showInputDialog("Endereço: ");
        telefone = JOptionPane.showInputDialog("Telefone: ");
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Ano Nascimento: "));
        profissao = JOptionPane.showInputDialog("Profissao: ");
    }

    void imprimeDados(){

        JOptionPane.showMessageDialog(null, "UNICSUL - Universidade Cruzeiro do Sul"+
                                            "\nNome: " +nome+
                                            "\nRG: " +rg+
                                            "\nEndereço: R$" +endereco+
                                            "\nNascimento: " +anoNascimento+
                                            "\nProfissão: " +profissao);

    }

    int calculaIdade(int anoAtual){

        Integer.parseInt(JOptionPane.showInputDialog("Que ano estamos? "));
        anoAtual += anoNascimento;
        
        return anoAtual;
        
    }
    
}
