import javax.swing.*;

public class App {
    public static void main(String[] args) {
        
        triangulo t = new triangulo();
        data d = new data();

        t.altura = Float.parseFloat(JOptionPane.showInputDialog("Altura: "));
        t.base = Float.parseFloat(JOptionPane.showInputDialog("Base: "));

        t.imprimeDados();

        d.cadastroDados();

        d.imprimeDados();

    }
}
