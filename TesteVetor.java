import javax.swing.JOptionPane;
public class TesteVetor {
    public static void main(String[] args) {
       

        int tamanhoVetor = Integer.parseInt(JOptionPane.showInputDialog("qual o tamanho do vetor??"));
        int numeroProcurado = Integer.parseInt(JOptionPane.showInputDialog("qual o numero a ser buscado??"));
        int numeroDeTestes = Integer.parseInt(JOptionPane.showInputDialog("qual o numero de testes"));
        NossoVetor vetor = new NossoVetor(tamanhoVetor);
        
        
        

        

        for (int i = 0; i < numeroDeTestes; i++) {
            
            System.out.printf("teste numero",  i);

            vetor.adicionarpreencher();
            System.out.println(vetor.buscaLinear(numeroProcurado)); 
            System.out.println(vetor.bubbleSort());
            System.out.println(vetor.buscaBinaria(numeroProcurado) + "\n");  

            // vetor.adicionarpreencher();
            // System.out.println(vetor.buscaLinear(numeroProcurado));
            // System.out.println(vetor.selectionSort());
            // System.out.println(vetor.buscaBinaria(numeroProcurado) + "\n");

            // vetor.adicionarpreencher();
            // System.out.println(vetor.buscaLinear(numeroProcurado));
            // System.out.println(vetor.insertionSort());
            // System.out.println(vetor.buscaBinaria(numeroProcurado) + "\n");

        }
    }
}