package RegularPractice;

public class InterviewFailed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 153  = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
		int[] number = { 1, 5, 3 };
		String num = "153";
		int m = 1, len = num.length(), rs = 0;
		for (int i = 0; i < num.length(); i++) {
			int s = Integer.parseInt(String.valueOf(num.charAt(i)));
			for (int j = 0; j < num.length(); j++) {
				m = m * s;
			}
			rs = rs + m;
			m = 1; // set m=1 because will add result here
		}
		System.out.print("Result : " + rs);

	}

}
