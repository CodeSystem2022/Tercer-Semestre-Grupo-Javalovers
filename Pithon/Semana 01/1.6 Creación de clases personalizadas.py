from NumerosIgualesException import NumerosIgualesException

resultado = None

try:
    a= int(input('Digite el primer numero: '))# esta la manera de pedir algo al usuario
    b= int(input('Digite el segundo numero: '))
    if a == b:
        raise NumerosIgualesException('Son numeros iguales')
    resultado = a / b #modificamos
except TypeError as e:
    print(f'TypeError - Ocurrio un error: {type(e)}')
except ZeroDivisionError as e:
    print(f'ZeroDivisionError - ocurrio un error+: {type(e)}')
except Exception as e:
    print(f'Exception - Ocurrio un error: {type(e)}')

else:
    print('no se arrojo ninguna exepcion')
finally: # siempre se va a ejecutar
    print('Ejercucion de este bloque finally ')

print(f'El resultado es: {resultado}')
print('seguimos...')
