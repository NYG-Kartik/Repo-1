/*
Kartik Vanjani, Ethan Lam, Krrish, Team Large Men
APCS PD8
HW 9 What Are Big Sibs Good For
2021-10-03
Discoveries: You always need system.out.println to print the message that
you desire java to print.
Questions: WHat command do I run to make it print the message with the names
I have encoded?
*/
public class BigSibGreet {
    public static void main( String[] args ) { 
        BigSib.greet("Kartik");
        BigSib.greet("Ethan");
        BigSib.greet("John");
    }
     public static void greet(String name) {
           System.out.println("Hey, " + name + " , thanks for your help!");}}
