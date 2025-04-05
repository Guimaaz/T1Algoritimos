import matplotlib.pyplot as plt


def calcular_buscas(O, L, B):
    return (O / L) - B

test_sizes = ['100k', '200k', '400k', '800k', '1.6M']

ordenacao_bubble =  [2498900000.0, 9994220296.27, 40005620838.2, 160004187411.37, 639884594688.27]
ordenacao_insertion = [2498900000.0, 9999999999.0, 40005620838.2, 160007994685.1, 639727967411.9]
ordenacao_selection = [4176966666.0, 16701659286.07, 51909835329.8, 267245780829.37, 884786720455.71]

busca_linear_bubble =  [62560.33, 132152.07, 246756.23, 557750.67, 1105468.36]
busca_linear_insertion =  [70878.03, 145206.67, 239977.37, 627789.23, 722492.6]
busca_linear_selection = [54954.90, 132152.06, 312279.13, 527582.4, 1005698.36]

busca_binaria_bubble = [31.40, 33.67, 35.06, 37.33, 39.09]
busca_binaria_insertion = [32.27, 33.73, 35.40, 38.03, 39.3]
busca_binaria_selection =[30.73, 33.56, 36.13, 37.49, 39.29]

bubble_values = [calcular_buscas(O, L, B) for O, L, B in zip(ordenacao_bubble, busca_linear_bubble, busca_binaria_bubble)]
insertion_values = [calcular_buscas(O, L, B) for O, L, B in zip(ordenacao_insertion, busca_linear_insertion, busca_binaria_insertion)]
selection_values = [calcular_buscas(O, L, B) for O, L, B in zip(ordenacao_selection, busca_linear_selection, busca_binaria_selection)]

for i in range(len(test_sizes)):
    fig, ax = plt.subplots(figsize=(8, 5)) 
    
    bars = ax.bar(['Bubble Sort', 'Insertion Sort', 'Selection Sort'],
                  [bubble_values[i], insertion_values[i], selection_values[i]],
                  color=['blue', 'orange', 'green'])
    
    ax.set_ylabel('Número de Buscas Necessárias para o Equilíbrio')
    ax.set_title(f'Resultados para {test_sizes[i]}')

    for bar in bars:
        yval = bar.get_height()
        ax.text(bar.get_x() + bar.get_width()/2, yval, f'{yval:.2f}', ha='center', va='bottom', fontsize=12, fontweight='bold')

    plt.show()