package one.digitalinovation.classes.cliente;

public class ProgramaDoCliente {

    public static void main(String[] args) {
        final var cliente = new Cliente((18));

        cliente.getIdade();
        cliente.getPeso();

        // não acessa porque está em outro pacote
        //System.out.println(cliente.relatorio());

    }
}
