
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Mensaje de inicio
        System.out.println("Iniciando el proceso de copia... crucemos los dedos");
        try (
                // creo e indico los FileInputStream y FileOutputStream
                FileInputStream inputStream = new FileInputStream("foto.jpg");
                // Pongo false para sobreescribir el archivo si lo hubiese de texto2.txt
                //FileOutputStream outputStream = new FileOutputStream("foto2.jpg", false);

                // Utilizo true para que añada al final en vez de sobreescribir
                FileOutputStream outputStream = new FileOutputStream("foto2.jpg", true);
        ){
            // variable para el numero de byte
            int numeroByte;

            // Bucle while para leer byte a byte el archivo texto1.txt
            // cuando llega al final el valor es -1 con el bucle leemos hasta que el valor es -1 osea el ultimo byte
            while ((numeroByte = inputStream.read()) != -1) {
                // Escribir cada byte en texto2.txt
                outputStream.write(numeroByte);
            }
            // Mensaje de confirmacion
            System.out.println("Copia realizada con exito!");

            // catch IOException
        } catch (IOException e) {

            System.out.println("Se produjo un error: " + e.getMessage());
        }
    }
}