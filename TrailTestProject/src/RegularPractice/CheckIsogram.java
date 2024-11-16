package RegularPractice;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class CheckIsogram {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// check string is isogram or not remove duplicates
		String s = "cocdeDd";
		int counter = 0;
		char[] chararr = s.toCharArray();

		Set<Character> seta = new HashSet<>();
		for (Character c : chararr) {
			if (seta.contains(c)) {
				counter++;
			} else {
				seta.add(c);

			}
		}
		if (counter > 0)
			System.out.print("Not Isogram");
		else
			System.out.print("Isogram");

		int count = 0;
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {

			Character c = s.charAt(i);
			 if (stack.contains(c)) {
				count++;
			} else {
				stack.push(c);
			}
		}
		// System.out.print(count);
		if (count > 0)
			System.out.print("Not Isogram");
		else
			System.out.print("Isogram");

	}

}
