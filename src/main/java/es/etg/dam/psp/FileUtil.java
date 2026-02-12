package es.etg.dam.psp;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtil {

    public static byte[] leer(String ruta) throws Exception {
        return Files.readAllBytes(Path.of(ruta));
    }

    public static void escribir(byte[] contenido, String ruta) throws Exception {
        Files.write(Path.of(ruta), contenido);
    }

}
