package solution;

import java.util.List;

public class IconicCharacter {

    private String id;
    private String name;
    private String role;
    private List<Review> reviews;

    public IconicCharacter (String id,String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "IconicCharacter{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
