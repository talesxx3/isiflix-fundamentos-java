package POO;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.marca = "Porsche";
        c1.modelo = "Cayenne";
        c1.ano = 2022;
        c1.km = 0;
        c1.cor = "Preta";
        c1.preco = 2200000;


        c2.marca = "Ford";
        c2.modelo = "Escort";
        c2.ano = 1994;
        c2.km = 60000;
        c2.cor = "Azul";
        c2.preco = 8000;

        c1.exibirAnuncio();
        System.out.println("--------");
        c2.exibirAnuncio();

        c1.simularSeguro(3);

        System.out.println("Calculando Ipva");
        double ipvaC1 = c1.calcularIPVA();
        double ipvaC2 = c2.calcularIPVA();
        System.out.println("O IPVA do C1 É: " + ipvaC1);
        System.out.println("O IPVA do C2 É: " + ipvaC2);
    }
}
