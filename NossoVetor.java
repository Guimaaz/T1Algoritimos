import java.util.Random;

public class NossoVetor {
  private int [] vetor;
  private int tamanho = 0;

  public NossoVetor(int capacidade) {
      this.vetor = new int[capacidade];
  }

  public void adicionar(int posicao, int elemento) {
      if (!(posicao >= 0 && posicao <= this.tamanho)) {
          System.out.println("Posição inválida");
          return;
      }

      aumentarCapacidade();

      for (int i = this.tamanho - 1; i >= posicao; i--) {
          this.vetor[i + 1] = this.vetor[i];
      }

      this.vetor[posicao] = elemento;
      this.tamanho++;
  }

  public int getPosicaoDoElemento(int elemento) {
      for (int i = 0; i < this.tamanho; i++) {
          if (this.vetor[i] == elemento ) { 
              return i;
          }
      }
      return -1;
  }

  public void removerPosicao(int posicao) {
      if (!(posicao >= 0 && posicao <= this.tamanho)) { 
          System.out.println("Posição inválida");
          return;
      }

      for (int i = posicao; i < this.tamanho - 1; i++) {
          this.vetor[i] = this.vetor[i + 1]; 
      }
 
      this.tamanho--;
  }
  
 
  private void aumentarCapacidade() {
      if (this.tamanho == this.vetor.length) {
          int [] vetorAumentado = new int[this.vetor.length * 2];
          for (int i = 0; i < this.vetor.length; i++) {
              vetorAumentado[i] = this.vetor[i];
          }
          this.vetor = vetorAumentado;
      }
  }
public String toString(){
  StringBuilder s = new StringBuilder();
  s.append("[");
  for( int i = 0; i < this.tamanho; i++){
    s.append(this.vetor[i]);
    s.append(",");

  }
  s.append("]");

  return s.toString();
}

public void preencheVetor() {
    Random random = new Random();
    for (int i = 0; i < this.vetor.length; i++) {
        this.vetor[i] = random.nextInt(vetor.length * 10);
    }
tamanho = this.vetor.length;

}

public void BubbleSort() {
    long contadorOperacoes = 0; 
    long tempoInicio = System.nanoTime(); 

    for (int i = 0; i < this.tamanho - 1; i++) {
        for (int j = 0; j < this.tamanho - 1 - i; j++) {
            if (this.vetor[j] > this.vetor[j + 1]) {
                int temp = this.vetor[j];
                this.vetor[j] = this.vetor[j + 1];
                this.vetor[j + 1] = temp;
                contadorOperacoes++; 
            }
        }
    }

    long tempoFim = System.nanoTime(); 
    long tempoExecucao = tempoFim - tempoInicio;

    System.out.println("Vetor ordenado: " + this.toString());

    System.out.println("Número de operações realizadas: " + contadorOperacoes);
    System.out.println("Tempo de execução: " + (tempoExecucao / 1000000000) + " segundos");
}

}

