public class countEvens {
public int countEvens(int[] nums) {
int evennumbers = 0;
for(int count=0; count < nums.length; count++)
{
if(nums[count] % 2 == 0)
{
evennumbers++;}
}
return evennumbers;
}
}
