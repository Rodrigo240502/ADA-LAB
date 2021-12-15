def maximalSquare(self, matrix):

        res = 0
        row = len(matrix)
        if row == 0:
            return res
        col = len(matrix[0])
        aux = []
        for i in range(row):
            aux.append([])
            for j in range(col):
                aux[i].append(0)
        
        for i in range(row):
            for j in range(col):
                if matrix[i][j] == '1':
                    aux[i][j] = 1
                    res = 1
                    
        for i in range(1, row):
            for j in range(1,col):
                if aux[i][j] != 0:
                    aux[i][j] = 1+ min(min(aux[i-1][j],aux[i-1][j-1]),aux[i][j-1])
                    if res < aux[i][j]:
                        res = aux[i][j]
        return res*res