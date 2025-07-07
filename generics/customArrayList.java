package generics;

public class customArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public customArrayList() {
        data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }

        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove()
    {
        int removed = data[--size];
        return removed;
    }

    public int get(int index)
    {
        return data[index];
    }
    public int size()
    {
        return size;
    }
    public void set(int index, int value)
    {
         data[index] = value;
    }
    



    private void resize() {
        int[] temp = new int[data.length * 2];
        // copy the current time in the array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];

        }
    }

}
