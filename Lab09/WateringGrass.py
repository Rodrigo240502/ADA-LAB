import sys
from math import sqrt

# Rociadores [][]
# LongCampo = largo del campo 
# AnchoCampo = ancho del campo 

def optimal(rociadores, longCampo, anchoCampo):

    countRociador = 0 # Contador de rociadores
    i = 0 #Iterador aux de rociadores
    countLongCampo = 0 # Contador de longitud regada
    while True:

        # Iniciamos la posicion mas lejana como -1 ya que no tenemos nada
        # regado aun
        posLejana = -1

        # Iteraremos mientras haya rociadores y la longitud del
        # rociador actual no sea mayor a la longitud de campo ya regada
        while i < anchoCampo and rociadores[i][0] <= countLongCampo:
            # Aqui seleccionamos el maximo entre la posLejana y el radio 
            # del rociador actual, finalmete aumentamos el iterador de rociador
            posLejana = max(posLejana, rociadores[i][1])
            i += 1
        # En caso no hayamos regador ninguna parte del campo retornamos -1
        if posLejana == -1:
            return -1

        # Despues aumentamos el contador de rociadores en 1
        countRociador += 1
        # Definimos la long del campo regada con la posLejana ya regada
        countLongCampo = posLejana

        # Cuando la longitud regada sea mayor o igual a la longitud total
        # retornaremos el contador de rociadores
        if countLongCampo >= longCampo:
            return countRociador
            
# Metodo main para ejecucion del programa
def main():
    state = 0
    for line in sys.stdin:
        if state == 0:
            rociadores = []
            rociadores,longCampo,anchoCampo = map(int,line.split())
            state = rociadores
            mitad_ancho_cuadrado = (anchoCampo/2)**2
        else:
            state -= 1
            x,r = map(int,line.split())
            if 2*r > anchoCampo:
                d = sqrt(r**2 - mitad_ancho_cuadrado)
                rociadores.append((x-d,x+d))
            if state == 0:
                print(optimal(sorted(rociadores),longCampo,len(rociadores)))

if __name__ == "__main__":
    main()