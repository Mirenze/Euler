__author__ = 'Mirenze'

from functools import reduce

def generateTriple(m, n) :
    triple = {}
    triple['a'] = m**2 - n**2
    triple['b'] = 2 * m * n
    triple['c'] = m**2 + n**2
    return triple

def sumTriple(triple) :
    return sum(triple.values(), 0)

def productTriple(triple) :
    return reduce(lambda x, value : x * value, triple.values(), 1)
