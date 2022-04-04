public class App {

    public static void main(String[] args) throws Exception {
        new App ();
    }

    String[]  bubbleSort (String paises[]) {    

        boolean trocar;    
        int i = 0; 

        do {
            trocar = false;

            for (int j = 0; j < paises.length - 1 - i; j++) {

              if (paises[j].compareTo(paises[j+1]) > 0 ) {
                    troca(paises, j, j+1);
                    trocar = true;
               }
            }

            i++;

        } while (trocar);

        return paises;
    } 

    void troca(String vetor[], int posicaoImpar, int posicaoPar) {
        String temp = vetor[posicaoImpar];
        vetor[posicaoImpar] = vetor[posicaoPar];
        vetor[posicaoPar] = temp;        
    }

    void visualizar(String paises[]) {

        for (int i = 0; i < paises.length; i++) {
            System.out.print(paises[i] + "   ");
        }

        System.out.println();
    }

    App () {

        String paises[] = {"México", "Brasil", "Cuba", "Chile", "Argentina", "Espanha"};

        System.out.println("\nDesordenado:");
        visualizar (paises);

        System.out.println("\nOrdenado:");
        visualizar(bubbleSort(paises));
    }
    
}
