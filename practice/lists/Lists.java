package lists;

interface List {
    void add(String element);
    void remove(String element);
    void removeAll(String element);
    void clear();
    int size();
    String toString();
}

final class ArrayList implements List {
    private int size = 3;
    private String[] list = new String[size];
    private int index = 0;

    private void expand() {
        if (index != size) return;

        size += 3;
        String[] newList = new String[size];
        for (int i = 0; i < index; i++) {
            newList[i] = list[i];
        }
        list = newList;
    }

    @Override
    public void add(String element) {
        expand();
        list[index++] = element;
    }

    @Override
    public void remove(String element) {
        if (index == 0) return;
        for (int i = 0; i < index; i++) {
            if (list[i].equals(element)) {
                for (int j = i; j < index - 1; j++) {
                    list[j] = list[j + 1];
                }
                index--;
                break;
            }
        }
    }

    @Override
    public void removeAll(String element) {
        for (int i = 0; i < index; i++) {
            if (list[i].equals(element)) {
                for (int j = i; j < index - 1; j++) {
                    list[j] = list[j + 1];
                }
                index--;
            }
        }
    }

    @Override
    public void clear() {
        index = 0;
        size = 3;
        list = new String[size];
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public String toString() {
        if (index == 0) return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < index - 1; i++) {
            sb.append(list[i] + ", ");
        }
        sb.append(list[index - 1] + "]");
        return sb.toString();
    }
}

final class LinkedList implements List {
    private class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private Node current = null;
    private int index = 0;

    @Override
    public void add(String element) {
        if (head == null) {
            head = new Node(element);
            current = head;
        }
        else {
            if (head.next == null) {
                head.next = new Node(element);
                current = head.next;
            } else {
                current.next = new Node(element);
                current = current.next;
            }
        }
        index++;
    }

    @Override
    public void remove(String element) {
        if (head == null) return;
        if (head.data.equals(element)) {
            head = head.next;
            index--;
            return;
        }
        Node tmp = head;
        while (tmp != null) {
            if (tmp.next != null && tmp.next.data.equals(element)) {
                tmp.next = tmp.next.next;
                index--;
                break;
            }
            tmp = tmp.next;
        }
    }
    
    @Override
    public void removeAll(String element) {
        while (head != null && head.data.equals(element)) {
            head = head.next;
            index--;
        }

        if (head == null) {
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(element)) {
                current.next = current.next.next;
                index--;
            } else {
                current = current.next;
            }
        }
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public void clear() {
        head = null;
        current = null;
        index = 0;
    }

    public void addFirst(String element) {
        Node tmp = new Node(element);
        tmp.next = head;
        head = tmp;
        index++;
    }

    public void addLast(String element) {
        this.add(element);
    }

    public void removeFirst() {
        if (head == null) return;
        head = head.next;
        index--;
    }

    public void removeLast() {
        if (head == null) return;
        if (head.next == null) {
            this.clear();
            return;
        }
        Node tmp = head;
        while (tmp != null) {
            if (tmp.next.next == null) {
                tmp.next = null;
                current = tmp;
            }
            tmp = tmp.next;
        }
        index--;
    }

    public String getFirst() {
        if (head != null) return head.data; 
        return null;
    }

    public String getLast() {
        if (current != null) return current.data; 
        return null;
    }

    @Override
    public String toString() {
        if (head == null) return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node tmp = head;
        while (tmp.next != null) {
            sb.append(tmp.data + ", ");
            tmp = tmp.next;
        }
        sb.append(current.data + "]");
        return sb.toString();
    }
}

public class Lists {
    public static void main(String[] args) {
        {
            ArrayList list = new ArrayList();
            list.add("Apple");
            list.add("Banana");
            list.add("Cherry");
            list.add("Plum");
            list.remove("Banana");
            System.out.println(list + "\n" + "Size: " + list.size());
        }
        System.out.println();

        {
            LinkedList list = new LinkedList();
            list.add("Cricket");
            list.add("Football");
            list.add("Basketball");
            list.add("Tennis");
            list.add("Cricket");
            list.add("Cricket");
            list.add("Cricket");
            list.add("Cricket");
            list.add("Cricket");
            // list.addFirst("Boxing");
            System.out.println(list + "\n" + "Size: " + list.size());
            // list.removeLast();
            // list.addLast("Dougeball");
            // list.removeFirst();
            list.removeAll("Cricket");
            System.out.println(list + "\n" + "Size: " + list.size());

            System.out.println("First element: " + list.getFirst());
            System.out.println("Last element: " + list.getLast());
        }
    }
    
}
