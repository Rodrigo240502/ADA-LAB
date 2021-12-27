import sys


# Construir una tabla de coincidencias parciales para usar en el algoritmo KMP
def construct_partial_match_table(pattern):
    string_length = len(pattern)
    current_prefix_length = 0

    # Inicializamos la tabla de coincidencias parciales para tener 0 en todos los índices
    partial_match_table = [0] * string_length

    if string_length == 1:
        return partial_match_table

    # Iteramos todos los caracteres del patrón para comprobar los sufijos parciales en diferentes puntos del patrón.
    # Comenzamos en el índice 1 porque en el índice 0, trivialmente no hay un sufijo parcial posible
    for current_index, current_char in enumerate(pattern[1:], 1):
        # Si tuviéramos un sufijo parcial que coincidiera con un prefijo adecuado, pero el siguiente carácter de nuestra cadena rompe el
        # coincidencia, nuestra longitud de coincidencia parcial máxima posible es el valor de nuestra tabla en el índice anterior (nuestro
        # coincidencia reciente)
        # Reiteramos esto hasta que el carácter al que ahora apuntamos coincide con nuestro carácter actual (o la longitud del prefijo es
        # 0, lo que significa que no hay coincidencia parcial en este índice)
        while current_prefix_length > 0 and pattern[current_prefix_length] != current_char:
            current_prefix_length = partial_match_table[current_prefix_length - 1]

        if pattern[current_prefix_length] == current_char:
            current_prefix_length += 1
        partial_match_table[current_index] = current_prefix_length
    return partial_match_table


# Algoritmo KMP
def kmp_string_search(given_string, pattern):
    # Creamos una tabla de coincidencias parciales para usar en el algoritmo de búsqueda KMP
    table = construct_partial_match_table(pattern)
    given_string_length = len(given_string)
    pattern_length = len(pattern)

    index_to_begin_search = 0
    given_index = 0
    pattern_index = 0
    locations_of_matches = []

    # Iteramos a través de cada carácter de la cadena que deseamos comprobar
    while given_string_length - index_to_begin_search > pattern_length:
        # Mientras el carácter actual en nuestra subcadena y la cadena dada coinciden, incremente cada uno en 1 para comparar el siguiente
        # caracteres (a menos que lleguemos al final de la cadena)
        while pattern_index < pattern_length and given_string[given_index] == pattern[pattern_index]:
            given_index += 1
            pattern_index += 1

        # pattern_index solo se incrementa mientras
        # subcadena [0: pattern_index] == given_string [index_to_begin_search: given_index]
        # Entonces, si pattern_index alcanza la longitud de la subcadena, sabemos que hemos encontrado una coincidencia para toda la subcadena
        if pattern_index >= pattern_length:
            locations_of_matches.append(str(index_to_begin_search))

        # Verificamos el valor en nuestra tabla de coincidencia parcial para la coincidencia más reciente que hemos encontrado.
        # Si esta coincidencia está en cualquier lugar más allá del comienzo de nuestra cadena, given_index permanece igual,
        # pattern_index toma este valor, e index_to_begin_search intuitivamente se convierte en la diferencia en estos números
        if pattern_index > 0 and table[pattern_index - 1] > 0:
            index_to_begin_search = given_index - table[pattern_index - 1]
            pattern_index = table[pattern_index - 1]

        # Si esta coincidencia está al principio de nuestra cadena y no hemos encontrado ningún carácter en nuestra subcadena en
        # el actual index_to_begin_search, incrementamos nuestro given_index en 1 para comenzar a buscar allí.
        # En cualquier caso, actualizamos nuestro index_to_begin_search y nuestro pattern_index (si aún no está al comienzo de
        # nuestra subcadena)
        else:
            if given_index == index_to_begin_search:
                given_index += 1
            index_to_begin_search = given_index
            if pattern_index > 0:
                pattern_index = table[pattern_index - 1]

    # El código solo reconoce 'encontrar' una coincidencia de subcadena cuando incrementamos pattern_index más allá de la longitud del
    # subcadena, y esto no puede suceder una vez que llegamos al final de nuestra cadena dada
    # Para dar cuenta de esto, simplemente verificamos por separado si el final de nuestra cadena dada coincide con nuestra subcadena
    if given_string[-pattern_length:] == pattern:
        locations_of_matches.append(str(len(given_string) - pattern_length))
    print(' '.join(locations_of_matches))


# Inicializar todas las variables booleanas y de cadena que usaremos durante nuestra prueba
string_to_check = ''
pattern_to_check = ''
check_ready = False

# Lea cada línea independientemente del stdin
# En las líneas impares, se nos da el patrón para verificar
# En las líneas pares, se nos da la cadena para verificar
for line in sys.stdin:
    if not check_ready:
        pattern_to_check = line.rstrip('\n')
        check_ready = True
    else:
        string_to_check = line.rstrip('\n')
        check_ready = False
        kmp_string_search(string_to_check, pattern_to_check)