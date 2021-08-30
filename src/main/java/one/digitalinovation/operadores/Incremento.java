package one.digitalinovation.operadores;

public class Incremento {

    public static void main(String[] args) {

        var numero = 1;

        //primeiro incrementa depois avalio a expressão (sinal a esquerda)
        System.out.println(++numero); // numero = numero +1;

        var variavel = 10;
        //primeiro avalio a expressao depois incrementa
        System.out.println(variavel--);
        System.out.println(variavel);
    }
}
