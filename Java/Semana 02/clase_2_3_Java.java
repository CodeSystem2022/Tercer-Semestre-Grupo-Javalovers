package test;

public class clase_2_3_Java {
    public static void main (String[] args){
        System.out.printIn("Dia 1: "+Dias.LUNES);
        indicarDiaSemana(Dias.LUNES)
    }

    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                 System.out.printIn("Primer dia de la semana");
                 break;
            case MARTES:
                 System.out.printIn("Segundo dia de la semana");
                 break;
            case MIERCOLES:
                 System.out.printIn("Tercer dia de la semana");
                 break;
            case JUEVES:
                 System.out.printIn("Cuarto dia de la semana");
                 break;
            case VIERNES:
                 System.out.printIn("Quinto dia de la semana");
                 break;
                 case SABADO:
                 System.out.printIn("Sexto dia de la semana");
                 break;
            case DOMINGO:
                 System.out.printIn("Septimo dia de la semana");
                 break;         
        }
    }
}