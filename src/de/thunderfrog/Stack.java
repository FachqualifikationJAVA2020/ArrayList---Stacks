package de.thunderfrog;

import java.util.ArrayList;

public class Stack extends ArrayList<Integer> {


    void push(int item){
        this.add(item);
    }

    int pop() {
        return this.remove(this.size() - 1);
    }

    int peek() {
        return this.get(this.size() - 1);
    }

    boolean empty() {
        if(this.size() == 0){
            return true;
        }
        return false;
    }

    int search(int o){
        for(int i = 0; i < this.size(); i++){
            if(o == this.get(i)){
                int temp = this.size() - 1 - i;
                return temp;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);
        stack.push(10);
        stack.push(12);


        System.out.println("Is Stack empty ? " + stack.empty());
        System.out.println("Search: 8 | Found position: " +  stack.search(8));
        System.out.println("Peek: " + stack.peek());
    }
}
