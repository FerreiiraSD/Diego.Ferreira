public class paciente {

    String nome;
    int rg;
    String endereco;
    int telefone;
    String DTnasc;
    String profiss;

public paciente (){}

public paciente(String n, int r, String end, int tel, String nasc, String pfs) {
    nome = n;
    rg = r;
    endereco = end;
    telefone = tel;
    DTnasc = nasc;
    profiss = pfs;
}

public paciente(String n) {
    nome = n;
}

}