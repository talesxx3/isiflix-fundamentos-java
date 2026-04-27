package POO;

public class Carro {
    // caracteristicas
    String marca;
    String modelo;
    int ano;
    String cor;
    int km;
    double preco;

    // Metodo para exibir as informacoes
    public void exibirAnuncio() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("KM: " + km);
        System.out.println("Preco: " + preco);
    }

    // Metodo para simular seguro
    public void simularSeguro(int perfil) {
        if (perfil == 0) {
            System.out.println("Perfil: Idoso - 1.5%");
            System.out.println("R$ " + preco * 0.015);
        } else if (perfil == 1) {
            System.out.println("Perfil: Chefe de familia - 2.5%");
            System.out.println("R$ " + preco * 0.025);
        } else if (perfil == 2) {
            System.out.println("Perfil: Jovem - 14%");
            System.out.println("R$ " + preco * 0.14);
        } else {
            System.out.println("Nao temos esse perfil");
        }
    }

    // Metodo para calcular ipva
    double calcularIPVA() {
        double valorIPVA;
        if (ano <= 2002) {
            valorIPVA = 0;
        } else {
            valorIPVA = preco * 0.035;
        }
        return valorIPVA;
    }
}
