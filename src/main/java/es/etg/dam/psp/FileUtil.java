package es.etg.dam.psp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtil {

    public static final String FORMAT_ERROR_ESCRIBIR = "A ocurrido un error al escribir en el fichero %s";

    public static byte[] leer(Path ruta) throws IOException {
        return Files.readAllBytes(ruta);
    }

    public static void escribir(byte[] contenido, Path ruta) {
        try {
            Files.write(ruta, contenido);
        } catch (IOException e) {
            UtilLog.escribirLog(String.format(FORMAT_ERROR_ESCRIBIR, ruta.toString()));
        }
    }

}
