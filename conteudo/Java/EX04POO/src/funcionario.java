public class funcionario {
    
    int codFunc;
    String nomeFunc;
    int codCargo;
    String endFunc;
    String emailFunc;
    double salarioFunc;  

    public funcionario() {}

    public funcionario(int codf, String nome, double sal) {
        codFunc = codf;
        nomeFunc = nome;
        salarioFunc = sal;
    }

    public funcionario(int codf, String nome, int codc, String end, String email, double sal) {
        codFunc = codf;
        nomeFunc = nome;
        codCargo = codc;
        endFunc = end;
        emailFunc = email;
        salarioFunc = sal;
    }
}
