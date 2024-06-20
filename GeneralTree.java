package trees;

public class GeneralTree<T> {
    private TreeNode<T> root;

    public GeneralTree(T rootData) {
        root = new TreeNode<>(rootData);
    }

    public TreeNode<T> getRoot() {
        return root;
    }

    public void setRoot(TreeNode<T> root) {
        this.root = root;
    }

    public void printTree(TreeNode<T> node, String appender) {
        System.out.println(appender + node.getData());
        for (TreeNode<T> each : node.getChildren()) {
            printTree(each, appender + appender);
        }
    }

    public static void main(String[] args) {
        GeneralTree<String> tree = new GeneralTree<>("Root");

        TreeNode<String> node1 = new TreeNode<>("Node 1");
        TreeNode<String> node2 = new TreeNode<>("Node 2");
        TreeNode<String> node3 = new TreeNode<>("Node 3");

        tree.getRoot().addChild(node1);
        tree.getRoot().addChild(node2);

        node1.addChild(new TreeNode<>("Node 1.1"));
        node1.addChild(new TreeNode<>("Node 1.2"));

        node2.addChild(node3);
        node3.addChild(new TreeNode<>("Node 3.1"));

        tree.printTree(tree.getRoot(), "--");
    }
}
