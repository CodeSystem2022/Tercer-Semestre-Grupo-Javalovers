paquete  UTN . datos ;
importar  UTN . dominio _ estudiante ;
importar  UTN estático  . conexión _ Conexión _ obtenerConexión ;
importar  Java . sql . conexión ;
importar  Java . sql . DeclaraciónPreparada ;
importar  Java . sql . conjunto de resultados ;
importar  Java . útil _ Lista de arreglos ;
importar  Java . útil _ lista ;
 clase  pública EstudianteDAO {
    //método listar
    public  Lista < Estudiante > listar (){
        List < Estudiante > estudiantes = new  ArrayList <>();
        // Creamos algunos objetos que son necesarios para comunicarnos con la base de datos
        Declaración Preparada  ps ; // Envía la sentencia a la BD
        Conjunto de resultados  rs ; // Obtenemos el resultado de la BD
        // Creamos un objeto de tipo conexion
        Conexión  con = getConnection ();
        String  sql = "SELECCIONAR * DE estudiantes2022 ORDENAR POR idestudiantes2022" ;
        prueba {
            pd = estafa . prepararDeclaración ( sql );
            rs = pd . ejecutar consulta ();
            while ( rs . siguiente ()){
                var  estudiante = nuevo  Estudiante ();
                estudiante _ setIdEstudiante ( rs . getInt ( "idestudiantes2022" ));
                estudiante _ setNombre ( rs . getString ( "nombre" ));
                estudiante _ setApellido ( rs . getString ( "apellido" ));
                estudiante _ setTelefono ( rs . getString ( "telefono" ));
                estudiante _ setEmail ( rs . getString ( "correo electrónico" ));
                // Falta agregarlo a la lista
                estudiantes _ añadir ( estudiante );
            }
        } captura ( Excepción  e ){
            sistema _ fuera _ println ( "Ocurrió un error al seleccionar datos: " + e . getMessage ());
        }
        finalmente {
            prueba {
                estafa _ cerrar ();
            } captura ( Excepción  e ){
                sistema _ fuera _ println ( "Ocurrió un error al cerrar la conexión: " + e . getMessage ());
            }
        } // aleta finalmente
        volver  estudiantes ;
    } //Fin método listar
    //Método por id -> Fin by id
     booleano  público buscarEstudiantePorId ( Estudiante  estudiante ){
        Declaración Preparada  ps ;
        Conjunto de resultados  rs ;
        Conexión  con = getConnection ();
        String  sql = "SELECT * FROM estudiantes2022 DONDE idestudiantes2022=?" ;
        prueba {
            pd = estafa . prepararDeclaración ( sql );
            p.d. _ setInt ( 1 , estudiante . getIdEstudiante ());
            rs = pd . ejecutar consulta ();
            si ( rs . siguiente ()){
                    estudiante _ setNombre ( rs . getString ( "nombre" ));
                    estudiante _ setApellido ( rs . getString ( "apellido" ));
                    estudiante _ setTelefono ( rs . getString ( "telefono" ));
                    estudiante _ setEmail ( rs . getString ( "correo electrónico" ));
                    devolver  verdadero ; // se encontró un registro
            } // fin si
        } captura ( Excepción  e ){
            sistema _ fuera _ println ( "Ocurrió un error al buscar estudiante: " + e . getMessage ());
        } // captura de aletas
        finalmente {
            prueba {
                estafa _ cerrar ();
            } captura ( Excepción  e ){
                sistema _ fuera _ println ( "ocurrio un error al cerrar la conexion: " + e . getMessage ());
            } //captura de aleta
        } // fin finalmente
        devolver  falso ;
    }
    
    //metodo agregar un nuevo estudiante
    public  booleano  agregarEstudiante ( Estudiante  estudiante ){
        Declaración Preparada  ps ;
        Conexión  con = getConnection ();
        String  sql = "INSERTAR EN estudiantes2022 (nombre,apellido,teléfono,email) VALORES (?,?,?,?)" ;
        prueba {
            pd = estafa . prepararDeclaración ( sql );
            p.d. _ setString ( 1 , estudiante . getNombre ());
            p.d. _ setString ( 2 , estudiante . getApellido ());
            p.d. _ setString ( 3 , estudiante . getTelefono ());
            p.d. _ setString ( 4 , estudiante . getEmail ());
            p.d. _ ejecutar ();
            devolver  verdadero ;
            
        } captura ( Excepción  e ){
            sistema _ fuera _ println ( "Error al agregar un estudiante: " + e . getMessage ());
        } //captura de aleta
        finalmente {
            prueba {
                estafa _ cerrar ();
            } captura ( Excepción  e ){
                sistema _ fuera _ println ( "Error al cerrar la conexion: " + e . getMessage ());
            } //captura de aleta
            
        } // fin finalmente
        devolver  falso ;
    } //fin metodo agregarEstudiante