package list.linked;

public class MyLinkedList {

    Node first;

    public void add(Object o){
        if (first == null){
            Node node = new Node();
            node.setCurrentObject(o);
            first = node;
        }
        add(first , o);
    }

    public Object get(int index){
       return get(first , index , 0);
    }

    private Object get(Node node , int neededIndex , int currentIndex){
        if (neededIndex == currentIndex){

            return node.getCurrentObject();
        }
        if (node.getNext() == null){
            throw new IllegalArgumentException("Not correct index");
        }
        return get(node.getNext() , neededIndex , ++currentIndex);
    }

    private void add(Node node, Object o){
        Node nextNode = node.getNext();
        if (nextNode == null){
            Node current = new Node();
            node.setCurrentObject(o);
            node.setNext(current);
            return;
        }
        add(nextNode, o);
    }


}
