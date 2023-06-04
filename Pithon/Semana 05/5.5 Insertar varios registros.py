import psycopg2  #Esto es para poder conectarnos a Postgre

conexion = psycopg2.connect(
    user= 'postgres',
    password= 'admin',
    host= '127.0.0.1',
    port='5432',
    database='test_bd'
)
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'INSERT INTO persona (nombre, apellido, email)VALUES (%s, %s, %s)' #Plceholder
            valores = (
                ('Carla', 'Lara', 'clara@gmail.com'),
                ('Marcos', 'Canto', 'mcanto@gmail.com'),
                ('Marcelo', 'Cuenca', 'cuencaM@gmail.com')
            )# Es una tupla de tuplas
            cursor.execcutemany(sentencia, valores) #De esta manera ejecutamos la sencencia 
            #conexion.commit() esto se utiliza para guardar los cambios en la base de datos
            registros_insertados = cursor.rowcount 
            print(f'Los registros insertados son: {registros_insertados}')
                
except Exception as e:
    print(f'Ocurrió un error: {e}')
finally: 
    conexion.close()
