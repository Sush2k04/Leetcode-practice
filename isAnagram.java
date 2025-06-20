class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] c = new int[26];
        for(int i = 0;i<s.length();i++){
            c[s.charAt(i)-'a']++;
            c[t.charAt(i)-'a']--;
        }
        for(int cr:c){
            if(cr!=0) return false;
        }
        return true;
    }
}
