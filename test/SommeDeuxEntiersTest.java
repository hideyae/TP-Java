import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import SommeDeuxEntiers;

public class SommeDeuxEntiersTest {

    @Test
    void testSomme() {
        // Teste si la somme de 2 et 3 = 5
        assertEquals(5, SommeDeuxEntiers.somme(2, 3));
        
        // Teste si la somme de -1 et 1 = 0
        assertEquals(0, SommeDeuxEntiers.somme(-1, 1));
    }
}