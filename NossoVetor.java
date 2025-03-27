import java.util.Random;

public class NossoVetor<T> {
  private Object[] vetor;
  private int tamanho = 0;

  public NossoVetor(int capacidade) {
      this.vetor = new Object[capacidade];
  }

  public void adicionar(int posicao, T elemento) {
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

  public int getPosicaoDoElemento(T elemento) {
      for (int i = 0; i < this.tamanho; i++) {
          if (this.vetor[i].equals(elemento)) { 
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

      this.vetor[this.tamanho - 1] = null; 
      this.tamanho--;
  }
  
  @SuppressWarnings("unchecked")
  private void aumentarCapacidade() {
      if (this.tamanho == this.vetor.length) {
          Object[] vetorAumentado =(T[]) new Object[this.vetor.length * 2];
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

}

