package es.etg.dam.psp;

import java.nio.file.Path;
import java.util.Arrays;

public class CopiadorVerificador {

    public static boolean copiarYVerificar(Path origen, Path destino) throws Exception {
        byte[] msgOrigen = FileUtil.leer(origen);
        byte[] hashOrigen = UtilHash.generarHash(msgOrigen);

        FileUtil.escribir(msgOrigen, destino);

        byte[] msgDestino = FileUtil.leer(destino);
        byte[] hashDestino = UtilHash.generarHash(msgDestino);

        return Arrays.equals(hashOrigen, hashDestino);
    }

}