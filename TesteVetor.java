import javax.swing.JOptionPane;
import java.util.Calendar;

public class TesteVetor {
    public static void main(String[] args) {
        int tamanhoVetor = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho do vetor?"));
        int numeroProcurado = Integer.parseInt(JOptionPane.showInputDialog("Qual o número a ser buscado?"));
        int numeroDeTestes = Integer.parseInt(JOptionPane.showInputDialog("Qual o número de testes?"));

        for (int i = 0; i < numeroDeTestes; i++) {
            NossoVetor vetor = new NossoVetor(tamanhoVetor);

            System.out.printf("Teste número %d\n", i + 1);

            vetor.adicionarpreencher();
            long ini = Calendar.getInstance().getTimeInMillis();
            System.out.println(vetor.buscaLinear(numeroProcurado)); 
            System.out.println(vetor.bubbleSort());
            vetor.bubbleSort();
            long fim = Calendar.getInstance().getTimeInMillis();
            System.out.println(vetor.buscaBinaria(numeroProcurado) + "\n");
            System.out.println("bubble demorou " + (fim-ini) + " milissegundos");
        }
    }
}

// long ini = Calendar.getInstance().getTimeInMillis();
// long fim = Calendar.getInstance().getTimeInMillis();
// System.out.println("bubble demorou " + (fim-ini) + " milissegundos");
// ini = Calendar.getInstance().getTimeInMillis();
// fim = Calendar.getInstance().getTimeInMillis();
// System.out.println("selection ordenado demorou " + (fim-ini) + " milissegundos");