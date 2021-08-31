package one.digitalinovation.datas.javaLocalDate;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Exemplo013 {

    public static void main(String[] args) {
        LocalTime agora = LocalTime.now();

        System.out.println(agora);

        LocalTime maisUmaHora = agora.plusHours(1);
        System.out.println(maisUmaHora);

    }
}
