package one.digitalinovation.ifs;

public class IF {

    public static void main(String[] args) {
        final var condicao = false;

        if(condicao){
            System.out.println("A condiçao e verdadeira");
        } else{
            System.out.println("A condiçao e falsa");
        }

        // se possui uma condição não é necessário chaves
        if(condicao) {
            System.out.println("Uma unica linha...");
        }

        final var ternario = condicao ? "e verdadeira" : "e false";

        System.out.println(ternario);
    }
}
