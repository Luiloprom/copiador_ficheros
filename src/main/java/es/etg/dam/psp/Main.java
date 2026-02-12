package es.etg.dam.psp;

public class Main {

    public static final int ARCHIVO_ORIGEN = 0;
    public static final int ARCHIVO_DESTINO = 1;

    public static void main(String[] args) throws Exception {
        byte[] msgOrigen = FileUtil.leer(args[ARCHIVO_ORIGEN]);
        byte[] hashOrigen = UtilHash.generarHash(msgOrigen);

        FileUtil.escribir(msgOrigen, args[ARCHIVO_DESTINO]);

        byte[] msgDestino = FileUtil.leer(args[ARCHIVO_DESTINO]);
        byte[] hashDestino = UtilHash.generarHash(msgDestino);

        if (UtilHash.comprobarHash(hashOrigen, hashDestino)) {
            System.out.println("Son iguales");
        }

    }
}