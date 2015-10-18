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
    public void showFibonacciWith1Number() {
        assertThat(fibonacci.fiboCalculate(4), is(3));
    }

    @Test
    public void showFibonacciSequenceWithRange10() {
        assertThat(fibonacci.fibonacciSequence(10), is("-0-1-1-2-3-5-8-13-21-34-55"));
    }











    }
