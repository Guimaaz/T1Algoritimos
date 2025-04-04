import matplotlib.pyplot as plt
import matplotlib.ticker as ticker

# Tamanhos dos vetores
sizes = [100000, 200000, 400000, 800000, 1600000]

# Tempos em milissegundos convertidos para segundos
bubble_times = [21740.9, 62248, 188743.6, 571782.23, 2278340]
insertion_times = [1747.8, 7243.2, 8321.1, 22692.53, 92339]
selection_times = [28937.8, 79737.97, 375582.43, 1090139.29, 4837776.21]

# Convertendo para segundos
bubble_times = [t / 1000 for t in bubble_times]
insertion_times = [t / 1000 for t in insertion_times]
selection_times = [t / 1000 for t in selection_times]

# Criando o gráfico
plt.figure(figsize=(12, 7))

# Plotando as curvas
plt.plot(sizes, bubble_times, label="Bubble Sort", marker='o', linewidth=2, color='blue')
plt.plot(sizes, insertion_times, label="Insertion Sort", marker='s', linewidth=2, color='green')
plt.plot(sizes, selection_times, label="Selection Sort", marker='^', linewidth=2, color='red')

# Adicionando rótulos nos pontos (levemente acima)
for x, y in zip(sizes, bubble_times):
    plt.text(x, y + y * 0.15, f'{y:.0f}s', fontsize=9, ha='center', color='blue')
for x, y in zip(sizes, insertion_times):
    plt.text(x, y + y * 0.15, f'{y:.0f}s', fontsize=9, ha='center', color='green')
for x, y in zip(sizes, selection_times):
    plt.text(x, y + y * 0.15, f'{y:.0f}s', fontsize=9, ha='center', color='red')

# Título e rótulos
plt.title('Comparação de Tempo de Execução (em segundos) dos Algoritmos de Ordenação', fontsize=14)
plt.xlabel('Tamanho do Vetor', fontsize=12)
plt.ylabel('Tempo de Execução (s)', fontsize=12)

# Escala logarítmica no eixo Y, mas com valores legíveis
plt.yscale('log')
plt.gca().yaxis.set_major_formatter(ticker.FuncFormatter(lambda y, _: f'{y:.0f}'))

# Eixo X com todos os tamanhos visíveis e formatados
plt.xticks(sizes, [f'{size:,}'.replace(',', '.') for size in sizes])

# Grade, legenda e layout
plt.grid(True, which="both", linestyle='--', linewidth=0.5)
plt.legend()
plt.tight_layout()

# Exibindo o gráfico
plt.show()
