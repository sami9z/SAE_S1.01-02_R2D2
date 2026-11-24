import java.awt.Font;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.invoke.VarHandle;

public class R2D2ttsZulu {
    private static final double FMIN = 150.0;
    private static final double FMAX = 3000.0;
    private static final String ALPHABET = "AÀBCÇDEÉÈFGHIJKLMNOPQRSTUVWXYZaàâbcçdeéèêëfgh'" +
            "iîïjklmnoôöpqrstuùvwxyz0123456789.;?";
    private static final double FREQUENCY_STEP = (FMAX - FMIN) / ALPHABET.length();
    private static final String VOYELLES = "AÀEÉÈIOUYaàâeéèiîïoôuùy";
    private static final String PONCTUATION = ",;:.?!" ;

    private static final int DUREE_VOYELLE_MS = 100;
    private static final int DUREE_CONSONNE_CHIFFRE_MS = 50;
    private static final int PAUSE_ENTRE_LETTRES_MS = 5;
    private static final int DUREE_ESPACE_MS = 50;
    private static final int DUREE_PONCTUATION_MS = 150;
    private static final int DUREE_SILENCE_FINAL_MS = 200;


    
    public static void main(String[] args) {
        double[] bruit = new double[StdAudio.SAMPLE_RATE] ; // durée 1s
        for (int i=0; i<bruit.length ; i++) {
            bruit[i] = -1 + 2 * Math.random() ;
        }
        StdAudio.play(bruit);
        StdAudio.save("bruit.wav", bruit);
    }

    /**
     * Traduit la chaine fournie en entrée en
     * un tableau d'échantillons représentant le signal audio
     * @param texte le texte à lire
     * @return le tableau des échantillons du signal audio
     */
    private static double[] sonDuTexte(String texte) {
        throw new RuntimeException() ;
    }

    /**
     * Génère le signal audio associé à un symbole 'prononçable'
     * @param symbole
     * @return le tableau des échantillons du signal audio
     */
    private static double[] sonDuSymbole(char symbole) {
        throw new RuntimeException() ;
    }

    /**
     * Calcule la durée audio du symbole en paramètre
     * @param symbole
     * @return durée en ms
     */
    private static int dureeSymboleMs(char symbole) {
        throw new RuntimeException() ;
    }

    /**
     * Calcule la durée audio du texte en paramètre
     * @param texte
     * @return durée en ms
     */
    private static int dureeDuTexteMs(String texte) {
        throw new RuntimeException() ;
    }

    /**
     * Calcule la fréquence de la sinusoïde associée au symbole
     * en paramètre.
     * @param symbole
     * @return fréquence associée au symbole, 0 si pas prononçable.
     */
    private static double frequence(char symbole) {
        throw new RuntimeException() ;
    }

    /**
     * Génère un signal sinusoïdal pur
     * @param frequence
     * @param dureeMs
     * @return tableau des échantillons
     */
    private static double[] sinus(double frequence, int dureeMs) {
        throw new RuntimeException() ;
    }

    /*************************************
     * Méthodes pour l'animation de R2D2 *
     *************************************/

    // Vous définirez ici les méthodes nécessaires pour l'animation de R2D2   
}