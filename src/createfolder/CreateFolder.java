package createfolder;

import java.io.File;
import java.util.Scanner;

/** @author Mexicans13 */
public class CreateFolder {

    public static void createFolder(int folder){
        
        String path = "C:\\Users\\tu\\ruta\\"+ folder;
        File archivo = new File(path); //Ruta donde se va guardar
        if (!archivo.exists()) { //Si no existe
            if (archivo.mkdir())
                System.out.println("Carpeta "+ folder +" creada.");
            else
                System.out.println("Error al crear la carpeta "+ folder +".");
        } else
            System.out.println("La carpeta "+ folder +" ya exite.");
    }
    
    public static int isNumber(){
        Scanner entrada = new Scanner(System.in); //Uso del teclado
        int number;
        do {
            while (!entrada.hasNextInt()) { //Detecta aquello que no sea un número
                System.out.println("Ingrese solo números positivos.");
                entrada.next(); // Seguir intentando
            }
            number = entrada.nextInt();
        } while (number < 0);
        return number; //Retornamos el número que haga ingresado
    }
    
    /** @param args the command line arguments */
    public static void main(String[] args) {
        int nombre = 0, cantidad = 0;
        
        System.out.print("\nIngresa el id de carpeta a crear: ");
        nombre = isNumber(); //Validamos que solo sena números
        
        System.out.print("\nCuantas veces realizar: ");
        cantidad = isNumber(); //Validamos que solo sean números
        
        for (int veces = 0; veces < cantidad; veces++) {
            createFolder(nombre++); //Creamos N cantidad de carpetas
        }
    }
}
