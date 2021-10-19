/*
Kartik Vanjani Vansh Saboo Jacob NG Krrish Team Richard
APCS PD8
HW 14 Customize Your Creation
2021-10-07
DISCO: I discovered that in the thing after the dot is the property before
so you can call it to print the message of a string and then use 
systemprintln to print it.
QCC: Do I have to define every single parameter for when the message is 
defined in the greet file?
*/
public class Greet{
    public static void main(String[] args){
        String greeting;
        BigSib richard = new BigSib();
        BigSib grizz = new BigSib();
        BigSib dotCom = new BigSib();
        BigSib tracy = new BigSib();
        greeting = richard.greet("freshman");
        System.out.println(greeting);
        greeting = tracy.greet("Dr.Spaceman");
        System.out.println(greeting);
        greeting = grizz.greet("Kong Fooey");
        System.out.println(greeting);
        greeting = dotCom.greet("mom");
        System.out.println(greeting);

        }

}
