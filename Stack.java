/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structure;

/**
 *
 * @author Karim Abo Agiza
 */
public class Stack {

    int topElement;
    int maxSz = 100;
    int[] item = new int[maxSz];

    public Stack() {
        topElement = -1;
    }

    boolean isEmpty() {
        return (topElement < 0);
    }

    boolean push(int val) {

        if (topElement >= maxSz - 1) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            item[++topElement] = val;
            System.out.println(val + " is Added");
            return true;
        }

    }

    int pop() {

        if (topElement < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = item[topElement--];
            return x;
        }

    }

    int peek() {

        if (topElement < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int value = item[topElement];
            return value;
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Deleted ");
    }

}


