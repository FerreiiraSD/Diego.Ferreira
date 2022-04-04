import javax.swing.*;

/**
 * EX6_QuebraHoras
 */

public class EX6_QuebraHoras{

        public static void main(String args[]){
        
        
        
                int sgd, v1, v2, v3, v4;
                
                sgd = Integer.parseInt (JOptionPane.showInputDialog (null, "Digite o valor em segundos: ", "Converção de Segundos", JOptionPane.INFORMATION_MESSAGE));
                
                v1 = sgd/60/60/24;
                v2 = (sgd/60/60)%24;
                v3 = (sgd/60)%60;
                v4 = sgd%60;
                
                JOptionPane.showMessageDialog (null, "Segundos digitado: " +sgd+ " equivalente à\n"
                +v1+ " dias, " +v2+ " horas, " +v3+ " minutos e " +v4+ " segundos.", "Converção de Segundos", JOptionPane.INFORMATION_MESSAGE);
        
        
        }
      
}

