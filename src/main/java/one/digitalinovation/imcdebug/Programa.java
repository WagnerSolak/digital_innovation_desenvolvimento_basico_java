package one.digitalinovation.imcdebug;

import one.digitalinovation.imcdebug.imc.CalculadorDeImc;
import one.digitalinovation.imcdebug.pessoa.Pessoa;

public class Programa {
    public static void main(String[] args) {
        final Pessoa pessoa = new Pessoa("Wagner", 1.82, 80.00);

        final var calculadorDeImc = new CalculadorDeImc();
        final var imc = calculadorDeImc.calcula(pessoa);

        System.out.printf("IMC = %.2f", imc);
    }

}
