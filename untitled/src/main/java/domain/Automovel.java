package domain;

public class Automovel {
    private String nome;
    private Integer portas;
    private String classe;

    public void novaClasse(String classe) {
        this.classe = classe;
    }

    @Override
    public String toString() {
        return "Automovel{" +
                "nome='" + nome + '\'' +
                ", portas=" + portas +
                ", classe='" + classe + '\'' +
                '}';
    }
}
