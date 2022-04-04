import javax.swing.*;

public class Trapezio {
    
    float baseA;
    float baseB;
    float altura;

    public Trapezio() {}

    public Trapezio(float baseA, float baseB, float altura) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.altura = altura;
    }

    void cadastroDados (){
        baseA = Float.parseFloat(JOptionPane.showInputDialog("Base A: "));
        baseB = Float.parseFloat(JOptionPane.showInputDialog("Base B: "));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Altura: "));
    }

    float calcularAreaTrapezio() {
        return ((baseA + baseB) / 2) * altura;
    }

    void imprimeDados() {
        JOptionPane.showMessageDialog(null, "\nTrapezio:"+
                                            "\nBase A: "+baseA+
                                            "\nBase B: "+baseB+
                                            "\nAltura: "+altura+
                                            "\nArea: " +calcularAreaTrapezio());
    }

}