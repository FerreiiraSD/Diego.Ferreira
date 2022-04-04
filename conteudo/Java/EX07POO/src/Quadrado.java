import javax.swing.JOptionPane;

public class Quadrado {
    
    float ladoA;
    float ladoB;

    public Quadrado() {}

    public Quadrado(float ladoA, float ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    void cadastroDados(){
        ladoA = Float.parseFloat(JOptionPane.showInputDialog("Lado A"));
        ladoB = Float.parseFloat(JOptionPane.showInputDialog("Lado B"));
    }

    float calculoAreaQuadrado (){

        return ladoA * ladoB;
    }

    void imprimeDados (){
        JOptionPane.showMessageDialog(null, "Area do Quadrado:"+
                                            "\nLado A: "+ladoA+
                                            "\nLado B: "+ladoB+
                                            "\nArea: "+calculoAreaQuadrado()+"cm²");
    }

}