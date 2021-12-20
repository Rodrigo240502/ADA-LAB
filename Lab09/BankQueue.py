from collections import defaultdict
from heapq import *

N, T = list(map(int, input().split()))

clientes = defaultdict(list)

# Leemos todos los Clientes, ordenamos el tiempo y agregamos el dinero
for n in range(N):
    cash, time = list(map(int, input().split()))
    clientes[time].append(cash)

amountsToConsider = []
sum_total = 0

# Solucion Codiciosa:
# Empezaremos buscando los clientes que se quedaran menor tiempo
for t in range(T)[::-1]: # Este ::-1 empezara desde el final de la cola 
    # Agregamos el dinero de los clientes actuales en un Heap
    for price in clientes[t]:
        # Ordenamos en el array amountsToConsider el negativo del precio
        heappush(amountsToConsider, -price)
    # Si hay clientes que han esperado un tiempo T, sacamos a ese cliente
    if amountsToConsider:
        sum_total += heappop(amountsToConsider)

# Volvemos positivo la suma total
print(-sum_total)