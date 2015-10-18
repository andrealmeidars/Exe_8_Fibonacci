import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FibonacciTest {

    Fibonacci fibonacci;

    @Before
    public void setUp() throws Exception {
        this.fibonacci = new Fibonacci();

    }

    @Test
    public void showTrueIfNumberIs1(){
        assertThat(fibonacci.fibonacciSequence(1), is(true));

    }





}
