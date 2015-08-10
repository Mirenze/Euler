__author__ = 'Mirenze'

from math import sqrt

def isPrime(n) :
    if (n % 2 == 0 and n != 2 or n < 2) :
        return False

    for x in range(2, int(sqrt(n))) :
        if n % x == 0 :
            return False

    return True

sum = 0
limit = 2000000

# intialize primality list
primality = [True] * limit
primality[0] = primality[1] = False

# calculate primality
for x in range (2, limit) :
    if primality[x] == True and isPrime(x) :
        for y in range(x * 2, limit, x) :
            primality[y] = False

for (x, isPrime) in enumerate(primality) :
    if isPrime :
        sum = sum + x

print(sum)





