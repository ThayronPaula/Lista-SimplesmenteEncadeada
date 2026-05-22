public class SingleLinkedList {
    private Node head, tail;

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    private int size;

    public SingleLinkedList() {
    }

    public void addFirst(Node newFirst) {
        if (size == 0) {
            head = tail = newFirst;
            size++;
            return;
        }
        newFirst.setNext(head);
        head = newFirst;
        size++;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "\nEmpty List";

        } else {
            String str = "Head -> ";
            Node temp = head;
            while (temp != null) {
                str += temp.getData() + " -> ";
                temp = temp.getNext();
            }
            return str + " Tail " + "-> Null";
        }

    }

    public void addFromBack(Node newBack) {
        if (size == 0) {
            head = tail = newBack;
            size++;
            return;
        }
        tail.setNext(newBack);
        tail = newBack;
        size++;
    }
    public void addAfter(int target, Node newNode){
        if (size == 0){
            System.out.println("Está vazia\n");
            return;
        }
        Node temp = head;
        while (temp != null && temp.getData() != target){
            temp = temp.getNext();
        }
        if (temp == null){
            System.out.println("valor n existe");
            return;
        }
        if (temp == tail){
            addFromBack(newNode);
            return;
        }
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
        size++;
    }
    public void removeFirst(){
        if (size == 0){
            System.out.println("lista vazia");
            return;
        }
        if (size == 1){
            head = tail = null;
            size--;
            return;
        }
        Node temp = head.getNext();
        head.setNext(null);
        head = temp;
        size--;
    }
    public void removeFromBack(){
        if (size == 0){
        System.out.println("lista vazia");
        return;
    }
        if (size == 1){
            head = tail = null;
            size--;
            return;
        }
        Node temp = head;
        while (temp.getNext()!=tail){
            temp = temp.getNext();
        }
        temp.setNext(null);
        tail = temp;
        size--;
    }
    public void removeItem(int target){
        if (size == 0){
            System.out.println("lista vazia");
            return;
    }
        if (head.getData()==target){
            removeFirst();
            return;
        }
        Node temp = head;
        while(temp.getNext()!= null && temp.getNext().getData()!=target){
            temp = temp.getNext();
        }
        if (temp.getNext()==null){
            System.out.println("Não existe nada aq n capeta");
            return;
        }

        if (temp.getNext()==tail){
            removeFromBack();
            return;
        }
        temp.setNext(temp.getNext().getNext());
        size--;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void clear(){
        final int aux = size;
        for (int i = 0; i < aux; i++){
            removeFromBack();
        }
        System.out.println("Lista limpa");
    }
}