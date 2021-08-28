package one.digitalinovation.finals;

public class Gamer {

    public String keyboard(){
        return "Keyboard Gamer!";
    }

    // quem herda gamer não estende mouse
    public final String mouse(){
        return "Mouse Gamer";
    }
}
