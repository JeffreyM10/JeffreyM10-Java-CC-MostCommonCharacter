import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map <Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i)) == false){
                map.put(str.charAt(i), 1);
            }
            else{
                map.replace(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
        }
        char biggest = ' ';
        int big = 0;
        for(int i = 0; i < map.size(); i++){
            if(map.get(str.charAt(i)) > big){
                biggest = str.charAt(i);
                big = map.get(str.charAt(i));
            }
        }
        return biggest;
    }
}
