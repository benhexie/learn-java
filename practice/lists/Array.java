package lists;

import java.util.ArrayList;

public class Array {
    static final ArrayList<String> list = new ArrayList<String>();

    static void addElement(String element) {
        list.add(element);
    }

    static void removeElement(String element) {
        list.remove(element);
    }

    static void clearList() {
        list.clear();
    }

    static void printList() {
        for (String element : list) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        addElement("Apple");
        addElement("Banana");
        addElement("Cherry");
        addElement("Date");

        printList();
        
        removeElement("Banana");
        
        printList();
        
        clearList();
        
        printList();
    }
}
