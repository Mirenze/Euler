__author__ = 'Mirenze'

from functools import reduce

# Euclid's formula for generating Pythagorean triples
def generateTriple(m, n) :
    triple = {}
    triple['a'] = m**2 - n**2
    triple['b'] = 2 * m * n
    triple['c'] = m**2 + n**2
    return triple

def product(triple) :
    return reduce(lambda x, value : x * value, triple.values(), 1)

""" Since the sum of a, b, and c cannot exceed 1000, it follows that
 c = m^2 + n^2 also cannot exceed 1000. Therefore, the greatest possible
 value for m in the context of variable c is 31. Temporary heuristic
 that can definitely be fine-tuned later. """
def problem9() :
    for n in range(1, 31) :
        for m in range(n + 1, 32) :
            triple = generateTriple(m, n)
            if sum(triple.values()) == 1000 :
                return product(triple)

print(problem9())
