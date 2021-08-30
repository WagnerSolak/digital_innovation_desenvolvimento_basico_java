package one.digitalinovation.strings;

public class Strings {

    public static void main(String[] args) {
        final var nome = "Wagner";
        final var sobrenome = "Martins";
        final var nomeCompleto = nome + sobrenome;
        System.out.println(nome);
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Nome completo do cliente: " + nomeCompleto);

        var string = new String(" Minha  String ");

        System.out.println("Char na posição: " + string.charAt(5));
        System.out.println("Quantidade=" + string.length());
        System.out.println("Sem Trim [" + string + "]");
        System.out.println("Com Trim [" + string.trim() + "]");
        System.out.println("Lower " + string.toLowerCase());
        System.out.println("Upper " + string.toUpperCase());
        System.out.println("Contém M?" + string.contains("M"));
        System.out.println("Contém X?" + string.contains("X"));
        System.out.println("Replace " + string.replace("n", "$"));
        System.out.println("Equals ? " + string.equals("Minha String"));
        System.out.println("EqualsIgnoreCase?" + string.equalsIgnoreCase("minha sTrinG"));
        System.out.println("Substring(1,6)=" + string.substring(1,6));
        //desafio
        System.out.println("A B C D E F G" + string.toCharArray());
        System.out.println("Aula de Java" + string.split(""));
        System.out.println("Aula " +string.concat("de Java"));
        System.out.println("1234 asda qw" + string.replaceAll("[0-9]", "#"));



    }
}
