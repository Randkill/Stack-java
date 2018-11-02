package com.company;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Stack {
    private int top, size;
    private char[] s;
    Stack(int arraySize){
        top = 0;
        this.size = arraySize;
        s = new char[size];
    }

    public void push(char ch){
        if(!isFull()){
            s[top] = ch;
            top++;
        }else {
            System.out.print("Stack is Full , remove items from it!\n");
        }
    }

    public char pop(){
        if(!isEmpty()){
            top--;
            return s[top];
        }else {
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
