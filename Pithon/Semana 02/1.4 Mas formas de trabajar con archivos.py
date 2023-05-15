archivo = open('prueba.txt','r',
               encoding = 'utf8') #las letras son: 'r' read, 'a' append, 'w' write,'x'
#print(archivo.read())
#print(archivo.read(16))
#print(archivo.read(10)) #continuamos desde la linea anterior
#print(archivo.readline())
#print(archivo.readline())

#vamos a iterar el archivo, cada una de las lineas
#for linea in archivo:
# print(linea): iteramos todos los elementos del archivo
print(archivo.readlines()[1]_# accedemos al archivo como si fuera una lista
      
#Anexamos informacion, copiamos a otro
archivo2 = open('copia.txt', 'a', encoding='utf8')
archivo2.write(archivo.read())
archivo.close()_#cerramos el primer archivo
archivo2.close()_#cerramos el segundo archivo
      
print('Se ha terminado el proceso de leer y copíar archivos')
      
