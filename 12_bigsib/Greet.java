/*Kartik Vanjani, Jacob Ng Team Dojo
APCS PD8
HW 12 On Elder Individuality and the Elimination of Radio Fuzz
2021-10-05
Discoveries: system.out.print ln only works on strings, and the thing after
the . is a property of what comes before it. 
Questions: Why are the words on seperate lines?
*/

public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    richard.setHelloMsg("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);

  } //end main()
} //end Greet


