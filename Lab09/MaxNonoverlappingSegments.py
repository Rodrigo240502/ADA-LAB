def solution(A, B):
    # Si la long de A es menor que 1 no hay segmentos
    if len(A) < 1:
        return 0

    # En caso de no entrar a ese if asumimos que hay un segmento  
    count = 1
    prev_end = B[0]

    # Recorremos y si no se sobrepone sumamos el contador
    for i in range(1, len(A)):
        if A[i] > prev_end:
            count += 1
            prev_end = B[i]
     
    return count