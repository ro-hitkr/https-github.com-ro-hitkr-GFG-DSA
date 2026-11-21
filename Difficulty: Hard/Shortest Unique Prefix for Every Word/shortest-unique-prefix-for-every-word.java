class Solution {

    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }

    public ArrayList<String> findPrefixes(String[] arr) {
        ArrayList<String> result = new ArrayList<>();
        if (arr == null || arr.length == 0) {
            return result;
        }

        Node root = new Node();

        // 1. Insert all words and update frequencies
        for (String word : arr) {
            insert(root, word);
        }

        // 2. Find shortest unique prefix for each word in original order
        for (String word : arr) {
            result.add(getShortestUniquePrefix(root, word));
        }

        return result;
    }

    private void insert(Node root, String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    private String getShortestUniquePrefix(Node root, String word) {
        Node curr = root;
        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            curr = curr.children[idx];
            prefix.append(word.charAt(i));

            if (curr.freq == 1) {
                return prefix.toString();
            }
        }
        return prefix.toString();
    }
}
