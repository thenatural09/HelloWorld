/**
 * Created by Troy on 10/11/16.
 */
public class Exercise05 {
    public static void main(String[] args) {
        int num = 12345;


        //manually reverse string
        String stNum = String.valueOf(num);
        String stNum2 = "";
        for (int i = stNum.length()-1; i >= 0; i--) {
            stNum2 += stNum.charAt(i);
        }
        int num2 = Integer.valueOf(stNum2);


        //use string builder
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        sb.reverse();
        num2 = Integer.valueOf(sb.toString());


        //use math
        num2 = 0;
        while(num != 0) {
            num2 *= 10;
            num2 += num % 10;
            num /= 10;
        }
        System.out.println(num2);
    }
}
