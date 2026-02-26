package es.etg.dam.psp;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class CopiadorVerificadorTest {

    @Test
    void copiarYVerificar(@TempDir Path tempDir) throws Exception {
        Path origen = tempDir.resolve("origen.txt");
        Path destino = tempDir.resolve("destino.txt");

        Files.writeString(origen, "Hola mundo");

        CopiadorVerificador.copiarYVerificar(origen, destino);

        String log = Files.readString(Path.of("copiar.log"));

        assertTrue(log.contains("Son iguales"));
        assertTrue(Files.exists(destino));
    }
}
