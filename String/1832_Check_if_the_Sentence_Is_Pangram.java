// LeetCode 1832 - Check if the Sentence Is Pangram

class Solution {
    public boolean checkIfPangram(String sentence) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (sentence.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }
}
