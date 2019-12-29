/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task5;

import javax.swing.JOptionPane;

/**
 *
 * @author MAGIC
 * @param <E>
 */
public class Stack<E> {
    
    public static final int capacity =100;
    public E[] array;
    public int top;
    public int t;
    
    public Stack(){
        array = (E[]) new Object[capacity];
        top = 0;
        t = -1;
    }
    
    public int size(){
        return t+2;
    }
    
    public void clear(){
        for(int i=0;i<array.length;i++){
            array[i] = null;
        }
        top = 0;
        t = -1;
    }
    
    public boolean isEmpty(){
        return top==0;
    }
    
    public void push(E item){
        if(top<(array.length)){
            array[top] = item;
            top++;
            t++;
        }
        else
            JOptionPane.showMessageDialog(null, "Error : Array is full");
    }
    
    public E pop(){
        if(top!=0){
            E i = array[top-1];
            array[top-1] = null;
            top--;
            t--;
            return i;
        }
        else
            return null;
    }
    
    public E top(){
        int index = -1;
        for(int i=0;i<array.length;i++){
            if(array[i]!=null){
                index = i;
            }
        }
        if(index>=0)
            return array[index];
        else
            return null;
    }
    
}
