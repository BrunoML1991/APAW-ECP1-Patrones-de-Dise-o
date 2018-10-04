package solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IconicCharacterFactoryTest {

    private IconicCharacter iconicCharacter,iconicCharacter2;
    private IconicCharacterFactory iconicCharacterFactory;

    @BeforeEach
    void beforeEach() {
        iconicCharacter = new IconicCharacter("1","Super Mario");
        iconicCharacter2 = new IconicCharacter("2","Samus Aran");
        iconicCharacterFactory = IconicCharacterFactory.getIconicCharacterFactory();
        iconicCharacterFactory.putIfAbsent(iconicCharacter);
        iconicCharacterFactory.putIfAbsent(iconicCharacter2);
    }

    @Test
    void testGetIconicCharacter (){

        assertEquals("Super Mario",iconicCharacterFactory.getIconicCharacter("1").getName());
        assertEquals("Samus Aran",iconicCharacterFactory.getIconicCharacter("2").getName());
    }
    @Test
    void testRemove (){
        iconicCharacterFactory.remove("1");
        assertEquals(null,iconicCharacterFactory.getIconicCharacter("1").getName());
    }

}
