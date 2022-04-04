import javax.swing.*;

/**
 * EX5_CalculaPerimetro
 */

public class EX5_CalculaPerimetro{

    public static void main(String args[]){
        
        Double ld, pmt, ar;    
        
        ld = Double.parseDouble (JOptionPane.showInputDialog (null, "Informe o lado:","Calculo X e Y", JOptionPane.INFORMATION_MESSAGE));
        
        pmt = Double.parseDouble (JOptionPane.showInputDialog (null, "Informe o perímetro:","Calculo X e Y", JOptionPane.INFORMATION_MESSAGE));
        
        ar = ld*ld;
        
        pmt = ld * 4;
        
        JOptionPane.showMessageDialog (null, "O Perímetro é X = " +pmt, "Calculo X e Y", JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog (null, "E a Área Y = " +ar, "Calculo X e Y", JOptionPane.INFORMATION_MESSAGE);

    }
    
    
    public double CalculaPerimetro (double ld, double pmt){

        double tot, totd;
        
        tot = ld*ld;
        totd = ld*4;
        
        return(tot+totd);
        
    }

}

