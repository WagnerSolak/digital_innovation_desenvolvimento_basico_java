package one.digitalinovation.datas.javaLocalDate;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Exemplo014 {

    public static void main(String[] args) {


        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);
        LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);
        System.out.println(futuro);

        //truncatedTo: Retorna uma cópia da data truncada pelo campo informado
        //útil para trazer o formato: HORA/MINUTO
        LocalTime horaMinuto = LocalTime.now().truncatedTo(ChronoUnit.MINUTES);
        System.out.println(horaMinuto);

        //withZoneSameInstant: Retorna cópia do mesmo instante em um fuso horario diferente
        ZonedDateTime horaSP = ZonedDateTime.of(2021, 8, 30, 20, 05, 0, 0
                , ZoneId.of("America/Sao_Paulo"));

        ZonedDateTime horaMadson = horaSP
                .withZoneSameInstant(ZoneId.of("America/Chicago"));

        System.out.println(horaSP);
        System.out.println(horaMadson);

        //Teste
        LocalDateTime dataHoraAgora = LocalDateTime.now();
        LocalDateTime dataHoraEspecifica =
                LocalDateTime.of(2021, 5, 15, 10, 00, 00, 00);
        LocalDateTime dataHoraEspecificaDoTexto = LocalDateTime.parse("2021-05-15T10:00:00");




    }
}
