package one.digitalinovation.datas.javaDateFormat;

import java.text.DateFormat;
import java.util.Date;

/*exemplo de formatação de datas com DateFormat*/
public class Exemplo008 {

    public static void main(String[] args) {

        Date agora = new Date();
        String dateToStr = DateFormat.getInstance().format(agora);
        System.out.println(dateToStr);

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(agora);
        System.out.println(dateToStr);

        //passando parâmetros para controlar o que
        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);

        System.out.println(dateToStr);

    }
}
