import numpy as np
import sympy as sp 
import matplotlib.pyplot as plt 

x = sp.Symbol('x')

result = (3*(2+sp.Rational(1,2))**2)/(sp.Rational(1,5) - sp.Rational(2,3))
display(result)

float(result)

sp.N(result, 10)
(3.0*(2+1/2)**2)/(1/5 - 2/3)

sp.sqrt(100)

(54)**(sp.Rational(1,3))

sp.cos(sp.pi)

sp.asin(sp.Rational(1,2))

a = sp.pi/2
a
a*2
a = sp.pi/3
display(a)
print(a)
solution = sp.cos(a)
print('The cos({a}) evaluates to {solution}.')
