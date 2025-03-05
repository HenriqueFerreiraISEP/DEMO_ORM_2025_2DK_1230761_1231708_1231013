package isep.eapli.demo_orm;
import isep.eapli.demo_orm.MainMenu;
import isep.eapli.demo_orm.dominio.GrupoAutomovel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DemoORM {
    public static void main(String[] args) {
        GrupoAutomovel grupoAutomovel = new GrupoAutomovel();
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("DEMO_ORMPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(grupoAutomovel);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

        MainMenu.mainLoop();
    }
}