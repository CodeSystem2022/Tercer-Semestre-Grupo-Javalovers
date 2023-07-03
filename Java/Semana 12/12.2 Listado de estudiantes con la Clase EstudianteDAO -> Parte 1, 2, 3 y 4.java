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
//parte 3 y 4
        //Metodo por id -> find by id
    public boolean buscarEstudiantePorId(Estudiante estudiante){
        PreparedStatement ps;
        ResultSet rs;
        Connection sql = "SELECT * FROM estudiantes2022 WHERE idestudiantes2022=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            rs = ps.executeQuery();
            if (rs.next()) {
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                return true; //se encontro un registro
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error al buscar estudiante: "+e.getMessage());
        }
        finally{
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("ocurrio un error al cerrar conexion"+e.getMessage());
            }//fin catch
        }//fin finally
        return false;

    }

    //Método agregar un nuevo estudiantes
    public boolean agregarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "INSERT INTO estudiantes2022 (nombre, apellido, telefono, email) VALUES (?, ?, ?, ?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());

        } catch(Exception e){
            System.out.println("Ocurrio un error al agregar estudiante: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        //Buscar por id
        var estudiante1 = new Estudiante(1);
        System.out.println("Estudiantes antes de la busqueda"+estudiante1);
        var encontrado = estudianteDao.buscarEstudiantePorId(estudiante1);
        if(encontrado){
            System.out.println("Estudiante encontrado"+ estudiante1);
        }else{
            System.out.println("No se encontro el estudiante: "+ estudiante1.getIdEstudiante());
        }
    }
}
