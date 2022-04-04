public class produto {

    long cod_barra;
    String produto;
    String fabricante;
    double valor;
    boolean pagamento;

    public produto() {}

    public produto(long cod, String p, String f, double v, boolean pay) {
        cod_barra = cod;
        produto = p;
        fabricante = f;
        valor = v;
        pagamento = pay;
    }
    
}
