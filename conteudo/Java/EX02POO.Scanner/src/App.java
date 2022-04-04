import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leia = new Scanner(System.in);

        cliente c = new cliente();

        System.out.print("\nNome: ");
        c.nome = leia.nextLine();

        System.out.print("Sobrenome: ");
        c.sobrenome = leia.nextLine();

        System.out.print("CPF: ");
        c.cpf = leia.nextLong();

        leia.nextLine();

        System.out.print("E-Mail: ");
        c.email = leia.nextLine();

        System.out.print("Telefone: ");
        c.telefone = leia.nextLine();

        cliente c2 = new cliente(c.nome, c.sobrenome, c.cpf, c.email, c.telefone);

        produto p = new produto();

        System.out.print("\nCod. Barra: ");
        p.cod_barra = leia.nextLong();

        leia.nextLine();

        System.out.print("Produto: ");
        p.produto = leia.nextLine();

        System.out.print("Fabricante: ");
        p.fabricante = leia.nextLine();

        System.out.print("Valor: ");
        p.valor = leia.nextDouble();

        System.out.print("Pagamento: ");
        p.pagamento = leia.nextBoolean();

        leia.close();

        produto p2 = new produto(p.cod_barra, p.produto, p.fabricante, p.valor, p.pagamento);

        System.out.println("\n===================================");

        System.out.println("\n\tDados Cliente");

        System.out.println("\nNome: " +c2.nome+ " " +c2.sobrenome+
                            "\nCPF: " +c2.cpf+
                            "\nE-Mail: "+ c2.email+
                            "\nTelefone: "+ c2.telefone);

        System.out.println("\n===================================");

        System.out.println("\n\tProduto");

        System.out.println("\nCod. Barra: " + p2.cod_barra +
                            "\nProduto: " +p2.produto+
                            "\nFabricante: " +p.fabricante+
                            "\nValor " +p2.valor+
                            "\nPagamento: " +p2.pagamento);

        System.out.println("\n===================================\n");
                           
    }
}
