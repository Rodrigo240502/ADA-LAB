MOD = 1000000007

def problems(n,time,list):

    totalTime = 0 # Tiempo tomado para resolver
    penalty = 0 # Penalizacion dada
    for i,t in enumerate(list):
        # Primero verificamos si el tiempo total sumado con 
        # el que demoramos en el problema es mayor al tiempo maximo
        # dado por el problema
        if totalTime + t > time:
            # En caso lo sea devolvemos el numero de problemas y la penalizacion
            return i, penalty

        # En caso de aun tener tiempo sumamos el que demoramos en el problema actual    
        totalTime += t
        # Y recalculamos la penalidad segun el problema
        penalty = (penalty + totalTime) % MOD
    return n, penalty

# Metodo main para la ejecucion del programa
def main():
    n,t = map(int,input().split())
    a,b,c,t0 = map(int,input().split())
    lis = [t0]
    for _ in range(1,n):
        lis.append(((a*lis[-1]+b) % c) + 1)
    print(*problems(n,t,sorted(lis)))

if __name__ == "__main__":
    main()