package com.xworkz;

public class stringmethod {

	public static void main(String[] args) {
  
		String S= "Chidanand";//ho
		String S1= "Sharath";
		String S2= "Madhu";
		String S3="rohan";
		
		System.out.println("===============================");
		
		System.out.println(S);
		System.out.println(S1);
		System.out.println(S2);
		System.out.println(S3);
		System.out.println("===============================");
		
		S1="Sharath";
		System.out.println(S1==S1);
		System.out.println("===============================");
		
		String str=new String("Raghu");
		System.out.println(str.charAt(3));
		
		System.out.println("===============================");
		
		String str1="maltesh";
		System.out.println(str1.length());
		
		System.out.println("===============================");
		
		String str2="abhishek";
		System.out.println(str2.contentEquals(str1));
		System.out.println("===============================");
		
		String str3="sunil";
		System.out.println(str3.concat(S3));
		System.out.println("===============================");
		
		String str4="sangmesh";
		System.out.println(str4.hashCode());
		System.out.println("===============================");
		
		String str5="manoj";
		System.out.println(str5.toUpperCase());
		System.out.println("===============================");
		
		String str6="darshan";
		System.out.println(str6.endsWith(str3));
		System.out.println("===============================");
		
		String str7="chidanand";
		System.out.println(str7.toString());
	}

}
