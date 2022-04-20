/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainexamprac;

/**
 *
 * @author Sumon
 */
public class PracticeString {
    String content;
    
    public PracticeString (String content) {
        this.content = content;
    }
    
    public int charCounter(char chr) {
        int counter = 0;
        for (int i = 0; i < this.content.length(); i++) {
            //System.out.println("Char times: " + str.charAt(i) + " & givenChar " + chr);
            if (this.content.charAt(i) == chr) {
                counter++;
            }
        }
        return counter;
    }
}
