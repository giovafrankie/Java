/*
Primo programma del corso
 */
package project_2017_04_06;

import java.util.Scanner;

/**
 *
 * @author Giovanfrancesco
 */
public class Project_2017_04_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int age = 38;   // Crea una variabile di tipo intero
        age = 45;   // Cambio il valore della variabile
        System.out.println(age);

        float temperature = 18.6f;  // Creo una variabile di tipo float
        temperature = 45.2f;
        System.out.println(temperature);
        
        double piGreco = 3.14;  // Creo una variabile di tipo double
        piGreco = 3.14325465;
        System.out.println(piGreco);

        boolean isMaschio = true;   // Creo una variabile di tipo boolean
        isMaschio = false;
        System.out.println(isMaschio);
        
        age = age +10;  // Incremento di 10
        
        age += 5;   // Incremento di 5
        
        age++;  // Post incremento di 1
        
        ++age;  // Pre incremento di 1
        
        int days = age * 365;
        
        System.out.println("Sei vissuto: " + days + " giorni");
        
        int giorni = 31;
        int giorniPerSettimana = 7;
        
        int settimane = giorni/giorniPerSettimana;
        System.out.println(giorni + " giorni sono " + settimane + " settimane");
        
        float settimaneConVirgola = giorni/giorniPerSettimana;  // Il risultato è un float ma la divisione è tra interi e quindi il risultato è un intero convertito in float
        System.out.println(giorni + " giorni sono " + settimaneConVirgola + " settimane");
        
        float settimaneFloat = giorni/(float)giorniPerSettimana;    // Il casting è necessario per avere un risultato in float
        System.out.println(giorni + " giorni sono " + settimaneFloat + " settimane");
        
        
        String nome = "Giovanfrancesco";
        String cognome = "Amendolea";
        
        String anagrafica = nome + " " + cognome;   // Concatenazione di stringhe
        System.out.println("Nome e cognome sono " + anagrafica); // Stampo su schermo la concatenazione
        System.out.println("La lunghezza della variabile 'anagrafica' vale " + anagrafica.length() + " caratteri");
        
        int lunghezza = anagrafica.length();
        
        // Il metodo substring con 1 intervallo: indico il bit di fine (escluso), quello di partenza è il primo
        String suffisso = anagrafica.substring(5);
        System.out.println("Il metodo substring con un intervallo: " + suffisso);
        
        // Il metodo substring con 2 intervalli: bit di inizio (incluso) e quello di fine (escluso)
        String prefisso = anagrafica.substring(0,10);
        System.out.println("Il metodo substring con due intervalli: " + prefisso);
        
        // Converto in minuscolo una stringa
        String minuscolo = anagrafica.toLowerCase();
        System.out.println("Metodo che converte la stringa in minuscolo: " + minuscolo);
        
        // Converto in maiuscolo una stringa
        String maiuscolo = anagrafica.toUpperCase();
        System.out.println("Metodo che converte la stringa in minuscolo: " + maiuscolo);
        
        // Cambio una parte di una stringa (tutte le occorrenze)
        String cambioNome = anagrafica.replace("Giovanfrancesco", "Francesco");
        System.out.println("Metodo che cambia il nome: " + cambioNome);
        
        // Confronto (case sensitive) tra due stringhe
        boolean sonoUguali = anagrafica.equals("Hello World");
        System.out.println("Metodo che confronta due stringhe e dice se è vero o falso: " + sonoUguali);
        
        // Confronto (case insensitive) tra due stringhe
        boolean sonoUgualiInsensitive = anagrafica.equalsIgnoreCase("Hello World");
        System.out.println("Metodo che confronta due stringhe, non considerando maiuscole e minuscole, e dice se è vero o falso: " + sonoUgualiInsensitive);
        
        // Verifico che una stringa inizia con un'altra stringa
        String frase = "Hello World";
        boolean iniziaConFrase = frase.startsWith("Hello");
        System.out.println("Metodo che verifica se una stringa inizia con una data stringa: " + iniziaConFrase);
        
        // Verifico che una stringa inizia con un'altra stringa
        boolean terminaConFrase = frase.endsWith("rld");
        System.out.println("Metodo che verifica se una stringa termina con una data stringa: " + terminaConFrase);
        
        
        // Per leggere da tastiera
        Scanner leggiDaConsole = new Scanner(System.in);
        
        System.out.print("Inserisci quanti anni hai: ");
        int anno = leggiDaConsole.nextInt();
        System.out.println("Hai inserito " + anno);
        
        int giorniDiVita = anno * 365;
        System.out.println("Hai vissuto " + giorniDiVita + " giorni di vita");
        
    }
}
