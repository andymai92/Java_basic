// Author: Anh N Mai (Andy)
// San Jose - California
import java.util.Scanner;

public class String_UniqueCharacter {

	public static boolean isUniqueChar(String str) {
		boolean result = true;
		int[] array = new int[256];
		for (int i = 0; i < array.length; i++)
			array[i] = 0;
		for (int i = 0; i < str.length(); i++) {
			if (array[str.charAt(i)] == 0)
				array[str.charAt(i)] = 1;
			else if (array[str.charAt(i)] == 1) {
				result = false;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Type a string here: ");
		String data = input.nextLine();
		if (isUniqueChar(data))
			System.out.println("Your string has unique characters");
		else
			System.out.println("Your string has duplicated characters");

		input.close();
	}

}
