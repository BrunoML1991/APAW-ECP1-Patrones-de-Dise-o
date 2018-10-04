package solution.composite;

import java.util.ArrayList;
import java.util.List;

public class VideogameComposite extends VideogameComponent {

    private List<VideogameComponent> videogameComponentList;
    private String name;

    public VideogameComposite(String name) {
        super(name);
        videogameComponentList = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void add(VideogameComponent videogameComponent) {
        assert videogameComponent != null;
        videogameComponentList.add(videogameComponent);
    }

    @Override
    public void remove(VideogameComponent videogameComponent) {
        assert videogameComponent != null;
        videogameComponentList.remove(videogameComponent);
    }

    @Override
    public String view() {
        return name;
    }

}
