package solution.observer;

import solution.IconicCharacter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Observable {

    private List<Consumer<IconicCharacter>> consumers;

    public Observable() {
        this.consumers = new ArrayList<>();
    }

    public Consumer<IconicCharacter> subscribe(Consumer<IconicCharacter> consumer) {
        this.consumers.add(consumer);
        return consumer;
    }

    public void unsubscribe(Consumer<IconicCharacter> consumer) {
        this.consumers.remove(consumer);
    }

    public void accept(IconicCharacter data) {
        this.consumers.forEach(c -> c.accept(data));
    }

}
