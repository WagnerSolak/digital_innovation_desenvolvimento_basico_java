package one.digitalinovation.operadores;

public class Relacionais {

    public static void main(String[] args) {
        final var numero = 6;

        if (numero > 20){
            System.out.println("O numero e maior que 20");
        } else if (numero >= 10){
            System.out.println("O numero e maior ou igual a 10");
        } else if (numero <=5){
            System.out.println("O numero e menor que 5");
        } else {
            System.out.println("nenhuma das anteriores");
        }
    }
}
