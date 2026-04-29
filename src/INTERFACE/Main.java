package INTERFACE;

public class Main {
    public static void main(String[] args) {
        Pessoa idb = new Pessoa();

        idb.conectar("Tales", "2938");
        idb.executar("Execute");
        idb.desconectar();
    }
}
