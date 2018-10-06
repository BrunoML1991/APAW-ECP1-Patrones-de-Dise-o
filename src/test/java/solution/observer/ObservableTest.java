package solution.observer;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solution.IconicCharacter;
import solution.IconicCharacterFactory;

import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObservableTest {

    private IconicCharacter iconicCharacter, iconicCharacter2, checker, checkerUnsubscribe;
    private IconicCharacterFactory iconicCharacterFactory;

    @BeforeEach
    void beforeEach() {
        iconicCharacterFactory = IconicCharacterFactory.getIconicCharacterFactory();
        iconicCharacterFactory.getObservable().subscribe(s -> {
            LogManager.getLogger(this.getClass()).info("Funciona!!!");
            checker = s;
        });
        iconicCharacter = new IconicCharacter("1", "Super Mario");
        iconicCharacter2 = new IconicCharacter("2", "Samus Aran");
    }

    @Test
    void testSubscribe() {
        iconicCharacterFactory.putIfAbsent(iconicCharacter);
        assertEquals("1", checker.getId());
        iconicCharacterFactory.putIfAbsent(iconicCharacter2);
        assertEquals("2", checker.getId());
    }

    @Test
    void testUnsubscribe() {
        Consumer<IconicCharacter> subscription = iconicCharacterFactory.getObservable().subscribe(s -> {
            LogManager.getLogger(this.getClass()).info("Other subscription");
            checkerUnsubscribe = s;
        });
        iconicCharacterFactory.putIfAbsent(iconicCharacter);
        assertEquals("1", checkerUnsubscribe.getId());
        iconicCharacterFactory.getObservable().unsubscribe(subscription);
        iconicCharacterFactory.putIfAbsent(iconicCharacter2);
        assertEquals("1", checkerUnsubscribe.getId());
    }

    @AfterEach
    void afterEach (){
        iconicCharacterFactory.remove("1");
        iconicCharacterFactory.remove("2");
    }

}
