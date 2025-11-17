package com.sunbeam;

public class GrowableStack implements Stack {
    private Employee[] arr;
    private int top;

    public GrowableStack(){
        arr = new Employee[STACK_SIZE];
        top = -1;
    }

    @Override
    public void push(Employee e){
        if(top == arr.length - 1){
            // double the array size
            Employee[] temp = new Employee[arr.length * 2];
            System.arraycopy(arr, 0, temp, 0, arr.length);
            arr = temp;
        }
        arr[++top] = e;
        System.out.println("Pushed: " + e);
    }

    @Override
    public Employee pop(){
        if(top == -1){
            System.out.println("Stack is EMPTY");
            return null;
        }
        return arr[top--];
    }
}