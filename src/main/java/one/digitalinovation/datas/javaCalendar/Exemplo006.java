package one.digitalinovation.datas.javaCalendar;

import java.util.Calendar;

public class Exemplo006 {

    public static void main(String[] args) {

        //Calendar instância de getInstance
        Calendar agora = Calendar.getInstance();
        System.out.println("Data corrente : "+ agora.getTime());

        //adicionando informação a data
        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás : " + agora.getTime());

        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: " + agora.getTime());

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois : " + agora.getTime());
    }
}
