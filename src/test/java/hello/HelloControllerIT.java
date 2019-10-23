package hello;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

public class HelloControllerIT {


    @Test
    public void someTest() throws Exception {
        HelloController helloController = new HelloController();
        assertThat(helloController.index(), equalTo("Service One"));
    }
}
