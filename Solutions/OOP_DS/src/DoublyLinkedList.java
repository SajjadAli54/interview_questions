public class DoublyLinkedList<T extends Animal>{
    private Node head;
    private Node tail;

    private int size;

    public DoublyLinkedList(){
        head = null;
        tail = null;
    }

    public void addFirst(T data){
        Node newNode = new Node(data, head, null);
        if(head != null){
            head.setPrev(newNode);
        }
        head = newNode;
        if(tail == null){
            tail = newNode;
        }

        size++;
    }

    public void addLast(T data){
        Node newNode = new Node(data, null, tail);
        if(tail != null){
            tail.setNext(newNode);
        }
        tail = newNode;
        if(head == null){
            head = newNode;
        }

        size++;
    }

    public int getCount(){
        return size;
    }

    public void insertAtRandomLocation(T data){
        int random = (int)(Math.random() * size);
        Node current = head;
        for(int i = 0; i < random; i++){
            current = current.getNext();
        }
        Node newNode = new Node(data, current.getNext(), current);
        current.setNext(newNode);
        newNode.getNext().setPrev(newNode);
        size++;
    }

    public void merge(DoublyLinkedList<T> other){
        tail.setNext(other.head);
        other.head.setPrev(tail);
        tail = other.tail;
        size += other.size;
    }

    public T findClosest(Animal animal){
        Node current = head;
        Position pos = animal.getPosition();
        T closest = current.getData();
        while(current != null){
            var currentPos = current.getData().getPosition();
            if(pos.findDistance(currentPos) < pos.findDistance(closest.getPosition())){
                closest = current.getData();
            }
        }
        return closest;
    }
    
    public double findDistance(Position pos, T animal){
        return pos.findDistance(animal.getPosition());
    }

    private class Node{
        private T data;
        private Node next;
        private Node prev;
        public Node(T data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public T getData(){
            return data;
        }

        public void setData(T data){
            this.data = data;
        }

        public Node getNext(){
            return next;
        }

        public void setNext(Node next){
            this.next = next;
        }

        public Node getPrev(){
            return prev;
        }

        public void setPrev(Node prev){
            this.prev = prev;
        }
    }
    
}
