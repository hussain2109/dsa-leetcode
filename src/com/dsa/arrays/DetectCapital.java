/*

LeetCode 520. Detect Capital
We define the usage of capitals in a word to be right when one of the following cases holds:

        All letters in this word are capitals, like "USA".
        All letters in this word are not capitals, like "leetcode".
        Only the first letter in this word is capital, like "Google".
        Given a string word, return true if the usage of capitals in it is right.



        Example 1:

        Input: word = "USA"
        Output: true
        Example 2:

        Input: word = "FlaG"
        Output: false


        Constraints:

        1 <= word.length <= 100
        word consists of lowercase and uppercase English letters.
*/
package com.dsa.arrays;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {

        /*
        The idea is if 1st character is lowercase then all character should be lowercase
        If 1st letter is uppercase then rest of the letters should be of same type
        so what we will be doing is whenever uppercase and lowercase characters are more than 0 then it is not a capital

         */

        int numberOfLowerCase = 0;
        int numberOfUpperCase = 0;
        int index = 0;

        if(word==null||word.length()==0){
            return false;
        }
        if(Character.isUpperCase(word.charAt(0))){
            index = 1;
        }


        for(int i = index; i<word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                numberOfUpperCase++;
            }else{
                numberOfLowerCase++;
            }

            if(numberOfLowerCase>0&&numberOfUpperCase>0){
                return false;
            }
        }

        return true;
    }
}
