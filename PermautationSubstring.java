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
public class PermautationSubstring {
    public static void main(String args[])
    {
     String A="ped";
     String B="dope";
     
     boolean res=TestBPermutationinA(A,B);
     System.out.println("Result: "+res);
    }

    private static boolean TestBPermutationinA(String A, String B) {
        boolean result=false;
        ArrayList<String> B_permutes=new ArrayList<String>();
        B_permutes=getPermutattions(B);
        for(String pers:B_permutes)
        {
            System.out.println(pers);
            if(A.contains(pers))
            {
                result=true;
                break;
            }
        }
        return result;
    }

    private static ArrayList<String> getPermutattions(String B) {
      ArrayList<String> permutes=Permute("",B);
      return permutes;
    }

    private static ArrayList<String> Permute(String prefix, String suffix) {
        ArrayList<String> permutes=new ArrayList<String>();
        int len=suffix.length();
        if(len==0)
        {
            permutes.add(prefix);
        }
        else
        {
            for(int i=0;i<len;i++)
            {
                permutes.addAll(Permute(prefix+suffix.charAt(i), suffix.substring(0,i)+suffix.substring(i+1)));
            }
        }
        return permutes;
    }
}
