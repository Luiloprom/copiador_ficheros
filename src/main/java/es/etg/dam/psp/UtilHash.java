package es.etg.dam.psp;

import java.security.MessageDigest;
import java.util.Arrays;

public class UtilHash {

    public static String FORMATO_HASH = "SHA-256";

    public static byte[] generarHash(byte[] contenido) throws Exception {
        MessageDigest mg = MessageDigest.getInstance(FORMATO_HASH);
        return mg.digest(contenido);
    }

    public static boolean comprobarHash(byte[] hash1, byte[] hash2) {
        return (Arrays.equals(hash1, hash2));
    }
}