package UTN.conexion;

import UTN.conexion.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;

public class main {
    public static void main(String[] args){
        var conexion = Conexion.getConnection();
        if(conexion != null)
            System.out.println("Conexion exitosa: "+conexion);
        else
            System.out.println("Error al conectarse");
    } // Fin main 
} // Fin clase

----------------------------------------------------------
public class Conexion {
    public static Connection getConnection(){
        Connection conexion = null ;
        //Variables para conectarnos a la base de datos
        var baseDatos = "estudiantes2022" ;
        var url = "jdbc:mysql:/localhost:3306/" + baseDatos;
        var usuario = "root";
        var password = " admin";

        //cargamos la clase del driver de mysql en memoria
        try{
           Class.foNome("com.mysql.cj.jdbc.Driver");
           conexion = DriverManager.getConnection(url, usuario, password); 
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Ocurrio un error en la conexion: "+e.getMessage());
        } // Fin catch
        return conexion;
        
    } // Fin metodo Connection
    

}
