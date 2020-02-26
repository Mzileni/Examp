import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Testing{

    private Testing Try;
    private int string;

    @Before
    public void setUp() throws Exception{
        Trys = new SampleTest();
    }

    @Test
    public void testObjectEquality(){
        String results = Trys.strings("a","a");
        Assert.assertEquals(results,true,true == true);
    }

    private String strings(String a, String a1) {
        return a;
    }

    @Test
    public void testObectIdentity(){
        String results = Trys.strings("ab","cd");
        // Assert.assertNotSame(results,true,"string1 is not same to string2");
        Assert.assertNotSame(results,true);
    }
    @Test(timeout=20)
    public void testTimeOut(){
        int results =TTrys.stringLenght("String1");
        assertEquals(results,0);}

    private int stringLenght(String string1) {
        return  string;
    }

    @Test
    public void testFail(){
        App test = new App();
        int result = test.calculate(8, 3);
        assertEquals(11, result);
    }
    @Ignore
    @Test
    public void testDisabling(){
        int results = Trys.stringLenght("String1");
        assertEquals(results,0);
    }
}

