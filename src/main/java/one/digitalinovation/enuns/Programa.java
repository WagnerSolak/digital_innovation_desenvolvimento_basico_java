package one.digitalinovation.enuns;

public class Programa {

    public static void main(String[] args) {
        //final TipoVeiculo tipoVeiculo = new TipoVeiculo();

        System.out.println(TipoVeiculo.TERRESTRE);
        System.out.println(TipoVeiculo.AQUATICO);

        //System.out.println(TipoVeiculo.valueOf("AEREO"));

        System.out.println(TipoVeiculo.valueOf("AEREO"));

        for (TipoVeiculo tipo : TipoVeiculo.values()) {
            System.out.println("Tipo: "+tipo);
        }

        System.out.println("Codigo do Status CLOSE :${Status.CLOSE.getCod()}");
        System.out.println("Texto do Status OPEN :${Status.OPEN.getTexto()}");
    }




}
