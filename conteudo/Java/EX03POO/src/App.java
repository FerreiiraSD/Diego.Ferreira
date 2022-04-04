import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) throws Exception {


        String nome = JOptionPane.showInputDialog("Qual seu Nome? ");
        int rg = Integer.parseInt(JOptionPane.showInputDialog("Qual seu RG? "));
        String end = JOptionPane.showInputDialog("Qual seu endereço? ");
        int tel = Integer.parseInt(JOptionPane.showInputDialog("Qual seu telefone? "));
        String nasc = JOptionPane.showInputDialog("Qual o Dia de Nascimento? ");
        String prof = JOptionPane.showInputDialog("Qual sua Profissão? ");

        String nome2 = JOptionPane.showInputDialog("Qual seu Nome? ");


        paciente pa = new paciente(nome, rg, end, tel, nasc, prof);
        paciente pa2 = new paciente(nome2);

        System.out.println("Paciente A\n");

        System.out.println("\tNome: "+pa.nome+"\n"+
                           "\tRG: "+ pa.rg + "\n"+
                           "\tEndereço: "+ pa.endereco + "\n"+
                           "\tTelefone: "+ pa.telefone + "\n"+
                           "\tNascimento: "+ pa.DTnasc + "\n"+
                           "\tProfissão: "+ pa.profiss + "\n");

        System.out.println("Paciente B\n");

        System.out.println("\tNome: "+pa2.nome);
    }
}
