package one.digitalinovation.classes.pessoa;

import one.digitalinovation.classes.usuario.SuperUsuario;

public class ProgramaDoUsuario {

    public static void main(String[] args) {
        final var batman = new SuperUsuario("batman", "1234%&#@");

        batman.getLogin();

        //batman.getSenha(); //ERRO

        // mesmo sendo default do outro pacote eu não tenho acesso a ele
        //String nomeDoCliente = batman.nome; // ERRO
    }
}
