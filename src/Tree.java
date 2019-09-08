/**
 * Created by Rodrigo Chibana
 * Date: 07/09/2019
 **/
public class Tree {

    private Node root;

    public void insert(Integer data) {
        root = insertRecursive(root, data);
    }

    private Node insertRecursive(Node root, Integer data) {
        if(root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.getData()) {
            root.setLeftNode(insertRecursive(root.getLeftNode(), data));
        } else if (data > root.getData()) {
            root.setRightNode(insertRecursive(root.getRightNode(), data));
        }

        return root;
    }

    public void printInOrder()  {
        printInOrder(this.root);
    }

    private void printInOrder(Node root) {
        if (root != null) {
            printInOrder(root.getLeftNode());
            System.out.println(root.getData());
            printInOrder(root.getRightNode());
        }
    }

}
