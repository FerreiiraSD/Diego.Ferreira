import static java.lang.Math.*;
import javax.swing.JOptionPane;

public class Pentagono {

    float lado;
    float radio;
    float apotema;
    float area;

    public Pentagono() {}

    public Pentagono(float lado, float radio, float apotema) {
        this.lado = lado;
        this.radio = radio;
        this.apotema = apotema;
    }

    void cadastroDados (){
        lado = Float.parseFloat(JOptionPane.showInputDialog("Lado: "));
        radio = Float.parseFloat(JOptionPane.showInputDialog("Radio: "));
        apotema = Float.parseFloat(JOptionPane.showInputDialog("Apotema: "));
    }

    float calculoAreaPentagono (){

        if ((radio == 0) && (apotema == 0)){
			area = (float) (1.72048 * Math.pow(lado,2));
		} else if (apotema == 0) {
			apotema = (float) Math.sqrt(pow(radio, 2)-Math.pow(lado/2, 2));
			area = ((lado*5)*apotema)/2;
		} else {
			area = ((lado*5)*apotema)/2;
		}

        return area;

    }

    void imprimeDados() {
        JOptionPane.showMessageDialog(null, "\nPentagono:"+
                                            "\nLado: "+lado+
                                            "\nRadio: "+radio+
                                            "\nApotema: "+apotema+
                                            "\nArea: " +area);
    }
}

