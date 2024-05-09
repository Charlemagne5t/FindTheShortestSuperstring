import java.util.*;

public class Solution {
    String answer = "";

    public String shortestSuperstring(String[] words) {
        dfs(words, 1, 1, words[0]);
        return answer;
    }

    void dfs(String[] words, int count, int mask, String result) {
        if (!answer.isEmpty() && result.length() > answer.length()) {
            return;
        }

        if (count == words.length) {
            if (answer.isEmpty()) {
                answer = result;
            } else if (result.length() < answer.length()) {
                answer = result;
            }
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if ((mask & (1 << i)) != 0) {
                continue;
            }


            KMP kmp1 = new KMP(result + "$" + words[i]);
            int match1 = kmp1.lps[kmp1.lps.length - 1];

            KMP kmp2 = new KMP(words[i] + "$" + result);
            int match2 = kmp2.lps[kmp2.lps.length - 1];

            mask = mask | (1 << i);
            String res1 = words[i].substring(0, words[i].length() - match1) + result;
            String res2 = result.substring(0, result.length() - match2) + words[i];
            dfs(words, count + 1, mask, res1);
            dfs(words, count + 1, mask, res2);
            mask = mask ^ (1 << i);
        }

    }
}

class KMP {
    int[] lps;
    char[] pattern;
    int m;

    public KMP(String pattern) {
        this.pattern = pattern.toCharArray();
        m = pattern.length();
        lps = new int[m];
        computeLPSArray();
    }

    private void computeLPSArray() {
        int length = 0;
        int i = 1;
        lps[0] = 0;

        while (i < m) {
            if (pattern[i] == pattern[length]) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = length;
                    i++;
                }
            }
        }
    }
}
