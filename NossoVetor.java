import java.util.Random;

public class NossoVetor {

    private int[] vetor;
    private int tamanho;

    public NossoVetor(int capacidade) {
        this.vetor = new int[capacidade];
        this.tamanho = 0;
    }
    public void adicionarpreencher() {
        Random random = new Random();
        for (int i = 0; i < this.vetor.length; i++) {
           this.vetor[i] = random.nextInt(this.vetor.length * 1);

        }
        this.tamanho = this.vetor.length;
    }
    public long bubbleSort() {
        long ContadorBubble = 0;
        for (int i = 1; i < this.vetor.length; i++) {
            for (int j = 0; j < this.vetor.length - i; j++) {
                if (this.vetor[j] > this.vetor[j + 1]) {
                    int aux = this.vetor[j];
                    this.vetor[j] = this.vetor[j + 1];
                    this.vetor[j + 1] = aux;

                    ContadorBubble++;
                }
            }
        }
        return ContadorBubble;
    }
    public long selectionSort() {
        long ContadorSelection = 0;
        for (int i = 0; i < this.vetor.length - 1; ++i) {
            int min = i;
            for (int j = i + 1; j < this.vetor.length; ++j) {
                if (this.vetor[j] < this.vetor[min]) {
                    min = j;
                }
                int x = this.vetor[i];
                this.vetor[i] = this.vetor[min];
                this.vetor[min] = x;
                if (this.vetor[i] != this.vetor[min]) {
                    ContadorSelection++;
                }

            }
        }
        return ContadorSelection;
    }
    public long insertionSort() {
        long ContadorInsertion = 0;
        for (int j = 1; j < this.vetor.length; ++j) {
            int x = this.vetor[j];
            int i;
            for (i = j - 1; i >= 0 && this.vetor[i] > x; --i) {
                this.vetor[i + 1] = this.vetor[i];
                ContadorInsertion++;
            }
            this.vetor[i + 1] = x;
        }

        return ContadorInsertion;
    }
    public int buscaLinear(int elemento) {
        int contadorLinear = 0;

        for (int i = 0; i < this.vetor.length; i++) {
            contadorLinear++;
            if (this.vetor[i] == elemento) {
                
                return contadorLinear;
            }
        }
        return contadorLinear;
    }

    public int buscaBinaria(int elemento) {
        int contadorBinario = 0;

        int inicio = 0;
        int fim = this.vetor.length - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            contadorBinario++;
            if (this.vetor[meio]  == elemento ) {
                return contadorBinario;
            }
            contadorBinario++;
            if (this.vetor[meio] < elemento ) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return contadorBinario;
    }

    @Override
    public String toString() {
       StringBuilder s = new StringBuilder();

       s.append("[");
       for(int i = 0; i<this.tamanho; i++){
        s.append(this.vetor[i]);
        s.append(",");
       }
       s.append("]");

       return s.toString();


    }
}