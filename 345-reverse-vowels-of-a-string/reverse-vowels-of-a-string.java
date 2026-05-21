class Solution {
    public String reverseVowels(String s) {
        // Convert the string to a character array since strings are immutable in Java
        char[] arr = s.toCharArray(); 
        
        int start = 0; 
        int end = s.length() - 1;
        
        while (start < end) {
            // Move the start pointer forward until it finds a vowel
            while (start < end && !isVowel(arr[start])) {
                start++;
            }
            
            // Move the end pointer backward until it finds a vowel
            while (start < end && !isVowel(arr[end])) {
                end--;
            }
            
            // Swap the vowels
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move both pointers inward to continue the loop
            start++;
            end--;
        }
        
        // Convert the character array back into a String
        return new String(arr);
    }
    
    // Helper method to check if a character is a vowel (handles both cases)
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}