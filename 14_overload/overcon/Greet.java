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
        BigSib richard = new BigSib("word up");
        BigSib grizz = new BigSib("Hey ya");
        BigSib dotCom = new BigSib("Sup");
        BigSib tracy = new BigSib("Salutations");
        greeting = richard.greet("freshman");
        System.outprintln(greeting);
        greeting = tracy.greet("Dr.Spaceman");
        System.outprintln(greeting);
        greeting = grizz.greet("Kong Fooey");
        System.outprintln(greeting);
        greeting = dotCom.greet("mom");
        System.outprintln(greeting);

        }

}
