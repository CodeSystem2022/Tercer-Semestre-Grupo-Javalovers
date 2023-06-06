#video 4 de la clase 2 nos muestra como usar el read 'r' para poder leer el contenido de un archivo, el utf8 lo tenemos que usar para que tome la acentos o identifique el lenguaje 
#archivo = open('prueba.txt', 'r', encoding= 'utf8')
#print(archivo.read())

#video 5 calse 2 vemos la letra a, es para anexar informacion a un archivo (agregar informacion significa anexar )
#archivo = open('prueba.txt', 'a', encoding= 'utf8')# las letras son r (read), a (append), w (write), x
#print(archivo.read())

#video 6
#archivo = open('prueba.txt', 'r', encoding= 'utf8')# las letras son r (read), a (append), w (write), x
#print(archivo.read())
#print(archivo.read(12)) # al ponerlo de esta manera nos va a mostrar la cantidad de letras que pongamos
#print(archivo.read(5))#al poner devuleta nos va mostrar con un espacio lo que continene el texto, continua en donde lo dejo el otro read
#print(archivo.readline()) # de esta manera nos lee la primer linea del archivo
#print(archivo.readline())# silo colocamos devuelta saltara a la siguiente linea

#video 7 de la clase 2
# detalles importante a tener en cuenta
archivo = open('prueba.txt', 'r', encoding= 'utf8')# las letras son r (read), a (append), w (write), x
#print(archivo.read())
#print(archivo.read(12)) # al ponerlo de esta manera nos va a mostrar la cantidad de letras que pongamos
#print(archivo.read(5))#al poner devuleta nos va mostrar con un espacio lo que continene el texto, continua en donde lo dejo el otro read
print(archivo.readline()) # de esta manera nos lee la primer linea del archivo
print(archivo.readline())