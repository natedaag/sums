package edu.cnm.deepdive.oldschool;

public class Sum {

public static void main(String[] args) {

double sum = 0;
  //for (String arg : args) {
    //double value = Double.parseDouble(arg);
    //sum += value; // sum = sum + value
    
  for (int i = 0; i < args.length; i++){
    String arg = args [i];
    double value = Double.parseDouble(arg);
    sum += value; // sum = sum + value;
    System.out.println(value);
  } // end for
  
	System.out.println(sum); 
 } // end main

}  // end Sum