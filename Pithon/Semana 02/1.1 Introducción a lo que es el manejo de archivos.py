#Declaramos una variable

try:
    archivo = open('prueba.txt', 'w') #Entre parentecis indicamos nuestro metodo Open va a buscar el archivo caso contrario que si el archivo no existe lo va a clear
                                  #La w de Write que significa escribir
    archivo.write('Programamos con diferentes tipos de archivos, ahora en txt.\n') #El metodo Write es para lograr escribir dentro del archivo "prueba.txt"
    archivo.write('Con esto terminamos')
except Exception as e:
    print(e)
finally: #siempre se ejecuta
    archivo.close() #Con esto se debe cerrar el archivo  
