package es.etg.dam.psp;

import java.io.IOException;
import java.nio.file.Path;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class CopiadorVerificador {

    public static final String MSG_EXITO = "Son iguales";
    public static final String MSG_ERROR_LEER = "Error al leer del fichero";
    public static final String MSG_ERROR_HASH = "Error con el algoritmo SHA-256";

    public static void copiarYVerificar(Path origen, Path destino) {
        try {
            byte[] msgOrigen = FileUtil.leer(origen);
            FileUtil.escribir(msgOrigen, destino);
            byte[] msgDestino = FileUtil.leer(destino);

            boolean compro = Arrays.equals(UtilHash.generarHash(msgOrigen), UtilHash.generarHash(msgDestino));

            if (compro) {
                UtilLog.escribirLog(MSG_EXITO);
            }
        } catch (IOException e) {
            UtilLog.escribirLog(MSG_ERROR_LEER);
        } catch (NoSuchAlgorithmException e) {
            UtilLog.escribirLog(MSG_ERROR_HASH);
        }
    }
}