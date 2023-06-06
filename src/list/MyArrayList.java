package list;

import java.util.Arrays;

public class MyArrayList {

    private Object[] objects;

    private int currentSize = 0;

    public void add(Object o){

    }

    public void remove(Object o){

    }

    public void remove(int index){
        if (currentSize < 1 || index >= currentSize || index < 0){
            throw new IndexOutOfBoundsException();
        }
        Object[] end = Arrays.copyOfRange(this.objects, index+1, currentSize);
        Object[] newArray = Arrays.copyOf(this.objects , currentSize-1);
        int j = 0;

        for (int i = index; i < newArray.length; i++) {
            newArray[i] = end[j++];
        }
        this.objects = newArray;
        currentSize --;
    }

    public boolean isEmpty(){
        return false;
    }

    public Object get(int index){
        return this.objects[index];
    }
    public int size(){
        return currentSize;
    }

}
