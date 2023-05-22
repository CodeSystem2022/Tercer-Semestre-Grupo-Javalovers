opcion = None
while opcion != 4:
    try:
        print('Opciones')
        print('1. Agregar Pelicula')
        print('2. Lista las peliculas')
        print('3. Eliminar catalogo de pelicula')
        print('4. Salir')
        opcion = int(input('Digite una opción de menú (1-4):'))
    except Exception as e:
        print(f'Ocurrio un eror de tipo:{e}')
        opcion = None
    else:
        print('Salimos del programa')
        
