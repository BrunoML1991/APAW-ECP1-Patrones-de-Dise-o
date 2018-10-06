package solution.composite;

public abstract class VideogameComponent {

    protected String name;

    public VideogameComponent(String name) {
        this.name = name;
    }

    public abstract void add(VideogameComponent videogameComponent);

    public abstract void remove(VideogameComponent videogameComponent);

    public abstract String view();

}
