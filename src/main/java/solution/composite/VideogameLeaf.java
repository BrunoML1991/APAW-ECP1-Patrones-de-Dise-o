package solution.composite;

import solution.Videogame;

public class VideogameLeaf extends VideogameComponent {

    private Videogame videogame;

    public VideogameLeaf(Videogame videogame) {
        super(videogame.getId());
        this.videogame = videogame;
    }

    @Override
    public void add(VideogameComponent videogameComponent) {
        // Do nothing because is leaf
    }

    @Override
    public void remove(VideogameComponent videogameComponent) {
        // Do nothing because is leaf
    }

    @Override
    public String view() {
        return videogame.getId();
    }

}
