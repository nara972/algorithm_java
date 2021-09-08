import java.util.HashMap;

public class Solution {
    
    public static void main(String[] args) {
        String[] participant = { "mislav", "stanko", "mislav", "ana" };
        String[] completion = { "stanko", "ana", "mislav" };
        System.out.println(solution(participant, completion));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        for (String p : participant) {
            if (map.get(p) == null) {
                map.put(p, 1);
            } else {
                map.put(p, map.get(p) + 1);
            }
        }

        for (String p : completion) {
            if (map.get(p) != 0) {
                map.put(p, map.get(p) - 1);
            }
        }

        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                System.out.println(key);
                return key;
            }
        }

        return answer;

    }
}
