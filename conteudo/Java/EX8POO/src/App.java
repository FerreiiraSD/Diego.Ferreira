import javax.swing.JOptionPane;

public class App {

    private static final int anoAtual = 0;

    public static void main(String[] args) throws Exception {

        // Curso curso = new Curso();

        // curso.cadastroCurso();

        // curso.imprimeDados();

        // JOptionPane.showMessageDialog(null, "Total de Mensalidade: R$" +curso.calculaTotalMensalidade());

        // Curso curso2 = new Curso();

        // curso2.cadastroCurso();

        // curso2.imprimeDados();

        // JOptionPane.showMessageDialog(null, "Total de Mensalidade: R$" +curso2.calculaTotalMensalidade());

        Paciente paciente = new Paciente();

        paciente.cadastraDados();

        paciente.imprimeDados();

        JOptionPane.showMessageDialog(null,"Hà não esquecemos da sua Idade HAHA"+
                                           +paciente.calculaIdade(anoAtual)+" anos");

    }

}
