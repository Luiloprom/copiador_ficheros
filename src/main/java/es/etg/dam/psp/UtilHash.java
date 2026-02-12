package es.etg.dam.psp;

import java.security.MessageDigest;

public class UtilHash {

    public static String FORMATO_HASH = "SHA-256";

    public static byte[] generarHash(byte[] contenido) throws Exception {
        MessageDigest mg = MessageDigest.getInstance(FORMATO_HASH);
        return mg.digest(contenido);
    }
}