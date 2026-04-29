package INTERFACE;

public class Pessoa implements InterfaceBD {
    @Override
    public void conectar(String usuario, String senha) {
        System.out.println("Conectando....");
    }

    @Override
    public void executar(String comando) {
        System.out.println("Executando....");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando....");
    }
}
