package com.Ravneet;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class JavaCalculator {

  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    JavaCalculator jc=new JavaCalculator();

    for(int i=0;i<1000;i++){
      System.out.println("-----------------------CALCULATOR-----------------------");
      System.out.println("Number of Operations");
      System.out.println("1. ADDITION");
      System.out.println("2. SUBTRACTION");
      System.out.println("3. DIVISION");
      System.out.println("4. MULTIPLICATION");
      System.out.println("5. EXIT");
      System.out.println("Enter your choice between 1-5: ");
      int choice=s.nextInt();
      if(choice==5){
        System.out.println("Exiting the calculator, Thank You!");
        break;
      }
      else if(choice<1 || choice>5){
        System.out.println("Invalid Choice");
      }
      else{
        System.out.println("Enter the First number: ");
        double n1=s.nextDouble();
        System.out.println("Enter the Second number: ");
        double n2=s.nextDouble();

        if(choice==1){
          jc.add(n1,n2);
        }
        else if(choice==2){
          jc.subtract(n1,n2);
        }
        else if(choice==3){
          jc.divide(n1,n2);
        }
        else{
          jc.multiply(n1,n2);
        }
      }
    }
  }

  public void add(double n1, double n2) {
    System.out.println("Result="+(n1+n2));
  }

  public void subtract(double n1,double n2){
      System.out.println("Result="+(n1-n2));
  }
  public void divide(double n1,double n2) {
    if (n2 == 0) {
      System.out.println("Cannot divide a number with zero");
    } else {
      System.out.println("Result="+(n1/n2));
    }
  }
  public void multiply(double n1,double n2){
    System.out.println("Result="+(n1*n2));
  }

}