package com.A5_DynamicArray;

public class DynamicArray {
    int size;
    int capacity = 10;
    Object[] arr;

    public DynamicArray(){
        this.arr = new Object[capacity];
    }

    //Overloaded Constructor in case the user gives capacity explicitly
    public DynamicArray(int capacity){
        this.capacity = capacity;
        this.arr = new Object[capacity];
    }

    public Object get(int index){
        return arr[index];
    }

    public void add(Object data){
        if (size >= capacity){
            grow();
        }
        arr[size] = data;
        size ++;

    }

    public void insert(int index,Object data){
        if (size >= capacity){
            grow();
        }
        for (int i = size; i > index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = data;
        size ++;
    }

    public void delete(Object data){
        for (int i = 0; i < size; i++) {
            if (arr[i] == data){
                for (int j = i; j < size; j++) {
                    arr[j] = arr[j +1];
                }
                arr[size - 1] = null;
                size--;
                if (size <= (int)(capacity/3)){
                    shrink();
                }
                break;

            }
        }

    }

    public int search(Object data){
        for (int i = 0; i < size; i++) {
            if (arr[i] == data){
                return i;
            }
        }
        return -1;
    }

    private void grow(){
        int newCapacity = (int)capacity * 2;
        Object [] newArr = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }

        capacity = newCapacity;
        arr = newArr;

    }

    private void shrink(){
        int newCapacity = (int)capacity / 2;
        Object [] newArr = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }

        capacity = newCapacity;
        arr = newArr;

    }

    public boolean isEmpty(){

        return size == 0;
    }


    public String toString(){
        String string = "";
        for (Object data: arr){
            string += data + ", ";
        }
        if(!string.isEmpty()){
            string = "[" + string.substring(0,string.length()-2) + "]";
        }
        else{
            string = "[]";
        }
        return string;
    }


}
