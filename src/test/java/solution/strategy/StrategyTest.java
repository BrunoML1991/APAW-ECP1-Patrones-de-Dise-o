package solution.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrategyTest {

    private Context context = new Context();

    @Test
    void strategyTest() {
        context.setStrategy(1);
        assertEquals(1, context.getStrategy().applyStrategy());
        context.setStrategy(2);
        assertEquals(2, context.getStrategy().applyStrategy());
    }

}
