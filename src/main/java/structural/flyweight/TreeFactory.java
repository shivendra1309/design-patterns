package structural.flyweight;

public class TreeFactory {
    private static TreeType sharedTreeType;

    public static TreeType getTreeType(String name, String color, String texture) {
        if (sharedTreeType == null) {
            sharedTreeType = new TreeType(name, color, texture);
        }
        return sharedTreeType;
    }
}
