package structural.flyweight;

public class TreeType {
    private String name;
    private String color;
    private String texture;

    public TreeType(String name, String color, String texture){
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(int x, int y){
        System.out.println("Drawing a tree of type " + name + " at " + x + ", " + y);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }
}
