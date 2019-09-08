/**
 * Created by Rodrigo Chibana
 * Date: 07/09/2019
 **/
public class Node {

    private Node rightNode;
    private Node leftNode;
    private Integer data;

    public Node(Node rightNode, Node leftNode, Integer data) {
        this.rightNode = rightNode;
        this.leftNode = leftNode;
        this.data = data;
    }

    public Node(Integer data) {
        this.rightNode = null;
        this.leftNode = null;
        this.data = data;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }
}
