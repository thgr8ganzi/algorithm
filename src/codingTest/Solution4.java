package codingTest;
import java.util.ArrayList;
public class Solution4 {
    public String[] solution(String[] card, String[] word) {
        ArrayList<String> possibleWords = new ArrayList<>();

        for (String w : word) {
            if (canBeFormed(w, card)) {
                possibleWords.add(w);
            }
        }

        if (possibleWords.isEmpty()) {
            return new String[]{"-1"};
        } else {
            String[] answer = new String[possibleWords.size()];
            answer = possibleWords.toArray(answer);
            return answer;
        }
    }

    private boolean canBeFormed(String word, String[] card) {
        int[] cardLetterCount = new int[26];
        int[] wordLetterCount = new int[26];

        for (String c : card) {
            for (char ch : c.toCharArray()) {
                cardLetterCount[ch - 'A']++;
            }
        }

        for (char ch : word.toCharArray()) {
            wordLetterCount[ch - 'A']++;
        }

        for (String line : card) {
            boolean lineUsed = false;
            for (char ch : line.toCharArray()) {
                if (wordLetterCount[ch - 'A'] > 0) {
                    lineUsed = true;
                    break;
                }
            }
            if (!lineUsed) return false;
        }

        for (int i = 0; i < 26; i++) {
            if (wordLetterCount[i] > cardLetterCount[i]) {
                return false;
            }
        }
        return true;
    }
}
