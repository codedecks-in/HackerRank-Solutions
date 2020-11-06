import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.nextLine();
		String allBigInt = scan.nextLine();
		String[] bigIntList = allBigInt.split("\\s");
		
		BigInteger result = BigInteger.valueOf(0);
		for (int i = 0; i < input; i++) {
			result = result.add(new BigInteger(bigIntList[i]));
		}
		System.out.println(result);
	}
}
