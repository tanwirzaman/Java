/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewprep;

import java.util.ArrayList;

/**
 *
 * @author Tanwir
 */
public class TreeAncestorFind {

public static int Arr[][]=new int[7][7];

public static void main(String args[])
{
  
  Node a = new Node(1);
  Node b = new Node(2);
  Node c = new Node(3);
  Node d = new Node(4);
  Node e = new Node(5);
  Node f = new Node(6);
  a.left=b;
  a.right=c;
  b.left=d;
  b.right=e;
  c.left=f;
  for(int i=1;i<Arr.length;i++)
  {
      for(int j=1;j<Arr.length;j++)
      {
         Arr[i][j]=0;
      }      
  }
  MarkChild(a);
  for(int i=1;i<Arr.length;i++)
  {
      for(int j=1;j<Arr.length;j++)
      {
          System.out.print(Arr[i][j]+" ");
      }
      System.out.println("");
  }
}

 private static ArrayList<Node> MarkChild(Node node) {
      if(node==null)
          return new ArrayList<Node>();;
      ArrayList<Node> child=new ArrayList<Node>();
      child.addAll(MarkChild(node.left));
      child.addAll(MarkChild(node.right));
      for(Node n: child)
      {
          if(n!=null)
            Arr[node.value][n.value]=1;
      }
      child.add(node);
      return child;
 }

static class Node{
  Node left=null;
  Node right=null;
  int value;

  public Node(int value)
  {
   this.value = value;
  }
 }
}
