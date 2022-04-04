public class cliente {

    String nome;
    String sobrenome;
    Long cpf;
    String email;
    String telefone;

    public cliente() {}

    public cliente(String n, String s, Long c, String e, String tel) {
        nome = n;
        sobrenome = s;
        cpf = c;
        email = e;
        telefone = tel;
    }       
}