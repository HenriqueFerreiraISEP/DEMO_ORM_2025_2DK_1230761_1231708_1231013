package domain;

public class GrupoAutomovel {
    private String nome;
    private Integer portas;
    private String classe;


    private GrupoAutomovel() {
        // for ORM
    }

    public void novoNumPortas(Integer portas) {
        this.portas = portas;
    }

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


