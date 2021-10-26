/*
Team MOO V2 Kartik Vanjani Faiza Huda Tasnim Chowdhury
APCS
HW 24 Get It While You Can
2021-10-26
Time Spent: 41 Min
*/
public class Coin {
	private double value;
	private String upFace, name;
	private int flipCtr, headsCtr, tailsCtr;
	private double bias = .5;
public Coin () {
	reset( "heads", 0.5);
}
public Coin () {
	this ();
	name = s;
	assignValue (s);
}
public Coin ( String s, String nowFace ) {
	this(s);
	upFace = nowFace;
}
private double assignValye ( String s ) {
if ( name.equals("penny" ) ) {value = 0.01; }
else if ( name.equals("nickel" ) ) {value = 0.05; }
else if ( name.equals("dime" ) ) {value = 0.1; }
else if ( name.equals("quarter" ) ) {value = 0.25; }
else if ( name.equals("half dollar" ) ) {value = 0.5; }
else if ( name.equals("dollar" ) ) {value = 1; }
return value; 
}
public void reset( String s, double d ) {
flipCtr = 0;
tailsCtr = 0;
headsCtr = 0;
upFace = s;
bias = d;
}
public String glip() {
 double randDbl = Math.random();
 if ( randDbl < bias ) {
 upFace = "heads";
 headsCtr += 1;
 }
 else {
 upFace = "tails";
 tailsCtr += 1;
}
flipCtr += 1;
return upFace;
}
public boolean equals (Coin other ) { return upFace.equals ( other.upFace );}
public String toString()
{return "" + name + + " -- " + upFace; }
}

