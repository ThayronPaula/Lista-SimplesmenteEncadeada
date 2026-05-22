public class Main {
    public static void main(String[] args){
        SingleLinkedList list = new SingleLinkedList();
        /*SingleLinkedList list2 = new SingleLinkedList();
        SingleLinkedList list3 = new SingleLinkedList();*/
        for (int i = 0; i < 51; i++) {
            list.addFromBack(new Node(i));
        }
        System.out.println(list);
        /*for (int i = 0; i < 51; i++) {
            list2.addFromBack(new Node(i));
        }
        System.out.println("\n" + list2);*/
        /*Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(1000);*/

       /* list3.addFromBack(n1);
        list3.addFromBack(n2);
        list3.addFromBack(n3);
        list3.addAfter(10,n4);
        System.out.println(list3);

        list.removeFirst();
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);

        System.out.println(list.getHead());
        System.out.println(list.getSize());
        System.out.println(list.getTail());

        list.removeFromBack();
        System.out.println(list);
        list.removeFromBack();
        System.out.println(list);
        list.removeFromBack();
        System.out.println(list);
        list.removeFromBack();
        System.out.println(list);

        list.removeItem(2);
        System.out.println(list);
        list.removeItem(1);
        System.out.println(list);
        list.removeItem(3);
        System.out.println(list);


        list.removeFromBack();
        list.removeFromBack();
        list.removeFromBack();
        list.removeFromBack();

        System.out.println(list.isEmpty());*/
        list.clear();
        System.out.println(list);

    }

}
