package es.etg.dam.psp;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtil {

    public static byte[] leer(Path ruta) throws Exception {
        return Files.readAllBytes(ruta);
    }

    public static void escribir(byte[] contenido, Path ruta) throws Exception {
        Files.write(ruta, contenido);
    }

}
