import java.io.*;
import java.util.*;
class Himanshu{
  	public static void main(String args[]){
   	Scanner sc=new Scanner(System.in);
    	int numofline,i;
    	ArrayList<Integer>out_array = new ArrayList<>();
    	String text=sc.nextLine();
    	String tempstring[]=new  String[100];
    	numofline=Integer.parseInt(sc.nextLine());
    		for(i=0;i<numofline;i++){
      		tempstring[i]=sc.nextLine();
  		}
	for(i=0;i<numofline;i++){
	for(int j=-1;(j=text.indexOf(tempstring[i],j+1)) !=-1;){
	 out_array.add(j);
	}}
	Collections.sort(out_array);
	for(Integer k:out_array)
	System.out.print(k+" ");
}}