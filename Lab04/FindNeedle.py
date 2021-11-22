def findNeedle(needle, haystack):
    needleIndex = 0
    haystackIndex = 0

    while(haystackIndex<len(haystack)):
        if needle[needleIndex] == haystack[haystackIndex]:
            foundNeedle = True
            while needleIndex<len(needle):
                if needle[needleIndex] != haystack[haystackIndex+needleIndex]:
                    foundNeedle = False
                break
            needleIndex += 1
            if foundNeedle:
                return True
            needleIndex = 0
        haystackIndex += 1
    return False

needle = "fgh"
haystack = "abcdefghi"
print(findNeedle(needle,haystack))

#El algoritmo tiene una complejidad de (n*m) donde n y m son las longitudes
#de las cadenas
