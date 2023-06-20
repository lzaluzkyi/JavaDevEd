package list.linked;

public class Node {

    private Object currentObject;

    private Node next;




    public Object getCurrentObject() {
        return currentObject;
    }

    public void setCurrentObject(Object currentObject) {
        this.currentObject = currentObject;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
