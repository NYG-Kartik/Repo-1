public class sumDigits {
public int sumDigits(int n) {
  if (n < 10)
  return 0;
  if (n == 10)
  return 10;
  return (n % 10) + sumDigits(n/10);
}
public void main (String [] args) {
	System.out.println(sumDigits(1));
	System.out.println(sumDigits(2));
	System.out.println(sumDigits(3));
}
}
