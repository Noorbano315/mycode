/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Wali
 */ 
public class queue {
    
    int queue[]=new int[5];
    int size;
    int front;
    int rear;
    
    public void enqueue(int data)
    {
        if(!isFull())
        {
        queue[rear]=data;
        rear=(rear+1)%5;
        size++;
        }
        else
            System.out.println("Queue is Full");
    }
    public int deque()
    {
        int data;
        data=queue[front];
        if(!isEmpty())
        {
        front=(front+1)%5;
        size--;
        }
        else
            System.out.println("Queue is Empty");
    return data;
    }
    public void show()
    {
        for(int i=0;i<size;i++)
        {
            System.out.println(queue[(front+ i)%5]+ " ");
        }
    }
    public int size()
    {
        return size;
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public boolean isFull()
    {
        return size==5;
    }
}
