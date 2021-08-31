package one.digitalinovation.datas.javaDate;

import java.util.Date;

public class Exemplo004 {

    public static void main(String[] args) {

        Date dataNoPassado = new Date(1513124807691L);

        Date dataNoFuturo = new Date(1613124807691L);

        Date mesmaDataNoFuturo = new Date(1613124809691L);

        //Comparando se as datas são iguais
        boolean isEquals = dataNoFuturo.equals(mesmaDataNoFuturo);

        System.out.println(isEquals); // true

        //Comparando uma data com a outra
        int compareCase1 = dataNoPassado.compareTo(dataNoFuturo); // passado -> futuro
        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado); // futuro ->  passado
        int compareCase3 = dataNoFuturo.compareTo(dataNoFuturo); // data equivalentes

        System.out.println(compareCase1);// -1 => anterior a data comparada
        System.out.println(compareCase2); // 1 => data futuro a frente da data comparada
        System.out.println(compareCase3); // 0
    }
}
