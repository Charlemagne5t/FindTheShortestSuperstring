import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        String[] words = {"alex", "loves", "leetcode"};
        String expected = "alexlovesleetcode";
        String actual = new Solution().shortestSuperstring(words);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        String[] words = {"catg", "ctaagt", "gcta", "ttca", "atgcatc"};
        String expected = "gctaagttcatgcatc";
        String actual = new Solution().shortestSuperstring(words);

        Assert.assertEquals(expected, actual);
    }
}
