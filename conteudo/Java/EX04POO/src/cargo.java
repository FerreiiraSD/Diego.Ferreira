public class cargo {
    
    int codCargo;
    String nomeCargo;
    int cargaHoraria;
    public String nomeHoraria;

    public cargo() {}

    public cargo(int codc, String nomec) {
        codCargo = codc;
        nomeCargo = nomec;
    }

    public cargo(int codc, String nomec, int cargah) {
        codCargo = codc;
        nomeCargo = nomec;
        cargaHoraria = cargah;
    }
    
}