import javax.swing.*;

public class Triangulo {
    
    float base;
    float altura;

    public Triangulo() {}

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    void cadastroDados (){
        base = Float.parseFloat(JOptionPane.showInputDialog("Base: "));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Altura: "));
    }

    float calcularAreaTriangulo() {
        return (base*altura)/2;
    }

    void imprimeDados() {
        JOptionPane.showMessageDialog(null, "\nTriangulo:"+
                                            "\nBase: "+base+
                                            "\nAltura: "+altura+
                                            "\nArea: " +calcularAreaTriangulo());
    }

}