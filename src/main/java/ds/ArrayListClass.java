package ds;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String args[]) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Alexander");
        arrayList.add("Christina");
        arrayList.add("Antony");
        arrayList.add("Henry");
        System.out.println(arrayList);
        System.out.println("============================");
        arrayList.remove(2);
        System.out.println(arrayList);
    }
}
