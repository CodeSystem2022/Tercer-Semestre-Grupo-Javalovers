# Manejo de contexto with: sintaxis simplicada, abre y cierra el archivo

with open('prueba.txt', 'r', encoding='utf8') as archivo:
    print(archivo.read())

# No hace falta el try catch ni el finally en el contexto de with lo que se ejecuta de manera automatica
# Utiliza diferentes métodos: __enter__ este es el que abre y __exit__ el que cierra
