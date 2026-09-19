class Solution {
    public static String concatenatedString(String s1, String s2) {
        // code here
        StringBuilder s = new StringBuilder();
        
           HashSet<Character> str1 = new  HashSet<>();
           HashSet<Character> str2 = new  HashSet<>();
       
       for(int i=0;i<s1.length();i++){
           str1.add(s1.charAt(i));
       }
       for(int i=0;i<s2.length();i++){
           str2.add(s2.charAt(i));
       }
       
       for(int i=0;i<s1.length();i++){
           char c = s1.charAt(i);
           if(!str2.contains(c)){
               s.append(c);
           }
       }
         for(int i=0;i<s2.length();i++){
           char c = s2.charAt(i);
           if(!str1.contains(c)){
               s.append(c);
           }
       }
       if(s.length()==0){
           return "-1";
       }
       return s.toString();
    }
}
