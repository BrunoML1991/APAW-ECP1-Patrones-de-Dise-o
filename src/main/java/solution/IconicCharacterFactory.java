package solution;

import solution.observer.Observable;

import java.util.HashMap;
import java.util.Map;

public class IconicCharacterFactory {

    private static IconicCharacterFactory iconicCharacterFactory = new IconicCharacterFactory();
    private Map<String, IconicCharacter> data;
    private Observable observable = new Observable();

    private IconicCharacterFactory() {
        data = new HashMap<>();
    }

    public static IconicCharacterFactory getIconicCharacterFactory() {
        return iconicCharacterFactory;
    }

    public void putIfAbsent(IconicCharacter iconicCharacter) {
        if (data.getOrDefault(iconicCharacter.getId(), null) == null) {
            observable.accept(iconicCharacter);
        }
        data.putIfAbsent(iconicCharacter.getId(), iconicCharacter);
    }

    public void remove(String primaryKey) {
        data.remove(primaryKey);
    }

    public IconicCharacter getIconicCharacter(String primaryKey) {
        return data.getOrDefault(primaryKey, new IconicCharacter(null, null));
    }

    public Observable getObservable() {
        return observable;
    }

}
