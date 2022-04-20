/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sepb.assignment_three;

/**
 *
 * @author Sumon
 */
public class SubString {
    /*
    Task 2
    Suppose you are given a string input, write a method lengthOfLongestSubstring to find the length of the
    longest substring without repeating characters.
    */
    public static int lenghtOfLongestSubstring(String s) {
        int maxStrLength = 0;
        for (int i = 0; i < s.length(); i++) {
            //Default '0' for all index since int type array a->97, z->122
            int[] charFreq = new int[123]; 
            int count = 0;
            //increament freequency of character according to ASCII
            int j = i;
            while (j < s.length()) {
                charFreq[s.charAt(j)] = charFreq[s.charAt(j)] + 1 ;
                count++;
                //Check repetition of character
                if(charFreq[s.charAt(j)] > 1) {
                    count--;
                    break;
                }
                j++;
            }
            maxStrLength  = (count > maxStrLength) ? count : maxStrLength;
        }
        return maxStrLength;
    }
    
    public static void main(String[] args) {
        String s1 = "abczzabcbb";
        String s2 = "aaaaa";
        String s3 = "pwwkew";
        String s4 = "";
        System.out.println("Lentgh" + lenghtOfLongestSubstring(s1));
        System.out.println("Lentgh" + lenghtOfLongestSubstring(s2));
        System.out.println("Lentgh" + lenghtOfLongestSubstring(s3));
        System.out.println("Lentgh" + lenghtOfLongestSubstring(s4));
    }
}
