package com.seleniummaster.iO;
import org.junit.*;
import org.junit.rules.TestName;
import java.util.Date;

public class JUnitDemo {
    //@BeforeClass Run once before any of the test methods in the class (public static void)
    //@Before This method will be called before calling every test (public void method)
    //@Test This is the actual test method (public void method)
    //@After This method will be called after completing every test (public void method)
    //@Ignore Marks that the test should be disabled
    //@Test(timeout=xxx) Fails if the method takes longer than xxx milliseconds.
    //@Test (expected = Exception.class) Fails if the method does not throw the named exception
    //@AfterClass Run once after all the tests in the class have been run (public static void)
    //setUp() method, which runs before every test invocation.
    //tearDown() method, which runs after every test method.
    @BeforeClass
    public static void runOnceBeforeTheStartOfAllTests() {
        System.out.println("JUnit Before Class runs only once before all test methods");
    }

    @Before
    public void runBeforeEachTest() {
        System.out.println("JUnit Before runs once before each test");
    }

    @Rule
    public TestName name = new TestName();

    @Test
    public void squareRootTest() {
        System.out.println("Test name: " + name.getMethodName());
        System.out.println("This is square root test");
        Assert.assertTrue(Math.sqrt(9) == 3);
    }

    @Test
    public void powerTest() {
        System.out.println("Test name: " + name.getMethodName());
        System.out.println("This is power test");
        Assert.assertTrue(Math.pow(10, 2) == 100);
    }
    @Ignore
    @Test(timeout = 1000)
    public void timeoutTest() {
        long startTime;
        long endTime = 0;
        long elapsedTime;
        startTime = new Date().getTime();
        System.out.println("Start time: " + startTime);
        for (int i = 0; i < 1000000; i++) {
            endTime = new Date().getTime();
        }

        System.out.println("End time: " + endTime);
        elapsedTime = (endTime - startTime);
        Assert.assertEquals(elapsedTime, 1000);
    }

    @After
    public void runAfterEachTest() {
        System.out.println("Junit After runs once after each test");
    }

    @AfterClass
    public static void runOnceAfterTheEndOfAllTests() {
        System.out.println("JUnit After Class runs only once after all tests have been finished");
    }
}
