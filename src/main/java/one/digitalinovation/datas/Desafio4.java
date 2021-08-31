package one.digitalinovation.datas;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Desafio4 {

    public static void main(String[] args) {


        // Adicione 4 anos, 6 meses e 13 horas ao momento 15/05/2010 10:00:00

        ZonedDateTime dataPresente =
                ZonedDateTime.of(2010,05, 15
                        , 10, 00, 00, 00,
                        ZoneId.of("America/Sao_Paulo"));

        ZonedDateTime dataFutura = dataPresente.plusYears(4).plusMonths(6)
                .plusHours(13);
        System.out.println(dataFutura);

    }
}
