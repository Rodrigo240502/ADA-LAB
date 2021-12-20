def solution(K, A):
    # La suma de las longitudes de las cuerdas debe ser
    # mayor igual a K y debe ser la maxima cantidad de 
    # posibilidades

    # Contador de cuerdas
    count = 0
    # Longitud de cuerdas atadas
    longitud = 0

    for i in A:
        # Aumentamos la longitud por cada cuerda y verificamos
        # si es mayor a K
        longitud += i 
        if longitud >= K:     
            count += 1
            longitud = 0
    return count