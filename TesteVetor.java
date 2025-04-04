import javax.swing.JOptionPane;

public class TesteVetor {
    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            int tamanhoVetor = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho do vetor?"));
            NossoVetor vetor = new NossoVetor(tamanhoVetor);
            vetor.adicionarpreencher();

            String menu = "Escolha uma opção:\n"
                        + "1 - Bubble Sort\n"
                        + "2 - Selection Sort\n"
                        + "3 - Insertion Sort\n"
                        + "4 - Busca Linear\n"
                        + "5 - Busca Binária (exige vetor ordenado)\n"
                        + "0 - Sair";

            int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Comparações Bubble Sort: " + vetor.bubbleSort());
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Comparações Selection Sort: " + vetor.selectionSort());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Comparações Insertion Sort: " + vetor.insertionSort());
                    break;
                case 4: {
                    int num = Integer.parseInt(JOptionPane.showInputDialog("Qual número deseja buscar?"));
                    int passos = vetor.buscaLinear(num);
                    JOptionPane.showMessageDialog(null, "Passos Busca Linear: " + passos);
                    break;
                }
                case 5: {
                    vetor.selectionSort();
                    int num = Integer.parseInt(JOptionPane.showInputDialog("Qual número deseja buscar?"));
                    int passos = vetor.buscaBinaria(num);
                    JOptionPane.showMessageDialog(null, "Passos Busca Binária: " + passos);
                    break;
                }
                case 0:
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

            if (opcao != 0) { // teste para rodar caso nao coloque zero e preencha com sim a opcao
                int resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar outra operação?", "Continuar", JOptionPane.YES_NO_OPTION);
                if (resposta != JOptionPane.YES_OPTION) {
                    continuar = false;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }
}
