//PARTE 1
package UTN.dominio;

public class Estudiantes { 
     private int idEstudiante;
     private string nombre;
     private string apellido;
     private string telefono;
     private string email;
     
     public estudiantes (){}//contructor para la llave primaria 
     
     
     
     
package UTN.datos; 
import UTN.dominio.Estudiantes;

import static _UTN.conexion.Conexion.getConnection;
import UTN ,dominio.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util. arrayList;
import java .util.List;

public class EstudiantesDA0 {
    
}

//PARTE 2
    //Metodo Listar
    public List<Estudiantes> Listar(){ 
        List<Estudiantes> estudiantes =_new  ArrayList<>();
        //Creamos algunos objetos que son necesarios para comunicarnos con la base de datos 
      PreparedStatement ps://Envia la sentencia a la base de datos 
      resultset rs;//Obtenemos el resultado de la base de datos 
      //Creamos un objeto de tipo conexion 
      Connection con=_getConnection();
      String sql= "SELEC * FROM "_
      
      
      
    }
