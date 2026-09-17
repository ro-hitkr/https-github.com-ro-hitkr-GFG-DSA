class Solution {
    int firstOccurence(String txt, String pat) {
        // Fix 1: Handle edge case where pattern is longer than text
        if (pat.length() > txt.length()) {
            return -1;
        }

        for (int i = 0; i <= txt.length() - pat.length(); i++) {
            // Fix 2: Match against the first character of the PATTERN, not the text
            if (txt.charAt(i) == pat.charAt(0)) {
                // Fix 3: Adjust the ending index of the substring to move with 'i'
                if (txt.substring(i, i + pat.length()).equals(pat)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
