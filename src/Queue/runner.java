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
public class runner {
    
    public static void main(String args[])
    {
        queue q= new queue();
        System.out.println("size is " +q.size());
        System.out.println("IsEmpty- " +q.isEmpty());
        System.out.println("IsFull- " +q.isFull());
        q.enqueue(10);
        q.enqueue(35);
        q.enqueue(78);
        q.enqueue(90);
        q.enqueue(45);
        q.show();
        System.out.println("size is " +q.size());
        System.out.println("After inserting five elements");
        q.enqueue(45);
        q.deque();q.deque();q.deque();q.deque();q.deque();
        System.out.println("After removal of five elements");
        q.deque();
        
    }
}
