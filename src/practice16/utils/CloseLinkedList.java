package practice16.utils;

import practice6.Student;

public class CloseLinkedList {
    protected Node head = null;
    protected int size = 0;

    public CloseLinkedList() {}

    public CloseLinkedList(Item[] items) {

        if (items.length == 0)
            return;

        for (Item item : items) add(item);
    }

    public boolean add(Item value) {

        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            newNode.previousNode = head.previousNode;
            newNode.nextNode = head;
            head.previousNode.nextNode = newNode;
            head.previousNode = newNode;
        }
        this.size++;

        return true;
    }

    private void removeItem(Node item) {
        item.nextNode.previousNode = item.previousNode;
        item.previousNode.nextNode = item.nextNode;
        head = item.nextNode;
        size--;
    }

    public boolean remove(String name) {
        boolean wasRemoved = false;
        Node current = head;
        for (int i=0; i<size; i++) {
            if (current.value.getName().equals(name)) {
                removeItem(current);
                wasRemoved = true;
                break;
            }
        }
        return wasRemoved;
    }

    public int removeAll(String name) {
        int count = 0;
        Node current = head;
        for (int i=0; i<size; i++) {
            if (current.value.getName().equals(name)) {
                removeItem(current);
                count++;
            }
        }
        return count;
    }

    public Item next() {
        Item result = null;

        if (head != null) {
            result = head.nextNode.value;
            head = head.nextNode;
        }
        return result;
    }

    public Item prev() {
        Item result = null;

        if (head != null) {
            result = head.previousNode.value;
            head = head.previousNode;
        }
        return result;
    }

    public Item[] toArray() {
        Item[] result = new Item[size];

        prev();
        for (int i = 0; i < size; ++i)
            result[i] = next();

        return result;
    }

//    public boolean containsNode(Item searchValue) {
//
//        Node<Item> currentNode = head;
//
//        if (head != null) {
//            do {
//                if (currentNode.value == searchValue) {
//                    return true;
//                }
//                currentNode = currentNode.nextNode;
//            } while (currentNode != head);
//        }
//        return false;
//    }

//    public void delete(int valueToDelete) {
//
//        Node<Item> currentNode = head;
//
//        if (head != null) {
//            if (currentNode.value == valueToDelete) {
//                head = head.nextNode;
//                tail.nextNode = head;
//            } else {
//                do {
//                    Node<Item> nextNode = currentNode.nextNode;
//                    if (nextNode.value == valueToDelete) {
//                        currentNode.nextNode = nextNode.nextNode;
//                        break;
//                    }
//                    currentNode = currentNode.nextNode;
//                } while (currentNode != head);
//            }
//        }
//    }

//    public void traverseList() {
//
//        Node<Item> currentNode = head;
//
//        if (head != null) {
//            do {
//                currentNode = currentNode.nextNode;
//            } while (currentNode != head);
//        }
//    }

}

