import javax.swing.JOptionPane;

public class Teste1 {
    public static void main(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho do vetor?"));
        NossoVetor<Integer> vetor = new NossoVetor<>(tamanho);

        vetor.preencheVetor();

        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma opção:\n1 - Inserir\n2 - Remover\n3 - Exibir\n0 - Sair"));

            switch (opcao) {
                case 1:
                    int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição que quer inserir no vetor:"));
                    int elemento = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento a ser inserido:"));
                    vetor.adicionar(posicao, elemento);
                    break;
                case 2:
                    int posicaoRemover = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição a ser removida:"));
                    vetor.removerPosicao(posicaoRemover);
                    break;
                case 3:
                    System.out.println(vetor.toString());
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (opcao != 0);
    }
}
