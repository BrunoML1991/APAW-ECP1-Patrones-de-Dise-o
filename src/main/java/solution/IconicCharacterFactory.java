package solution;

import java.util.HashMap;
import java.util.Map;

public class IconicCharacterFactory {

    private static IconicCharacterFactory iconicCharacterFactory = new IconicCharacterFactory();
    private Map<String, IconicCharacter> data;

    private IconicCharacterFactory() {
        data = new HashMap<>();
    }

    public static IconicCharacterFactory getIconicCharacterFactory() {
        return iconicCharacterFactory;
    }

    public void putIfAbsent(IconicCharacter iconicCharacter) {
        data.putIfAbsent(iconicCharacter.getId(),iconicCharacter);
    }

    public void remove (String primaryKey){
        data.remove(primaryKey);
    }

    public IconicCharacter getIconicCharacter (String primaryKey){
        return data.getOrDefault(primaryKey,new IconicCharacter(null,null));
    }

}
