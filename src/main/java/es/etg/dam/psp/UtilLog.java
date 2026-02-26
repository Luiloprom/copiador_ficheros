package es.etg.dam.psp;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class UtilLog {

    public static final String MSG_ERROR_LOG = "Fallo en fichero log";
    public static final String LOGGER = "Copiador";
    public static final String FICHERO_LOG = "copiar.log";

    public static void escribirLog(String mensaje) {
        try {
            Logger logger = Logger.getLogger(LOGGER);
            FileHandler fh = new FileHandler(FICHERO_LOG, false);
            SimpleFormatter formato = new SimpleFormatter();
            logger.addHandler(fh);
            fh.setFormatter(formato);
            logger.log(Level.INFO, mensaje);
            fh.close();
        } catch (IOException e) {
            throw new RuntimeException(MSG_ERROR_LOG);
        }
    }
}
