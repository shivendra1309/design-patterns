package structural.flyweight;

public class Forest {
    private Tree[] trees = new Tree[1000];
    private int index;

    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeType treeType = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, treeType);
        trees[index++] = tree;
    }

    public void draw() {
        for (Tree tree : trees) {
            if (tree != null) {
                tree.draw();
            }
        }
    }
}
