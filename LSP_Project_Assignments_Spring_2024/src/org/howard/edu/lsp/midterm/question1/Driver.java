package org.howard.edu.lsp.midterm.question1;

public class Driver {
    public static void main(String[] args) {
        // Test cases to ensure the encrypt method covers a variety of scenarios
        String[] testStrings = {
            "I love CSCI363",      // Original test case with mixed case and numbers
            "Hello, World!",       // Test case with punctuation
            "The quick brown fox jumps over the lazy dog.",  // Test case with all alphabets
            "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz",  // Test case with alternating cases            
            "!@#$%^&*()_+",        // Test case with special characters only
            "1234567890",          // Test case with digits only
            "  ",                   // Test case with spaces only
            ""                      // Test case with empty string
        };

        // Loop through all test cases
        for (String originalText : testStrings) {
            String encryptedText = SecurityOps.encrypt(originalText);
            System.out.println("Original text: " + originalText);
            System.out.println("Encrypted text: " + encryptedText);
            System.out.println();
        }
    }
}