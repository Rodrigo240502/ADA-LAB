#Convertir de O(n2) a O(n)

def greatestNumber_n2(array):
    for i in array:
        isGreatest = True
        for j in array:
            if j>i :
                isGreatest = False
        if isGreatest:
            return i

def greatestNumber_n(array):
    max = 0
    for i in array:
        if i>max:
            max = i
    return max

array = { 2, 4, 5, 1, 8, 9, 6, 7 }
print(greatestNumber_n(array))