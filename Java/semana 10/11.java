public class Persona{
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas 0= 0;

    //Contructor vacio
    public Persona(){
        this.id = ++Persona.numeroPersonas;
    }

    //Contructor con parámetros (sobrecarga de contructores)
    public Persona (String nombre, String tel, String email){
        this();
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    