public class triangle {
public int triangle(int rows) {
  if (rows == 0)
  return 0;
  return rows + triangle(rows - 1);
}
public void main (String [] args) {
	System.out.println(triangle(1));
	System.out.println(triangle(2));
	System.out.println(triangle(3));
}
}
