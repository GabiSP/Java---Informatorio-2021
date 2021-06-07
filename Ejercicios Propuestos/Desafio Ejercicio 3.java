import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DesafioEjercicio3 {
    /*  
    Ejercicio 3:
    Dado un archivo de texto (alumnos.txt), crear una función que lea todos los nombres de los alumnos y los imprima por pantalla.
    Observación:
    Cada línea del archivo representa un nombre de alumno.
    */
    public static void main(String args[]) throws IOException {
        String path = "C:/Cursos/Informatorio/alumnos.txt";
        
        try (BufferedReader br = new BufferedReader (new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();                    
            }
        }

    }
    
}