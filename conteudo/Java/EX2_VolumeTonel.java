import javax.swing.*;

/**
 * EX2_VolumeTonel
 */

public class EX2_VolumeTonel{
        
    public static void main (String args []) {

        Double vlm, r, atr;
        Double pi = 3.1415;

        r = Double.parseDouble (JOptionPane.showInputDialog (null, "Informe o raio do tonel: ","Calculo Volume Tonel", JOptionPane.INFORMATION_MESSAGE));

        atr = Double.parseDouble (JOptionPane.showInputDialog (null, "Informe a altura do tonel:","Calculo Volume Tonel", JOptionPane.INFORMATION_MESSAGE));

        vlm = pi * (r*r)*atr;
        
        JOptionPane.showMessageDialog (null, "O volume deste tonel de gasolina é: " + vlm, "Calculo Volume Tonel", JOptionPane.INFORMATION_MESSAGE);
        
     }   

    public double CalculaVolumeTonel (double r, double atr){
    
        double tot;      
        tot = 3.14 * (r*r)*atr;  
    
    return(tot);
    
    }

}