package test;

public class TestArgumentoVariables {
    public static void main(String [] args) {
        imprimirNumeros(3, 4, 5);
        imprimirNumeros(1, 2);
        variosParametros("Juan", "Perez", 7, 8, 9 );
    }
    private static void variosParametros(String nombre,String apellido, int ...numeros){
        System.out.println("Nombre: "+nombre+," Apellido: "+apellido);
        imprimirNumeros(numeros);
    }
    
