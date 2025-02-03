import java.util.HashMap;

public class WordPattern{
    public static void main(String[] args) {

        System.out.println(wordPattern("abba", "dog cat cat dog"));
        
    }
    //not the most effecient, similar to IsomorphicStrings problem.
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        char [] chars = pattern.toCharArray();
        String [] words = s.split(" ");
        String value;
        char key;


        for(int i =0; i < chars.length; i++){
            key = chars[i];
            value = words[i];
            
            if (map.containsKey(key) && !map.get(key).equals(value) )
                return false;
            else if (map.containsValue(value) && !map.containsKey(key))
                return false;
            else 
                map.put(key,value);

        }

        return true;
    }
}