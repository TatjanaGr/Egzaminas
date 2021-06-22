import org.junit.runner.RunWith;
import org.junit.runners.Suite;


    @RunWith(Suite.class)
    @Suite.SuiteClasses({
            TestLaptopsNotebooks.class,
            TestTablets.class,
            TestPhonesPDAs.class
    })// class name
    public class TestSuite {

    }

