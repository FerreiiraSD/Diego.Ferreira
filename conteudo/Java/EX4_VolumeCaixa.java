import javax.swing.*;

/**
 * EX4_VolumeCaixa
 */

public class EX4_VolumeCaixa{

public static void main(String args[]){

    int vlm, cpt, lgr, atr;
    
    cpt = Integer.parseInt (JOptionPane.showInputDialog (null, "Informe o comprimento: ", "Calculo Volume Caixa", JOptionPane.INFORMATION_MESSAGE));
    
    lgr = Integer.parseInt (JOptionPane.showInputDialog (null, "Informe a largura: ", "Calculo Volume Caixa", JOptionPane.INFORMATION_MESSAGE));
    
    atr = Integer.parseInt (JOptionPane.showInputDialog (null, "Informe a altura: ", "Calculo Volume Caixa", JOptionPane.INFORMATION_MESSAGE));
    
    vlm = cpt*lgr*atr;
    
    JOptionPane.showMessageDialog (null, "O volume desta caixa é: " + vlm, "Calculo Volume Caixa", JOptionPane.INFORMATION_MESSAGE);

}
    
    static int CalculaVolumeCaixa (int cpt, int lgr, int atr){

        int tot;
        tot = cpt*lgr*atr;
        return (tot);
        
    }
    
}