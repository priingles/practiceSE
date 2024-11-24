package personal.priingles;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;
import personal.entities.Usr;
import personal.util.HibernateUtil;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    @Test
    public void testUserPersistence() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        // Create a new User
        Usr user = new Usr();
        user.setName("John Doe");
        user.setEmail("john.doe@example.com");

        // Save the user to the database
        session.save(user);
        transaction.commit();

        // Fetch the user back
        Usr retrievedUser = session.get(Usr.class, user.getId());
        assertNotNull(retrievedUser);
        assertEquals("John Doe", retrievedUser.getName());
        assertEquals("john.doe@example.com", retrievedUser.getEmail());

        session.close();
    }
}
