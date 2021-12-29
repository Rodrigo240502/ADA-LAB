
# Logica de la solucion: se nos daran varias String dentro de una lista
# y nos pide separarlos en grupos que sean anagramas, mi idea fue ordenar 
# esa palabra ya que al ordenarlas todas son iguales y ya que en python no
# hay como tal un hashMap, usare un diccionario de clave valor para guardar
# las palabras que ordenadas sean iguales en la clave que seria la palabra
# ordenada.

# Recibimos un arreglo con las palabras
def groupAnagrams(strs):
    # Creamos un diccionario(igual a un hashMap en Java) donde 
    # se guarda clave y valor. 
    anagrams = {}

    # Iteramos dentro del arreglo dado de palabras
    for word in strs:
        # Ordenamos la palabra
        sortedWord = sorted(word)

        # Si la palabra ordenada ya esta como clave en el diccionario 
        # agregaremos su valor que seria la palabra no ordenada en la 
        # clave que seria la palabra ordenada.
        if sortedWord in anagrams:
            anagrams[sortedWord].append(word)
        
        # De lo contrario crearemos un array con la palabra normal
        else:
            anagrams[sortedWord] = [word]

    # Finalmente retornamos el diccionario como una lista
    return list(anagrams.values())