import javax.swing.*;

public class triangulo {
    
    float base;
    float altura;

    public triangulo() {}

    public triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    float calcularArea() {
        return (base*altura)/2;
    }

    void imprimeDados() {
        JOptionPane.showMessageDialog(null, "\nTriangulo:"+
                                            "\nBase: "+base+
                                            "\nAltura: "+altura+
                                            "\nArea: " +calcularArea());
    }

}
