package one.digitalinovation.datas.javaLocalDate;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;
import static java.time.temporal.TemporalAdjusters.nextOrSame;

public class Exemplo011 {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        LocalDate ontem = hoje.minusDays(1);

        System.out.println(hoje);
        System.out.println(ontem);

        //Retorna uma cópia da data com o ajuste solicitado
        LocalDate proximaSegundaFeira =
                LocalDate.of(2021, 8, 31)
                        .with(nextOrSame(DayOfWeek.MONDAY));
        System.out.println(proximaSegundaFeira);

        //ultimoDiaMes
        LocalDate ultimoDiaMes =
                LocalDate.of(2021, 8, 1)
                        .with(lastDayOfMonth());
        System.out.println(ultimoDiaMes);
    }
}
