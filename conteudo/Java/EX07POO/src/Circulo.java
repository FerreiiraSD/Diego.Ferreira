import javax.swing.JOptionPane;
import java.lang.Math;
    
public class Circulo {
    
    float pi;
    float raio;

    public Circulo() {}

    public Circulo(float pi, float raio) {
        this.pi = pi;
        this.raio = raio;
    }

    void cadastroDados (){
        raio = Float.parseFloat(JOptionPane.showInputDialog("Raio: "));
    }

    float calculoAreaCirculo (){
        
        return (float) (Math.PI * Math.pow(raio, 2));
        
    }

    void imprimeDados() {
        JOptionPane.showMessageDialog(null, "\nCirculo:"+
                                            "\nRaio: "+raio+
                                            "\nArea: " +calculoAreaCirculo());
    }

}