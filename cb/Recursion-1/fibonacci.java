/*Team Mate Meat Meta Tame: Kartik Vanjani, Gabriel Thompson
APCS PD8
HW 64: Revisitation
14-02-2022
Time Spent: .5 hrs
*/
public class fibonacci {
public int fibonacci(int n) {
  if (n == 0)
  return 0;
  else if (n == 1)
  return 1;
 
  return fibonacci(n - 1) + fibonacci(n - 2);
}
public void main (String [] args) {
	System.out.println(fibonacci(1));
	System.out.println(fibonacci(2));
	System.out.println(fibonacci(3));
}
}
