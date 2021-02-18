
import org.testng.annotations.Test;

public class AppiumTest {
    @Test
    public void NativeAppAndroid()
    {
System.out.println("NativeAppAndroid");
        System.out.println("NativeSelenium");
        System.out.println("NativeRestApi");
    }
    @Test
    public void IOSApps(){
        System.out.println("IOSApps");
    }
    @Test(groups={"Smoke"})
    public void ploan()
    {
        System.out.println("good");
    }

    @Test
    public void prerequiste()
    {
        System.out.println("I will execute first");
    }

}
