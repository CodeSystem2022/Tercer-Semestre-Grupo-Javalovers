
 //Creacion del try y del catch 
            try{
            var operacion = Integer.parteInt(entrada.nextLine());
            if (operacion > = 1 && operacion < = 4){
                System.out.println("Digite el valor para el operando1: ");
                var operando1 = Double.parseDouble(entrada.nextLine());
                System.out.println("Digite el valor para el operando2: ");
                var operando2 = Double.parseDouble(entrada.nextLine());
                int resultado;
                switch (operacion) {
                    case 1 -> { //Suma
                        resultado = operando1 + operando2;
                        System.out.println("Resultado de la suma: " + resultado);
                    }
                    case 2 -> { //Resta
                        resultado = operando1 - operando2;
                        System.out.println("Resultado de la resta: " + resultado);
                    }
                    case 3 -> { //Multiplicacion
                        resultado = operando1 * operando2;
                        System.out.println("Resultado de la multiplicacion: " + resultado);
                    }
                    case 4 -> { //Division
                        resultado = operando1 / operando2;
                        System.out.println("Resultado de la division: " + resultado);
                    }
                    default -> System.out.println("Opcion erronea: " + operacion);
                }// Fin switch
            } //Fin del if
            else if (operacion == 5){
                System.out.println("Hasta pronto.....");
                    break; //Rompe el ciclo y sale
            }
            else {
            System.out.println("Opcion erronea:" + operacion);
            }
            //Imprimimos un salto de linea antes de repetir el menu
             System.out.println();
        }catch (Excepcion e){//Fin try comienzo del catch
           System.out.println('ocurrio un error: '+e.getMessage());
           System.out.println();
        
        }//Fin while
    }//Fin main
}// Fin clase
