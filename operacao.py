import matplotlib.pyplot as plt

tamanhos = [100000, 200000, 400000, 800000, 1600000]

bubble_linear = [62560.33, 132152.07, 246756.23, 557750.67, 1105468.36]
bubble_binaria = [31.40, 33.67, 35.06, 37.33, 39.09]
bubble_ordenacao = [2498900000.0, 9994220296.27, 40005620838.2, 160004187411.37, 639884594688.27]
bubble_tempo = [20.29673, 66.22073, 190563.83, 622968.9, 2596959.64]

insertion_linear = [70878.03, 145206.67, 239977.37, 627789.23, 722492.6]
insertion_binaria = [32.27, 33.73, 35.40, 38.03, 39.3]
insertion_ordenacao = [2498900000.0, 9999999999.0, 40005620838.2, 160007994685.1, 639727967411.9]
insertion_tempo = [1.80133, 7137.97, 8430.20, 23892.43, 93039]

selection_linear = [54954.90, 132152.06, 312279.13, 527582.4, 1005698.36]
selection_binaria = [30.73, 33.56, 36.13, 37.49, 39.29]
selection_ordenacao = [4176966666.0, 16701659286.07, 51909835329.8, 267245780829.37, 884786720455.71]
selection_tempo = [29.43117, 184809.53, 300566.80, 1144080.3, 4826897.64]


plt.figure(figsize=(10, 6))
plt.plot(tamanhos, bubble_linear, marker='o', label='Bubble')
plt.plot(tamanhos, selection_linear, marker='o', label='Selection')
plt.plot(tamanhos, insertion_linear, marker='o', label='Insertion')
plt.xlabel('Tamanho do Vetor')
plt.ylabel('Média de Busca Linear')
plt.title('Comparação de Busca Linear por Tamanho do Vetor')
plt.xticks(tamanhos, ['100k', '200k', '400k', '800k', '1.6M'])
plt.legend()
plt.grid(True)
plt.show()

plt.figure(figsize=(10, 6))
plt.plot(tamanhos, bubble_binaria, marker='o', label='Bubble')
plt.plot(tamanhos, selection_binaria, marker='o', label='Selection')
plt.plot(tamanhos, insertion_binaria, marker='o', label='Insertion')
plt.xlabel('Tamanho do Vetor')
plt.ylabel('Média de Busca Binária')
plt.title('Comparação de Busca Binária por Tamanho do Vetor')
plt.xticks(tamanhos, ['100k', '200k', '400k', '800k', '1.6M'])
plt.legend()
plt.grid(True)
plt.show()

plt.figure(figsize=(10, 6))
plt.plot(tamanhos, bubble_ordenacao, marker='o', label='Bubble', color='blue', linewidth=2)
plt.plot(tamanhos, selection_ordenacao, marker='s', label='Selection', color='red', linewidth=2)
plt.plot(tamanhos, insertion_ordenacao, marker='^', label='Insertion', color='green', linewidth=2)
plt.xlabel('Tamanho do Vetor')
plt.ylabel('Média de Ordenação')
plt.title('Ordenação dos Métodos por Tamanho do Vetor')
plt.xticks(tamanhos, ['100k', '200k', '400k', '800k', '1.6M'])
plt.legend()
plt.grid(True)
plt.yscale('log')
plt.show()
