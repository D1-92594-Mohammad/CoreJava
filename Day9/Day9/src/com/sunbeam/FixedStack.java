package com.sunbeam;

public class FixedStack implements Stack {
    private Employee[] arr;
    private int top;

    public FixedStack(){
        arr = new Employee[STACK_SIZE];
        top = -1;
    }

    @Override
    public void push(Employee e){
        if(top == arr.length - 1){
            System.out.println("Stack is FULL");
        } else {
            arr[++top] = e;
            System.out.println("Pushed: " + e);
        }
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
