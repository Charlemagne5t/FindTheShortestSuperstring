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
    @Test
    public void test3() {
        String[] words = {"abcdef","efde","defab"};
        String expected = "efdefabcdef";
        String actual = new Solution().shortestSuperstring(words);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test4() {
        String[] words = {"mftpvodataplkewcouz","krrgsoxpsnmzlhprsl","qhbfymytxzbmqma","hunjgeaolcuznhpodi","kewcouzbwlftz","xzbmqmahunjgeaolcu","zlhprslqurnqbhsjr","rrgsoxpsnmzlhprslqur","diqukrrgsoxpsnmz","sjrxzavamftpvoda"};
        String expected = "qhbfymytxzbmqmahunjgeaolcuznhpodiqukrrgsoxpsnmzlhprslqurnqbhsjrxzavamftpvodataplkewcouzbwlftz";
        String actual = new Solution().shortestSuperstring(words);

        Assert.assertEquals(expected, actual);
    }

}
