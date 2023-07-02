import psycopg2 # Importamos el paquete que permite la conexion a PostgreSQL.

conexion = psycopg2.connect(
    user = 'postgres'
    password = 'Admin',
    host = '127.0.0.1',
    port = '5432',
    database = 'test_bd',
)

#Creamos el "cursor" que es el encargado de ejecutar las sentencias y las query entre el programa y la base de datos. 
cursor = conexion.cursor()
sentencia = 'SELECT * FROM persona'
cursor.execute(sentencia)
registros = cursor.fetchall() # Recuperamos todos los registros que seran una lista

print(registros)
