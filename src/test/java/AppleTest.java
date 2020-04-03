import org.junit.Assert;
import org.junit.Test;

public class AppleTest {
    String expected = "Facebook – log in or sign up";

    @Test
    public void nameValidation() {

        Apple apl = new Apple();
            String name=apl.getName();
        //System.out.println(name);
        Assert.assertEquals(expected,name);
    }
}
//git init - initialize .git- local repo
//git add . - it will all files into staging area
//git commit -m"message" - it will cmmit files from staging area to locla repo
//git push origin master - pusing files to gituhub// origin - gituhub repo path
//
//