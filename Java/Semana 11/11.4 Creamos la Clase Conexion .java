package UTN.conexion;

import java.sql.Connection;

public class Conexion {
    public static Connection getConnection(){
        Connection conexion = null ;
        //Variables para conectarnos a la base de datos
        var baseDatos = "estudiantes2022" ;
        var url = "jdbc:mysql:/localhost:3306/" + baseDatos;
        var usuario = "root";
        var password = " admin";

        //cargamos la clase del driver de mysql en memoria
        Class.foNome("com.mysql.cj.jdbc.Driver");
        conexion = 
    }
}