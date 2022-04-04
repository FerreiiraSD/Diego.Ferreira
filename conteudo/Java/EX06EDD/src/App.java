public class App {

    public static void main(String[] args) {
        new App();
    }
    
    boolean vetorInverido(int vetor []) {

            if (vetor == null) return false;   

            for (int i = 0; i < vetor.length - 1; i++) {

                int local = i; 
                int menor = vetor[i];

                for (int j = i+1; j < vetor.length; j++) {
                    
                    if ( vetor[j] > menor ) {
                        local = j;
                        menor = vetor[j];  
                    }

                }
                
                int temp = vetor[i];
                vetor[i] = menor;
                vetor[local] = temp;
                
            }

        return true;
    }

    void print(int vetor[]) {

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "  ");
        }

    }

    public App() {
        
        int vet[] = {4, 2, 10, 123, -3, 32, 0, 34, 12, 91, 45, 3, 21, 87, 61}; 

        System.out.println("Desordenado:");
        print(vet);
        
        System.out.println("\n\nOrdenado:");
        vetorInverido(vet);
        print(vet);
    }
    
}
