package exercise1;

import java.util.Scanner;
import java.util.Random;

/**
 * @author yasiro01
 */
public class Ex1Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numbers = new int[10];
    for (int i = 0; i < 10; i++) {
      numbers[i] = rnd.nextInt(10);
    }
    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8(numbers);
    task9();
    task10();
  }

  /**
   * TODO: Task 1: Print "Hello World" to the default system output
   */
  public static void task1() {
    //throw new UnsupportedOperationException("Task 1 is not implemented yet.");
    System.out.print("-----Task 1-----\n");
    System.out.print("Hello World");
    System.out.print("\n");
  }
  /**
   * TODO: Task 2: Print all numbers between 1 and 100 (inclusive) replacing all multiples of 3 with "foo", multiples of 5 with "bar", multiples of 3 and 5 with "huh"
   */
  public static void task2() {
    //throw new UnsupportedOperationException("Task 2 is not implemented yet.");
    System.out.print("-----Task 2-----\n");
    for(int num=1; num<100; num++){
        if(num%5==0 && num%3==0){
            System.out.print("huh");
            System.out.print("\n");
        }else if(num%3==0){
            System.out.print("foo");
            System.out.print("\n");
        }else if(num%5==0){
            System.out.print("bar");
            System.out.print("\n");
        }else{
            System.out.print(num);
            System.out.print("\n");
        }
    }
    
    
  }
  /**
   * TODO: Task 3: Calculate and print the sum of all multiples of 7 between 1 and 100 (inclusive)
   */
  public static void task3() {
    System.out.print("-----Task 3-----\n");
    //throw new UnsupportedOperationException("Task 3 is not implemented yet.");
    int i = 0;
    int sum = 0;
    while (i<100){
        sum += i;
        i += 7;
    }
    System.out.print(sum);
    System.out.print('\n');
  }
  /**
   * TODO: Task 4: Calculate and print sum and product of all numbers between 1 and 20 (inclusive)
   */
  public static void task4() {
    //throw new UnsupportedOperationException("Task 4 is not implemented yet.");
    System.out.print("-----Task 4-----\n");
    int i = 1;
    int sum = 0;
    int prod = 1;
    while (i<=20){
        sum += i;
        prod *= i;
        i++;
    }
    System.out.print(sum);
    System.out.print('\n');
    System.out.print(prod);
    System.out.print('\n');
  }
    
  /**
   * TODO: Task 5: Ask a user to enter their full name and print the initials (ie John Q Doe should yield JQD)
   */
  public static void task5() {
    //throw new UnsupportedOperationException("Task 5 is not implemented yet.");
    System.out.print("-----Task 5-----\n");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Give me your full name plz: ");
    String name = scanner.nextLine();
    name =' '+name;
    String initials =" ";
    for (int i=0; i<name.length(); i++){
        if(name.charAt(i)== ' ' && i+1 < name.length() && name.charAt(i+1) != ' '){
            initials += name.charAt(i+1);  
    }
        
    }System.out.print(initials);
     System.out.print('\n');
    }
  /**
   * TODO: Task 6: Create an array of 10 elements and initiate each element in it to the cube of its index (Do it in a loop, not during declaration)
   */
  public static void task6() {
   // throw new UnsupportedOperationException("Task 6 is not implemented yet.");
   System.out.print("-----Task 6-----\n");
   int a[]= new int[10];
   a[0]=0;
   a[1]=1;
   a[2]=2;
   a[3]=3;
   a[4]=4;
   a[5]=5;
   a[6]=6;
   a[7]=7;
   a[8]=8;
   a[9]=9;
   int length = a.length;
   int num = 0;
   for (int i=0; i < length; i++){
       num = a[i]*a[i]*a[i];
       System.out.print(num);
       System.out.print('\n');
   }
  }

  /**
   * TODO: Task 7: Create an array of 100 random integers between 1 and 100, ask the user for an integer and tell if that number is in the array
   */
  public static void task7() {
    Random rnd = new Random();
    rnd.setSeed(252);
    //throw new UnsupportedOperationException("Task 7 is not implemented yet.");
    System.out.print("------Task 7------\n");
    int array[] = new int[100];
    for(int i=0; i < array.length; i++){
        array[i] = (int)(Math.random()*100 + 1);
    }
       Scanner scanner = new Scanner(System.in);
    System.out.print("feed me number: ");
    int mystery_number = scanner.nextInt();
    for (int i=0; i<array.length; i++){
        if (i == mystery_number){
            System.out.print("it's here!!");
            i = 101;
      }else if(i == 100){
          System.out.print("nope");
            
        }
    }
  }
  /**
   * TODO: Task 8: Take an array of integers as a parameter, calculate, print, and return the sum of its elements
   * @param numbers
   * @return 
   */
  public static int task8(int[] numbers) {
    throw new UnsupportedOperationException("Task 8 is not implemented yet.");
  }
  /**
   * TODO: Task 9: Ask a user to enter a word and write a function that tells if letters of a word are ordered (ie. "buy" would return true, while "bye" - false).
   * @return 
   */
  public static boolean task9() {
    throw new UnsupportedOperationException("Task 9 is not implemented yet.");
  }
  /**
   * TODO: Task 10: Implement sieve of Eratosthenes and print all prime numbers between 1 and 100
   */
  public static void task10() {
    throw new UnsupportedOperationException("Task 3 is not implemented yet.");
  }

}
