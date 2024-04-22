package esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.Scanner;

// TRACE<DEBUG<INFO<WARN<ERROR

public class esercizio1 {
    static Logger logger = LoggerFactory.getLogger("logger1");
    public static void main(String[] args) {
        logger.debug("Sto lanciando l'applicazione");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];
        for(int i=0; i<array.length; i++){
            array[i]= random.nextInt(10)+1;
            System.out.println(array[i] + " ");
        }

        int numero;
        int posizione;
        do {
            System.out.println("Inserisci un numero nell'array (0 per terminare) ");
            numero = scanner.nextInt();
            if (numero==0){
                break;
            }
            System.out.println("Inserisci la posizione specifica (da 0 a 4)");
            posizione = scanner.nextInt();
            array[posizione]=numero;

            System.out.print("Nuovo stato dell'array: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        } while (true);

    }
}
