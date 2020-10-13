public class BubbleSort {
	public static void main(String[] args) {
		
		int[] vetor = {4, 8, 20, 2, 10, 9, 30}; 
		for (int i = 0; i < (vetor.length - 1); i++) {	
            for (int j = 0; j < (vetor.length - 1 - i); j++) { 
                if (vetor[j] > vetor[j+1]) { 					
                    int aux = vetor[j]; 
                    vetor[j] = vetor[j+1]; 
                    vetor[j+1] = aux; 
                } 
            }
		}
		System.out.print("Vetor ordenado: ");
		for(int vet: vetor) {
			System.out.print(vet+" ");
		}
	}
}



