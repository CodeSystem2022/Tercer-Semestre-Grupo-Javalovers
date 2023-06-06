# parte del video 5 clase 2

try:
    archivo = open ('prueba.txt','w', encoding= 'utf8') # con encoding= 'utf8' permitimos que hayan acentos en los archivos que queramos 
    archivo.write('Programas con diferentes tipos de archivos, ahora en txt.\n')
    archivo.write('los acentos son importantes para las palabras\n')
    archivo.write('como por ejemplo: acción, ejecución, producciónn\n')
    archivo.write('las letras son:\nr read leer,\na append anexa, \nw write escribe, \nx crea un archivo')
    archivo.write('\nt esta es para texto o text, \nb archivos binarios, \nw+ leer y escribe son iguales r+ pero alreves\n')
    archivo.write('Con esto terminamos ')
except Exception as e:
    print(e)
finally: #simepre se ejecuta
    archivo.close()
   
    
