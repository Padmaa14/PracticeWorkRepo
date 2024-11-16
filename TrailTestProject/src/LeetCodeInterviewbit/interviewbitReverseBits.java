package LeetCodeInterviewbit;

public class interviewbitReverseBits {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        // bitwise not
        // ~00000000 00000000 00000000 00000101=11111111 11111111 11111111 11111010
        // will give 2's complement (32 bit) of 5 = -6
        System.out.println("~a = " + ~a);
        int c=9;
        System.out.println("9 = "+Integer.toBinaryString(c));
        byte ab = 32, bc;
        int i;
        i = ab << 2; //left shift
        bc = (byte) (ab << 2);
        System.out.println(i);
        System.out.println("bc: " + bc);
        //final answer unable to understand question
        long A=3;
        long rev = 0;

        for (int j = 0; j < 32; j++) {
            rev <<= 1;
            if ((A & (1 << j)) != 0)
                rev |= 1;
        }

        System.out.println(rev);

    }

}
