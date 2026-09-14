class Solution {
    public String reverseWords(String s) {
         // Trim leading/trailing spaces and split by one or more spaces
        String[] words = s.trim().split("\\s+");
        
        // Use a StringBuilder to efficiently build the final string
        StringBuilder reversed = new StringBuilder();
        
        // Loop backwards through the array of words
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); // Add a single space between words
            }
        }
        
        return reversed.toString();
    }
}