import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DesafioEjercicio4 {
    /*
    Ejercicio 4:
    Teniendo una lista de objetos Empleado, cargar la misma en un archivo empleado.txt.
    Observación:
    Cada empleado se almacena en una sola líne con el formato que uds definan.
    */
    public static void main(String[] args) throws IOException {
        List<String> empleados = new ArrayList<>();
        cargarLista(empleados);

        System.out.println("Cantidad de empleados: " + empleados.size());
        System.out.println("Lista de Empleados: ");
        
        //Recorrer la lista, mostrar y enviar a un archivo
        String path = "C:/Cursos/Informatorio/empleados.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String empleado: empleados){
                System.out.println(empleado);
                bw.write(empleado);
                bw.write("\r\n");
            }
            bw.close();
        }
    }

    public static void cargarLista(List<String> empleados) {
        empleados.add("123, Juan ");
        empleados.add("234, Maria");
        empleados.add("345, Lisa");
        empleados.add("456, Homero");
        empleados.add("567, Miguel");
    }
}