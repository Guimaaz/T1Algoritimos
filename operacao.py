import matplotlib.pyplot as plt
import numpy as np

tamanhos = [100000, 200000, 400000, 800000, 1600000] 

# para ordenação, trocas utilizadas
trocas_bubble = [2495807907, 9977179174, 39958274263, 159983915658, 639675344811]
trocas_insertion = [2494263597, 9981213216, 39962365489, 159998333579, 639838187623]
trocas_selection = [4177103026, 16664978248, 34037676118, 267837671433, 833696554607]

trocas_bubble = np.array(trocas_bubble) / 1e9
trocas_insertion = np.array(trocas_insertion) / 1e9
trocas_selection = np.array(trocas_selection) / 1e9

plt.figure(figsize=(10, 6))
plt.plot(tamanhos, trocas_bubble, label='Bubble Sort - Ordenações - Em Bilhões', marker='v', linestyle='-', color='b', markersize=8)
plt.plot(tamanhos, trocas_insertion, label='Insertion Sort - Ordenações - Em Bilhões', marker='o',linestyle='--', color='g', markersize=8)
plt.plot(tamanhos, trocas_selection, label='Selection Sort - Ordenações - Em Bilhões', marker='s', linestyle='-', color='r', markersize=8)
plt.xlabel('Tamanho do Vetor (n em milhões)')
plt.ylabel('Número de trocas (em bilhões)')
plt.title('Ordenações por Tamanho de Vetor')
plt.legend()
plt.grid(True)

plt.yticks(np.arange(0, max(trocas_bubble) + 1, step=100))

plt.show()

