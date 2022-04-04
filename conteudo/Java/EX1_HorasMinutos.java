import javax.swing.*;

/**
 * EX1_HorasMinutos
 */

public class EX1_HorasMinutos {

    public static void main (String args []) {

        int hrs, mts, tt;

        hrs = Integer.parseInt (JOptionPane.showInputDialog (null, "Digite as horas a serem calculadas: ", "Calculo de Minutos do Dia", JOptionPane.INFORMATION_MESSAGE));

        mts = Integer.parseInt (JOptionPane.showInputDialog (null, "Digite os minutos a serem calculadas: ", "Calculo de Minutos do Dia", JOptionPane.INFORMATION_MESSAGE));

        tt = HorasMinutos (hrs, mts); 
        
        JOptionPane.showMessageDialog (null, "Ja se passaram " + tt + " minutos.", "Calculo de Minutos do Dia", JOptionPane.INFORMATION_MESSAGE);

    }

   static int HorasMinutos (int a, int b) {

       int tot;
       tot = b + (a * 60);
       return (tot);

    }

}