/*import java.util.Scanner;
import static tools.utility.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String []operazioni={"Rubrica telefonica",
                "[1] Nuovo contatto",
                "[2] Visualizza contatti",
                "[3] Riservato",

        };
        final int max = 100;
        int contattiInseriti=0;
        int posizione=0;
        String passwrod;
        boolean fine=true;
        Contatto []rubrica = new Contatto[100];
        String password = Password(input);
        do{


        switch (menu(operazioni, input)){
            case 1:
                if(contattiInseriti<max){
                    rubrica[contattiInseriti]=Inserimento(input);
                    contattiInseriti++;
                }else System.out.println("Limite raggiunto");

                break;

            case 2:
                if(contattiInseriti<max){
                Visualizza(rubrica, contattiInseriti);
                }else System.out.println("Limite raggiunto");

                break;
            case 3:
                if(password!=null){
                    Riservato(input, password, rubrica, contattiInseriti);
                }
                break;
            default:
                fine = false;
                break;

            }
        }while(fine);



    }




    private static Contatto Inserimento(Scanner input) {
        Contatto contatto = new Contatto();
        System.out.println("Inserire il nome");
        contatto.nome=input.nextLine();
        System.out.println("Inserire il cognome");
        contatto.cognome=input.nextLine();
        System.out.println("Inserire il numero di telefono");
        contatto.telefono=input.nextLine();
        System.out.println("Il contatto inserito deve essere nascosto (si o no)");
        contatto.nascosto=input.nextLine();
        return contatto;
    }
    private static void Visualizza(Contatto[] rubrica, int contattiInseriti) {
        for(int i=0; i<contattiInseriti; i++){
            if(rubrica[i].nascosto.equals("si")){
                continue;
            }
            System.out.println(rubrica[i].stampa());
        }
    }
    private static String Password(Scanner input) {
        String password;
        System.out.println("Tramite questa funzione si possono visualizzare i contatti nascosti");
        System.out.println("Impostare la password");
        password=input.nextLine();
        return password;
    }
    private static void Riservato(Scanner input, String password, Contatto[] rubrica, int contattiInseriti) {
        String tentativo;
        System.out.println("Inserire la password");
        tentativo=input.nextLine();
        if(tentativo.equals(password)){
            for(int i=0; i<contattiInseriti; i++){
                System.out.println(rubrica[i].stampa());
            }
        }else {
            System.out.println("Password errata");
            System.out.println("Spegnimento in corso");
            Protezione();
        }


    }

    private static void Protezione() {
        System.exit(0);
    }
}*/
import java.util.Scanner;
import static tools.utility.*;

public class Main {
    public static void main(String[] args) {
        // Inizializzazione dello Scanner per l'input utente
        Scanner input = new Scanner(System.in);

        // Array di stringhe che rappresenta il menu delle operazioni disponibili
        String[] operazioni = {
                "Rubrica telefonica",
                "[1] Nuovo contatto",
                "[2] Visualizza contatti",
                "[3] Riservato",
                "[4] Fine"
        };

        // Costante che rappresenta il numero massimo di contatti nella rubrica
        final int max = 100;

        // Variabili per tenere traccia del numero di contatti inseriti e della posizione attuale
        int contattiInseriti = 0;
        int posizione = 0;

        // Variabili per la gestione della password
        boolean fine = true;

        // Array di oggetti Contatto per memorizzare i contatti
        Contatto[] rubrica = new Contatto[100];

        // Richiesta e memorizzazione della password
        String password = Password(input);

        // Ciclo principale per mostrare il menu e gestire le operazioni
        do {
            // Switch-case per selezionare l'operazione desiderata
            switch (menu(operazioni, input)) {
                case 1:
                    // Aggiunta di un nuovo contatto se non è stato raggiunto il limite
                    if (contattiInseriti < max) {
                        rubrica[contattiInseriti] = Inserimento(input);
                        contattiInseriti++;
                    } else {
                        System.out.println("Limite raggiunto");
                    }
                    break;

                case 2:
                    // Visualizzazione dei contatti se non è stato raggiunto il limite
                    if (contattiInseriti < max) {
                        Visualizza(rubrica, contattiInseriti);
                    } else {
                        System.out.println("Limite raggiunto");
                    }
                    break;

                case 3:
                    // Accesso ai contatti riservati se è stata impostata una password
                    if (password != null) {
                        Riservato(input, password, rubrica, contattiInseriti);
                    }
                    break;

                default:
                    // Uscita dal ciclo
                    fine = false;
                    break;
            }
        } while (fine);
    }

    // Metodo per l'inserimento di un nuovo contatto
    private static Contatto Inserimento(Scanner input) {
        Contatto contatto = new Contatto();
        System.out.println("Inserire il nome");
        contatto.nome = input.nextLine();
        System.out.println("Inserire il cognome");
        contatto.cognome = input.nextLine();
        System.out.println("Inserire il numero di telefono");
        contatto.telefono = input.nextLine();
        System.out.println("Il contatto inserito deve essere nascosto (si o no)");
        contatto.nascosto = input.nextLine();
        return contatto;
    }

    // Metodo per la visualizzazione dei contatti
    private static void Visualizza(Contatto[] rubrica, int contattiInseriti) {
        for (int i = 0; i < contattiInseriti; i++) {
            // Ignora i contatti nascosti
            if (rubrica[i].nascosto.equals("si")) {
                continue;
            }
            System.out.println(rubrica[i].stampa());
        }
    }

    // Metodo per impostare la password per l'accesso ai contatti riservati
    private static String Password(Scanner input) {
        String password;
        System.out.println("Tramite questa funzione si possono visualizzare i contatti nascosti");
        System.out.println("Impostare la password");
        password = input.nextLine();
        return password;
    }

    // Metodo per accedere ai contatti riservati
    private static void Riservato(Scanner input, String password, Contatto[] rubrica, int contattiInseriti) {
        String tentativo;
        System.out.println("Inserire la password");
        tentativo = input.nextLine();
        // Se la password è corretta, visualizza tutti i contatti
        if (tentativo.equals(password)) {
            for (int i = 0; i < contattiInseriti; i++) {
                System.out.println(rubrica[i].stampa());
            }
        } else {
            // Se la password è errata, termina il programma
            System.out.println("Password errata");
            System.out.println("Spegnimento in corso");
            Wait(3);
            Protezione();
        }
    }

    // Metodo per terminare il programma
    private static void Protezione() {
        System.exit(0);
    }
}
