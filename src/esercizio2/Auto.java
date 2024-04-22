package esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Auto {
    static Logger logger = LoggerFactory.getLogger("logger1");
    public static void main(String[] args) {
        logger.debug("Sto lanciando l'applicazione");
        Scanner scanner = new Scanner(System.in);


try {
    System.out.println("Km percorsi dall'auto: ");
    int km = scanner.nextInt();
    System.out.println("Litri carburante consumati: ");
    int litri = scanner.nextInt();

    if (litri == 0) {
        throw new IllegalArgumentException("IL numero di litri non può essere 0");
    }

    int consumo = km / litri;
    System.out.println("Il consumo é :" + consumo);
} catch (IllegalArgumentException e){
    System.out.println("Errore: " + e.getMessage());
} catch (Exception e){
    System.out.println("Errore generico: " + e.getMessage());
}

    }
}
