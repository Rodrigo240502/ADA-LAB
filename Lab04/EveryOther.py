def everyOther(array):
    for i in range(len(array)):
        if i % 2 == 0:
            num = array[i]
            #Posicion par
            for j in range(len(array)):
                num += array[j]

#La complejidad de este algoritmo es O(n^2)
