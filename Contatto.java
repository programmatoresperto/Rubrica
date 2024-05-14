
public class Contatto {
    public String nome;
    public String cognome;
    public String telefono;
    public String nascosto;

    public String  stampa(){
        return String.format("Nome: %s Cognome: %s Telefono: %s", nome, cognome, telefono);
    }
}

