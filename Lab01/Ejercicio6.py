string = input("Ingrese la palabra a enmarcar: ")
num = int(input("Ingrese la cantidad de espacios entre el marco y la palabra"))
arribaAbajo = "*" * (len(string) + (num*2)+2)+ "\n"
laterales = "*" + " " * (len(string) + num*2) + "*\n"
resultado = arribaAbajo
for i in range(num):
    resultado += laterales
resultado += "*"+" "*num + string + " "*num+"*\n"
for i in range(num):
    resultado += laterales
resultado += arribaAbajo
print(resultado)