public class bunnyEars2 {
public int bunnyEars2(int bunnies) {
  if (bunnies == 0)
  return 0;
  if (bunnies % 2 == 0)
  return bunnyEars2(bunnies - 1) + 3;
  else
  return bunnyEars2(bunnies - 1) + 2;
}
public void main (String [] args) {
	System.out.println(bunnyEars2(1));
	System.out.println(bunnyEars2(2));
	System.out.println(bunnyEars2(3));
}
}
