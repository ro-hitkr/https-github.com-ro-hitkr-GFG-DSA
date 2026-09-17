class Solution {
    public static void utility(String s) {
        // code here
       String r = "";

              for (int i = 0; i < s.length(); i += 2) {
                  r+=s.charAt(i);
              }

              System.out.print(r); // This works now because the header matches
          }
}