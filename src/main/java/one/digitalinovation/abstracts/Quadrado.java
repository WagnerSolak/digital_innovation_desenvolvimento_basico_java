package one.digitalinovation.abstracts;

public class Quadrado extends FormaGeometrica{

    private String nome;
    private Double area;

    public Quadrado(String nome, Double area) {
        this.nome = nome;
        this.area = area;
    }

    // Obrigatorio esses métodos sobreescritos que vem de
    @Override
    public String nome(){
        return nome;
    }

    @Override
    public Double area(){
        return area;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "nome='" + nome + '\'' +
                ", area=" + area +
                '}';
    }
}
