package one.digitalinovation.datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Desafio3 {

    public static void main(String[] args) {

        //Converter data para formatdo DD/MM/YYYY HH:MM:SS:MMM

        Date agora = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:mmm");
        String dataFormatada = formatter.format(agora);
        System.out.println(dataFormatada);


    }
}


