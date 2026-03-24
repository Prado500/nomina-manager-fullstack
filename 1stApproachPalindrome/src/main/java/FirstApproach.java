import java.util.ArrayList;
import java.util.List;

public class FirstApproach {

    public static boolean isPalindrome(String s){

        if ((s.length() - 1) % 2 != 0  ){
            return false;
        }



            char[] palabra = s.toCharArray();
            List<String> half1 = new ArrayList<>();
            List<String> half2 = new ArrayList<>();

            int left = 0;
            int right = s.length() - 1;
            int middlePos = (s.length() / 2) - 1;

            while (left < middlePos && right > middlePos){
                half1.add(String.valueOf(palabra[left]));
                half2.add(String.valueOf(palabra[right]));
                left++;
                right--;
            }

            return half1.equals(half2) ;
    }


    public static void main(String[] args) {

        String palabra = "wasitacaroracatisaw";
        System.out.println(isPalindrome(palabra));


    }

}
