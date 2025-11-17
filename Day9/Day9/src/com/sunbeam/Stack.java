package com.sunbeam;

public interface Stack {
    int STACK_SIZE = 5;     // constant

    void push(Employee e);
    Employee pop();
}
