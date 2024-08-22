package com.verizon;

import java.util.Scanner;
import java.util.StringTokenizer;
public class StringDemo {
      public static void main(String args[])
      {
    	  String ss="javatechnology";
    	  StringBuilder sb=new StringBuilder(ss);
    	  String sss=sb.toString();
    	  System.out.println(sb.capacity());
    	  sb.append(1999);
    	  System.out.println(sb);
    	  System.out.println(sb.insert(3, "abcd"));
    	  sb.ensureCapacity(50);
    	  System.out.println(sb.capacity());
    	  String line="Verizon, Building10, MindSpace, Hyderabad, India";
          StringTokenizer st=new StringTokenizer(line," , ");
          System.out.println(st.countTokens());
          while(st.hasMoreTokens())
        	  System.out.println(st.nextToken());
      }
}
