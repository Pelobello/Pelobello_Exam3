/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pelobello_exam3;

import java.util.Scanner;
import static pelobello_exam3.Pelobello_Exam3.PriorityQueueArrayLinkedList.print;
import sun.print.PeekGraphics;


public class Pelobello_Exam3 { 
  
   public static class PriorityQueueArrayLinkedList {
        private class PriorityQueueArray{
            int priority;
            int data;
            PriorityQueueArray next;
            
        }
         static int print=0;
        private PriorityQueueArray front;
         
        private void insertion (int item,int priority) throws Exception{
            PriorityQueueArray node = new PriorityQueueArray();
            
            node.data = item;
            node.priority = priority;   
            node.next = null;
           
            
            if (front == null || priority <=front.priority) {
                node.next = front;
                front = node;
            }else {
                PriorityQueueArray temporary = front;
                while (temporary.next != null &&temporary.next.priority<priority) {                    
                    temporary = temporary.next;
                }
                node.next = temporary.next;
                temporary.next = node;
               
               
            }
            if (print >4) {
                list.deletion();
            }
            print++;
            
        }
      
        public int deletion()throws Exception{
            if (front == null) {
                throw new Exception("Empty");
            }
            int temporaty = front.data;
            front = front.next;
            print--;
            return temporaty;
        }
        public void display()throws Exception{
            if (front == null) {
                throw new Exception("Empty");
            }
            PriorityQueueArray temporary = front;
            while (temporary !=null) {                
                System.out.println(temporary.data+ "\t\t\t"+temporary.priority);
                temporary = temporary.next;
            }
            System.out.println("\n");
        }
   }


    private static PriorityQueueArrayLinkedList list = new PriorityQueueArrayLinkedList();
    public static void main(String[] args) throws Exception{
       
      Scanner scan = new Scanner(System.in);
  
        while (true) {      
            System.out.println("1. Enter data and priority");
            System.out.println("Display the data");
            System.out.print("enter here: ");
            int data = scan.nextInt();
            
            switch (data) {
                
               
                case 1:
                    System.out.print("input data: ");
                    int enter = scan.nextInt();
                     System.out.print("input priority: ");
                    int priority = scan.nextInt();
                    list.insertion(enter, priority);
                     

                    break;
                case 2:
                     list.display();
                    break;
                default:
                    throw new AssertionError();
            }
        }
           
       
        
      
        
        
        
        
    }
    
}

