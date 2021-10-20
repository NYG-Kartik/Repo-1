/* Team UP2U Kartik Vanjani, Emily Ortiz, Ziying Jian Scruffy Applesauce kRRISH
APCS
HW20 External Audit
2021-10-19
DISCO- Nacho Patcho's deposit function did not account for a negative deposit
which would break their code.
- Their if else statement should have included the negative amount.
QCC:
- What effect would it have if you accounted for the negative deposit but not
the positive specifically but you put the inequality and not the positive
deposit amount? Would the code break?
*/

public class Teller {
	// TEST CASES, courtesy of team KLEH (pd8). Idea for casting to "short" courtesy of Clueless Cats (pd8)
	public static void main( String[] args ) {
		BankAccount ba = new BankAccount();
		ba.setName("A");
		ba.setPassword("password");
		ba.setPIN((short) 1234);
		ba.setID(123456789);
		ba.setBalance(500);
		ba.deposit(200);
		ba.withdraw(100);
		String accinfo = ba.toString();
		System.out.println(accinfo);

		System.out.println("\nDeposit test:");
		System.out.println(ba.deposit(1000) + " (should be 1100)");
		System.out.println(ba.deposit(-1000) + "(should be -900)"); 
	}//end main()

}
