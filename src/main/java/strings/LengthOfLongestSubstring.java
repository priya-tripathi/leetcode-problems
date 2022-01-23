package strings;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcabcdbb"));
    }

    static int lengthOfLongestSubstring(String s) {

        String str="";
        int k=0;
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(str.indexOf(ch)>=0)
            {
                max=Math.max(max,str.length());
                int x = str.indexOf(ch)+1;
                str=str.substring(str.indexOf(ch)+1);
            }
            str=str+ch;
        }
        max=Math.max(max,str.length());
        //sliding window way
//        Map<Character, Integer> map = new HashMap<>();
//        int max = 0;
//        int windowStart = 0;
//        for(int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (map.containsKey(c)) {
//                windowStart = Math.max(windowStart, map.get(c) + 1);
//            }
//            map.put(c, i);
//            max = Math.max(max, i - windowStart + 1);
//        }
        return max;
    }

}

