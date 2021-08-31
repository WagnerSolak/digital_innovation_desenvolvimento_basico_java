package one.digitalinovation.datas;

import java.util.Date;

public class Desafio {

    public static void main(String[] args) {

        // Descubra o timeMilis do dia que você nasceu
        // Converta em um objeto Date
        // Verifique se ele é anterior ou posterior a 15 de maio de 2010

        Long currentTimeMillis =  405918000000L;
        Date dataNascimento = new Date(currentTimeMillis);

        System.out.println(dataNascimento);

        Date dataAniversario = new Date(405918000000L);
        Date dataPresente = new Date(1273892400000L);

        boolean isAfter = dataAniversario.after(dataPresente);
        boolean isBefore = dataAniversario.before(dataPresente);
        System.out.println("A data do aniversário é anterior a data 15/05/2010? " + isBefore);
        System.out.println("A data do aniversário é posterior a data 15/05/2010? " + isAfter);

        if (isAfter == true){
            System.out.println("A data de aniversário é posterior a data 15/05/2010");
        }else{
            System.out.println("A data de aniversário é anterior a data 15/05/2010");
        }

        // Current milis obtido em https://currentmillis.com/

    }
}
