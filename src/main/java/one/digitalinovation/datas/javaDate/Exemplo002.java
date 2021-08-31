package one.digitalinovation.datas.javaDate;

import java.util.Date;

public class Exemplo002 {

    public static void main(String[] args) {

        Long currentTimeMillis = System.currentTimeMillis();

        System.out.println(currentTimeMillis);
        // 1630346895643
        Date novaData = new Date(currentTimeMillis);

        System.out.println(novaData);
        //Mon Aug 30 15:08:15 BRT 2021



    }
}
