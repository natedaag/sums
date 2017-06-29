package edu.cnm.deepdive.oldschool;

public class Sum {

public static void main(String[] args) {

double sum = 0;
  for (String arg : args) {
    double value = Double.parseDouble(arg);
    sum += value; // sum = sum + value
  }
	System.out.println(sum); 
 }

}