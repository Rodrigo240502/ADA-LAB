string = input("Ingrese la palabra a enmarcar: ")
arribaAbajo = "*" * (len(string)+4)+ "\n"
laterales = "*" + " " * (len(string) + 2) + "*\n"
resultado = arribaAbajo
resultado += laterales
resultado += "* " + string + " *\n"
resultado += laterales
resultado += arribaAbajo
print(resultado)