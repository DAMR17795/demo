package demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    public int suma(int numA, int numB) {
        return numA+numB;
    }

    @Test
    public void testSuma() {
        AppTest calc = new AppTest();
        int resultado = calc.suma(2, 3);
        assertEquals(5, resultado);
    }




}
