package one.digitalinovation.strings;

public class BuilderDeString {

    public static void main(String[] args) {
        var nome = "Wagner";
        //colocou a variavel nome dentro de builder
        final var builder = new StringBuilder(nome);
        System.out.println(builder.append("Solak"));
        // string de tras para frente
        final var reverse = builder.reverse();

        System.out.println(reverse);
        //insere caracteres em posicoes especificas da string
        // length => retorna vl da quantidade e insere o char
        final var insert = reverse.insert(0, "#").insert(reverse.length(), "#");
        System.out.println(insert);
    }

}
