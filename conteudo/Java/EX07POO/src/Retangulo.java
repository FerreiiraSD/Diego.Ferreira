import javax.swing.JOptionPane;

public class Retangulo {
    
    float ladoA;
    float ladoB;

    public Retangulo() {}

    public Retangulo(float ladoA, float ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    void cadastroDados(){
        ladoA = Float.parseFloat(JOptionPane.showInputDialog("Lado A"));
        ladoB = Float.parseFloat(JOptionPane.showInputDialog("Lado B"));
    }

    float calculoAreaRetangulo (){

        return ladoA * ladoB;
    }

    void imprimeDados (){
        JOptionPane.showMessageDialog(null, "Area do Retangulo:"+
                                            "\nLado A: "+ladoA+
                                            "\nLado B: "+ladoB+
                                            "\nArea: "+calculoAreaRetangulo()+"cm²");
    }

}