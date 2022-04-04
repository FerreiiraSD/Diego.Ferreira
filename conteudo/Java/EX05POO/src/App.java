public class App {


    public static void main(String[] args) throws Exception {  

        
        contaCorrente cc = new contaCorrente();

        cc.cadastrarDados();

        cc.imprimeDados();

        cc.depositar((float) 0);

        cc.sacar((float) 0);

        contaCorrente cc2 = new contaCorrente();

        cc2.cadastrarDados();

        cc2.imprimeDados();

        cc2.depositar((float) 0);

        cc2.sacar((float) 0);

    }
}
