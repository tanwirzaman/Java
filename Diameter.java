/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acm;

import java.util.Scanner;


/**
 *
 * @author Tanwir
 */

class Node
{
    Node left;
    int value;
    Node right;

    Node(int n) {
        left = null;
        right = null;
        value = n;
    }
    
}

public class Diameter 
{
    public static int max = 0;
    public static void insert(int n, Node root)
    {
        Node temp = new Node (n);
        insertNode(temp,root);
        
    }

    private static void insertNode(Node temp, Node root) {
        if(root.value>temp.value)
        {
            if(root.left==null)
            {
                root.left = temp;
                return;
            }
            else
                insertNode(temp,root.left);
        }
        else
        {
             if(root.right==null)
            {
                root.right = temp;
                return;
            }
            else
                insertNode(temp,root.right);
        }
    }
    
    public static void inOrder(Node root)
    {
        if(root == null)
            return;
        int maxL = 0, maxR = 0;
        if(root.left!=null)
            maxL = max(root.left);
        
        if(root.right!=null)
            maxR = max(root.right);
        
        if((maxL+maxR+1)>max)
            max = (maxL+maxR+1);
        
        //System.out.println(root.value+" "+maxL+" "+maxR);
        
        inOrder(root.left);
        //System.out.println(root.value);
        inOrder(root.right);
    }
    
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       String s =  sc.nextLine();
       String[] input = s.split(",");
       int r = Integer.parseInt(input[0]);
       Node root = new Node(r);
       for(int i=1;i<input.length;i++)
       {
           //System.out.println(input[i]);
           int x = Integer.parseInt(input[i]);
           insert(x,root);
       }
       
       inOrder(root);
       System.out.println(max);
    }
    
    public static int max(Node root)
    {
        if(root == null)
            return 0;
        return Math.max(max(root.left),max(root.right))+1;
    }
}
