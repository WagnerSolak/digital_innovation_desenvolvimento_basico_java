package one.digitalinovation.classes.usuario;

public class ProgramDoSuperUsuario {
    public static void main(String[] args) {
        final var superUsuario = new SuperUsuario("root", "1234");
        superUsuario.getLogin();

        superUsuario.getSenha();

        // aqui acessei o atributo nome pq foi usado o modificador default
        String root = superUsuario.nome;
    }
}
