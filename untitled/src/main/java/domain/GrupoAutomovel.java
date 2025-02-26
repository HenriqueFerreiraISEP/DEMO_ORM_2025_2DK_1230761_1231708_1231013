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
}
