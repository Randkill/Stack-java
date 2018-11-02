package com.company;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Stack {
    private int top, size;
    private char[] s;
    Stack(int arraySize){           //top`s function is a pointer which points to one
        top = 0;                    //index further than the last item added to our stack
        this.size = arraySize;
        s = new char[size];
    }

    public void push(char ch){
        if(!isFull()){              //if our stack is not full
            s[top] = ch;            //it means it has space to push new items
            top++;
        }else {                     //Error message
            System.out.print("Stack is Full , remove items from it!\n");
        }
    }

    public char pop(){
        if(!isEmpty()){
            top--;
            return s[top];
        }else {                     //it will return '0' if stack is Empty
            System.out.print("Stack is Empty!\n");
            return '0';         //'0' would be a symbol of stack being empty
        }

    }

    public boolean isFull(){
        if(top+1 == size){
            return true;
        }else {
            return false;
        }
    }

    public boolean isEmpty(){
        if(top == 0){
            return true;
        }else {
            return false;
        }
    }

    public void printStack(){
        int counter = 0;
        while (counter != top){
            System.out.print(s[counter] + "  ->  " );
            counter++;
        }
        System.out.print("null\n");
    }
}
