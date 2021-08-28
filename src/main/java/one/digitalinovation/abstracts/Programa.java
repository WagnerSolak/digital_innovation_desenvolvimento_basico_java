package one.digitalinovation.abstracts;

public class Programa {

    public static void main(String[] args) {

        //nao deixa pq é abstract
        //final FormaGeometrica formaGeometrica = new FormaGeometrica();

        final FormaGeometrica quadrado = new Quadrado("quadrado", 10.0);
        final FormaGeometrica quadrado2 = new Quadrado("quadrado", 20.0);
        final FormaGeometrica quadrado3 = new Quadrado("quadrado", 5.0);

        //método toString que vai imprimir la do FormaGeometrica
        System.out.println(quadrado);

        System.out.println(quadrado.desenha(12,34));
        System.out.println("Nome e área");
        System.out.println(quadrado.nome());
        System.out.println(quadrado.area());
    }
}
