/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Wali
 */
public class runner {
    public static void main(String args[])
            {
                stack sp=new stack();
                System.out.println("Stack is empty: " + sp.isEmpty());
                sp.push(1);
                sp.push(3);
                sp.push(32);
                sp.push(56);
                sp.push(90);
                System.out.println("Size is : " + sp.size());
                sp.show();
                sp.push(43);
               
                System.out.println("Peek element is : " + sp.peek());
                System.out.println("Poped elemnt : " + sp.pop());
                sp.show();
                System.out.println("Poped elemnt : " + sp.pop());
                sp.show();
                System.out.println("Size is : " + sp.size());
                 System.out.println("-------------------------------------------------------------------------------------------"); 
                dynamicarray dp= new dynamicarray();
                System.out.println("Size is : " + dp.size());
                dp.push(12);
                dp.push(41);
                dp.show();
                System.out.println("Size is : " + dp.size());
                dp.push(91);
                dp.show();
                System.out.println("Size is : " + dp.size());
                dp.push(103);
                dp.show();
                System.out.println("Size is : " + dp.size());
                dp.push(87);
                dp.push(76);
                dp.show();
                System.out.println("Size is : " + dp.size());
                System.out.println("Poped elemnt : " + dp.pop());
                dp.show();
                System.out.println("Size is : " + dp.size());
                System.out.println("Poped elemnt : " + dp.pop());
                System.out.println("Poped elemnt : " + dp.pop());
                 dp.show();
                System.out.println("Size is : " + dp.size());
                System.out.println("Poped elemnt : " + dp.pop());
                System.out.println("Poped elemnt : " + dp.pop());
                 dp.show();
                System.out.println("Size is : " + dp.size());
                System.out.println("Poped elemnt : " + dp.pop());
                System.out.println("Poped elemnt : " + dp.pop());
                 dp.show();
                System.out.println("Size is : " + dp.size());
                
                
                
            }
}
