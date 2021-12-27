 
p = 53
m = 10 ** 9 + 9
 
s = input()
n = len(s)
 
# Pre-procesamos las potencias
power_mod = [1]
for i in range(1, n):
    power_mod.append((power_mod[-1] * p) % m)
 
# Hacemos un hash con los valores
def compute_hash_faster(s):
    n = len(s)
    p = 53
    m = 10 ** 9 + 9
 
    # Pre-procesamos las potencias de 31
    power_mod = [1]
    for i in range(1, n):
        power_mod.append((power_mod[-1] * p) % m)
 
    # Obtenemos los hashValues de los prefijos
    hash_values = [0] * (n + 1)
    for i in range(n):
        hash_values[i + 1] = (hash_values[i] + (ord(s[i]) - ord("a") + 1) * power_mod[i]) % m
    return hash_values
 
 
def finding_borders(s, n):
    hvalues = compute_hash_faster(s)
    result = []
 
    for border in range(1, n):
        i = 0
        field_hash = (hvalues[i + border] + m - hvalues[i]) % m
        field_hash = (field_hash * power_mod[n-i-1]) % m      
 
        i = n-border
        field_hash2 = (hvalues[i + border] + m - hvalues[i]) % m
        field_hash2 = (field_hash2 * power_mod[n-i-1]) % m
 
        if field_hash2 == field_hash:
            result.append(border)
    print(*result)
 
finding_borders(s, n)