/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewprep;

import java.util.HashSet;



/**
 *
 * @author Tanwir
 */
public class RemoveDuplicatesLinkedList {
    public static void main(String args[])
    {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(20);
        Node n5=new Node(40);
        Node n6=new Node(20);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        
        //RemoveDuplicatesWithBuffer(n1);
        RemoveDuplicatesWithoutBuffer(n1);
        Display(n1);
    }

    private static Node RemoveDuplicatesWithBuffer(Node head) {
        HashSet<Integer> set=new HashSet<Integer>();
        Node node=head;
        Node prev=head;
        while(node!=null)
        {
            if(set.contains(node.data))
            { 
                prev.next=node.next;                
            }
            else
            {
                set.add(node.data);
                prev=node;
            }
            node=node.next;
        }
        return head;
    }

    private static void RemoveDuplicatesWithoutBuffer(Node head) {
        Node node=head;
        Node prev=head;        
        while(node!=null)
        {
            Node checkerNode=head;
            while(checkerNode!=node)
            {
                if(checkerNode.data==node.data)
                {
                    prev.next=node.next;
                    node=node.next;
                    break;
                }           
                checkerNode=checkerNode.next;
            }
            if(checkerNode==node)
            {
                prev=node;
                node=node.next;
            }
        }
    }
    
    private static void Display(Node head) {
        Node node=head;
        while(node!=null)
        {
            System.out.println("Node :"+node.data);
            node=node.next;
        }
    }
}
class Node{
    int data;
    Node next=null;
    public Node(int d)
    {
        this.data=d;
    }
    /*public void insertAtEnd(int d)
    {
        Node node=this;
        while(node.next!=null)
        {
            node=node.next;
        }
        Node newNode=new Node(d);
        node.next=newNode;
    }*/
}
