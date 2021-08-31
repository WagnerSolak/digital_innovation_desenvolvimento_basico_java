package one.digitalinovation.datas.javaCalendar;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Exemplo005 {

    public static void main(String[] args) {

        Date dataInicio = new Date(151312480769L);
        System.out.println(dataInicio);
        // Tue Dec 12 22:26:47 BRST 2017

        Instant instant = dataInicio.toInstant();
        System.out.println(instant);
        // 2017-12 13T00:26:47.6912 => mais amigável para se manipular


    }
}
