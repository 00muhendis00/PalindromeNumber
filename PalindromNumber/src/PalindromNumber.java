import java.util.Scanner;
public class PalindromNumber {
	static boolean isPalindrome(int number) {
		int temp = number,reverseNumber = 0,lastNumber;
		for(int i=temp;i<=0;i--) {
			lastNumber = temp % 10;
			reverseNumber = (reverseNumber * 10) + lastNumber;
			temp /= 10;
		}
		if(number == reverseNumber) return true;		
		else return false;
	}
	
	public static void main(String[] args) {
		System.out.print(isPalindrome(234));
	}
}
