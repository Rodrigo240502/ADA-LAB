def twoSum(array):
    for i in array:
        for j in array:
            if i!=j and i+j==10:
                print("Suma da 10 y no son iguales")
                return True
    return False

array = { 3,4,6,7,11,13,8,15}
print(twoSum(array))
#La complejidad del ejercicio es O(n^2)
