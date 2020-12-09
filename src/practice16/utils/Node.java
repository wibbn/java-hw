package practice16.utils;

public class Node {
    public Item value;
    Node nextNode;
    Node previousNode;

    public Node(Item value) {
        this.value = value;
        this.nextNode = this;
        this.previousNode = this;
    }

    public Node(Item value, Node nextNode, Node previousNode) {
        this.value = value;
        this.nextNode = nextNode;
        this.previousNode = previousNode;
    }

}
