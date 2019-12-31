package ds;

public class ArrayClass {
    public static void main(String args[]) {

        Array numberArray = new Array(3);
        numberArray.insert(5);
        numberArray.insert(6);
        numberArray.insert(5);
        numberArray.insert(7);
        numberArray.print();
        System.out.println("============================");
        numberArray.removeAt(3);
        numberArray.print();
        System.out.println("============================");
        System.out.println(numberArray.indexOf(6));
        System.out.println("============================");
        System.out.println(numberArray.indexOf(100));
    }
}

class Array {

    private int[] items;
    private int count = 0;

    public Array(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void insert(int item) {

        if (items.length == count) {
            int newItems[] = new int[count * 2];

            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            items = newItems;
        }

        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++)
            items[i] = items[i + 1];

        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;

        return -1;
    }
}