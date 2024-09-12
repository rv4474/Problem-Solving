class Solution {
    public boolean check(String s,HashSet<Character> set){
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))==false) return false;
        }
        return true;
    }
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        int count=0;
        for(int i=0;i<words.length;i++){
          if(check(words[i],set)==true) count++;
        }
        return count;
    }
}