import matplotlib.pyplot as plt
import numpy as np

sizes = [100000, 200000, 400000, 800000, 1600000]

# tempo execução mili
bubble_times = [21740.9, 62248, 188743.6, 571782.23, 2278340]
insertion_times = [1747.8, 7243.2, 8321.1, 22692.53, 92339]
selection_times = [28937.8, 79737.97, 375582.43, 1090139.29, 4837776.21]

plt.figure(figsize=(10, 6))
plt.plot(sizes, bubble_times, label="Bubble Sort", marker='o')
plt.plot(sizes, insertion_times, label="Insertion Sort", marker='o')
plt.plot(sizes, selection_times, label="Selection Sort", marker='o')
plt.xlabel('Tamanho do Vetor')
plt.ylabel('Tempo de Execução (ms)')
plt.title('Tempo de Execução dos Algoritmos de Ordenação')
plt.legend()
plt.grid(True)
plt.xscale('log') 
plt.yscale('log') 
plt.show()
