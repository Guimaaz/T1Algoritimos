import matplotlib.pyplot as plt
import matplotlib.ticker as ticker


sizes = [100000, 200000, 400000, 800000, 1600000]


bubble_tempo = [21740.9, 62248, 188743.6, 571782.23, 2278340]
insertion_tempo = [1747.8, 7243.2, 8321.1, 22692.53, 92339]
selection_tempo = [28937.8, 79737.97, 375582.43, 1090139.29, 4837776.21]


bubble_tempo = [t / 1000 for t in bubble_tempo]
insertion_tempo = [t / 1000 for t in insertion_tempo]
selection_tempo = [t / 1000 for t in selection_tempo]


plt.figure(figsize=(12, 7))


plt.plot(sizes, bubble_tempo, label="Bubble Sort", marker='o', linewidth=2, color='blue')
plt.plot(sizes, insertion_tempo, label="Insertion Sort", marker='s', linewidth=2, color='green')
plt.plot(sizes, selection_tempo, label="Selection Sort", marker='^', linewidth=2, color='red')


for x, y in zip(sizes, bubble_tempo):
    plt.text(x, y + y * 0.15, f'{y:.0f}s', fontsize=9, ha='center', color='blue')
for x, y in zip(sizes, insertion_tempo):
    plt.text(x, y + y * 0.15, f'{y:.0f}s', fontsize=9, ha='center', color='green')
for x, y in zip(sizes, selection_tempo):
    plt.text(x, y + y * 0.15, f'{y:.0f}s', fontsize=9, ha='center', color='red')


plt.title('Comparação de Tempo de Execução (em segundos) dos Algoritmos de Ordenação', fontsize=14)
plt.xlabel('Tamanho do Vetor', fontsize=12)
plt.ylabel('Tempo de Execução (s)', fontsize=12)


plt.yscale('log')
plt.gca().yaxis.set_major_formatter(ticker.FuncFormatter(lambda y, _: f'{y:.0f}'))


plt.xticks(sizes, [f'{size:,}'.replace(',', '.') for size in sizes])


plt.grid(True, which="both", linestyle='--', linewidth=0.5)
plt.legend()
plt.tight_layout()


plt.show()
