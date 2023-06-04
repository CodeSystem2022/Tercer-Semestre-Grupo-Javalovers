import psycopg2  #Esto es para poder conectarnos a 

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
