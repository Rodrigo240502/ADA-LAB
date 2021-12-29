# Definicion de la logica usada: Recibimos un array de palabras, lo primero
# es invertir sus letras mediante un ciclo for creando otra array y guardando
# con las letras invertidas mediante el [::-1] eso lo aprendi en w3schools hace
# ya unos meses, despues de tenerlas invertidas toca ordenarlas con la funcion sorted
# y guardarla en otro arreglo, finalmente solo queda volver a invertir ese arreglo y ya estaria 
# ordenado, para el espaciado, solo tomalos la long de la mayor cadena y la restamos con la long
# de la palabra a imprimir

def orderInvertList(longest, words):
    invertedList = []
    invertedOrderList = []
    for a in words:
        invertedList.append(a[::-1])

    for b in sorted(invertedList):
        invertedOrderList.append(b[::-1])

    for x in invertedOrderList:
        space = " "*longest-len(x)
        print(" "*space,x)

    
# Main del programa
def main():
    longest = -1
    words = []

    # Para el input de datos
    while True:
        try:
            w = input()
            if not w:
                orderInvertList(longest, words)
                print()
                longest,words = -1,[]
            else:
                longest = max(longest, len(w))
                words.append(w)
        except EOFError:
            orderInvertList(longest,words)
            break

if __name__ == "__main__":
    main()