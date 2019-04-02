package Exercise;

public class MyLinkedList<E>{
    private int numNodes;
    private Node head;

    public MyLinkedList(Object data){
        head = new Node(data);
    }
    private class Node{
        private Node next;
        private Object data;

        public Node(Object data){

            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, E e){

    }
}
