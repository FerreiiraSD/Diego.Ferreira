import javax.swing.JOptionPane;

public class Paralelogramo {
    
    float ladoA;
    float ladoB;

    public Paralelogramo() {}

    public Paralelogramo(float ladoA, float ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    void cadastroDados(){
        ladoA = Float.parseFloat(JOptionPane.showInputDialog("Lado A"));
        ladoB = Float.parseFloat(JOptionPane.showInputDialog("Lado B"));
    }

    float calculoAreaParalelogramo (){

        return ladoA * ladoB;
    }

    void imprimeDados (){
        JOptionPane.showMessageDialog(null, "Area do Paralelogramo:"+
                                            "\nLado A: "+ladoA+
                                            "\nLado B: "+ladoB+
                                            "\nArea: "+calculoAreaParalelogramo()+"cm²");
    }

}