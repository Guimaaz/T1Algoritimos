import matplotlib.pyplot as plt
import numpy as n

tamanhos = [100000, 200000, 400000, 800000, 1600000] 

comparacoes_bubble = [53051.3, 152418.6, 212466.7, 499394.67, 1158832.82]
comparacoes_insertion = [51059.5, 159985.5, 261477.43, 498570.5, 888002.6]
comparacoes_selection = [51181, 151184.9, 288378.17, 439682.66, 1149078.64]

comparacoes_linear_bubble = [53051.3, 152418.6, 212466.7, 499394.67, 1158832.82]
comparacoes_binaria_bubble = [30.57, 33.1, 33.7, 35.5, 40.09]
comparacoes_linear_insertion = [51059.5, 159985.5, 261477.43, 498570.5, 888002.6]
comparacoes_binaria_insertion = [30.57, 33.8, 33.7, 35.6, 413]
comparacoes_linear_selection = [51181, 151184.9, 288378.17, 439682.66, 1149078.64]
comparacoes_binaria_selection = [30.43, 33.8, 35.17, 37.54, 38.64]

# para ordenação, trocas utilizadas
trocas_bubble = [2495807907, 9977179174, 39958274263, 159983915658, 639675344811]
trocas_insertion = [2494263597, 9981213216, 39962365489, 159998333579, 639838187623]
trocas_selection = [4177103026, 16664978248, 34037676118, 267837671433, 833696554607]

plt.figure(figsize=(10, 6))
plt.plot(tamanhos, comparacoes_bubble, label='Bubble Sort - Comparações - Em Milhões', marker='v')
plt.plot(tamanhos, comparacoes_insertion, label='Insertion Sort - Comparações - Em Milhões', marker='o')
plt.plot(tamanhos, comparacoes_selection, label='Selection Sort - Comparações - Em Milhões', marker='s')
plt.xlabel('Tamanho do Vetor (n em milhões)')
plt.ylabel('Número de Comparações (em milhões)')
plt.title('Comparações por Tamanho de Vetor')
plt.legend()
plt.grid(True)
plt.show()
