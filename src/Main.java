
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Mensaje de inicio
        System.out.println("Iniciando el proceso de copia... crucemos los dedos");
        try (
                // Creo los FileInputStream y FileOutputStream
                FileInputStream inputStream = new FileInputStream("foto.jpg");
                FileOutputStream outputStream = new FileOutputStream("foto2.jpg", true);

                // Creo los BufferedInputStream y BufferedOutputStream
                BufferedInputStream fileInputStream = new BufferedInputStream(inputStream);
                BufferedOutputStream fileOutputStream = new BufferedOutputStream(outputStream);
        ) {
            // variable para el numero de byte
            int numeroByte;

            // Bucle para leer byte a byte usando BufferedInputStream
            while ((numeroByte = fileInputStream.read()) != -1) {
                fileOutputStream.write(numeroByte);
            }

            // Mensaje de confirmación
            System.out.println("Copia realizada con éxito!");

            // catch IOException
        } catch (IOException e) {

            System.out.println("Se produjo un error: " + e.getMessage());
        }
    }
}