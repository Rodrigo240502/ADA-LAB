def pickResume(resumes):
    eliminate = "top"
    while len(resumes) > 1:
        if eliminate=="top":
            resumes = resumes[len(resumes)/2: len(resumes)+1]
            eliminate = "bottom"
        elif eliminate=="bottom":
            resumes = resumes[0: len(resumes)/2+1]
            eliminate = "top"
    return resumes

print(pickResume("hola"))
#La complejidad del algoritmo es O(log2(n))