package isep.eapli.demo_orm.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GrupoAutomovel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Integer portas;
    private String classe;

    public GrupoAutomovel(String nome, Integer portas, String classe) {
        this.nome = nome;
        this.portas = portas;
        this.classe = classe;
    }

    public GrupoAutomovel() {

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


