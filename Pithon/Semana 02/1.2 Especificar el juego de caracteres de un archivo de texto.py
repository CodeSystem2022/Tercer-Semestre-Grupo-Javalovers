
# Declaramos una variable
try:
    archivo = open("prueba.txt ", "w",encoding="utf8") # La w es de write que significa escribir
    archivo.write("Programamos con diferentes tipos de archivos, ahora en txt.\n")
    archivo.write("Los acentos son importantes para las palabras.\n")
    archivo.write("Como por ejemplo: acción, ejecución y producción. \n")
    archivo.write("Las letras son:\nr read leer,\na append anexa, \nw write escribe, \n x crea un archivo")
    archivo.write("\nt esto es para texto o text,\nb archivos binarios, \nw+ y r+ lee y escribe son iguales , \n ")
    archivo.write("Con esto terminamos")

except Exception as e:
    print(e);
finally: # Siempre se ejecuta
    archivo.close() # Con esto se debe cerrar el archivo
#archivo.write("Todo quedo perfecto"):este es un error
