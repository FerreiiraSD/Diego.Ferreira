import javax.swing.JOptionPane;

public class Curso {
    
    String nome;
    int quantidadeAlunos;
    String turma;
    float mensalidade;

    public Curso() {}

    public Curso(String nome, int quantidadeAlunos, String turma, float mensalidade) {

        this.nome = nome; 
        this.quantidadeAlunos = quantidadeAlunos; 
        this.turma = turma; 
        this.mensalidade = mensalidade;
    }

    void cadastroCurso(){

        JOptionPane.showMessageDialog(null,"UNICSUL - Universidade Cruzeiro do Sul");
        nome = JOptionPane.showInputDialog("Nome: ");
        turma = JOptionPane.showInputDialog("Turma: ");
        quantidadeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidades de Alunos: "));
        mensalidade = Float.parseFloat(JOptionPane.showInputDialog("Mensalidade: "));
    }

    void imprimeDados (){

        JOptionPane.showMessageDialog(null, "UNICSUL - Universidade Cruzeiro do Sul"+
                                            "\nNome: " +nome+
                                            "\nTurma: " +turma+
                                            "\nMensalidade: R$" +mensalidade+
                                            "\nQuantidade de Alunos: " +quantidadeAlunos);
    }

    float calculaTotalMensalidade (){

        return quantidadeAlunos * mensalidade;
    }

}
