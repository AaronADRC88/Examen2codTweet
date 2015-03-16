package examensegundacodtwitter;

import javax.swing.JOptionPane;
import twitter4j.TwitterException;

public class ExamenSegundaCODTwitter {

    public static void main(String[] args) throws TwitterException {
        /**
         * instancia objeto tipo Metodos() Ventana para acceder a metodos
         * Ventana de opciones para usar los metodos
         */
        Metodos tweet = new Metodos();
        int option = JOptionPane.showOptionDialog(null, "selecciona opcion", "menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Mostrar TimeLine", "Buscar en Twitter", "Publica un tweet", "Salir"}, "Salir");
        if (option == 0) {
            tweet.timeLine();
        }
        if (option == 1) {
            tweet.buscar();
        }
        if (option == 2) {
            tweet.tweet();
        } else if (option != 0 && option != 1 && option != 2) {
            System.exit(0);
        }
    }
}
