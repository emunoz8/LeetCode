
public class ValidPalindrome{
    public static void main(String[] args) {
        String word = "0P";

        System.out.println(isPalindrome(word));
        

    }

    public static boolean isPalindrome(String s){
        StringBuilder buffer = new StringBuilder();
        String ans;
        int k =0,j;
        s = s.toLowerCase();

        for(int i =0; i < s.length(); i++){
            char curr = s.charAt(i);
            if((curr >= 97 && curr <=122) || (curr >= 48 && curr <= 57) )
                buffer.append(curr);

        }

        ans = buffer.toString();
        j = ans.length() -1;

        while(k < j){
            if(ans.charAt(k++) != ans.charAt(j--))
                return false;

        }

        return true;

    }



}