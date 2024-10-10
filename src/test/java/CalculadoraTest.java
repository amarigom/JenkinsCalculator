import com.andrea.training.Calculadora;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTest {
    //Calculadora calc= new Calculadora();
    @Test
    public void probarSuma(){
        Calculadora calc= new Calculadora();
        double resultado= 10.0;
        assertEquals(resultado,calc.addCalc(5,5),0.001);
        assertEquals(7.0,calc.addCalc(3,4),0.001);
        assertEquals(7.0,calc.addCalc(2,5),0.001);
    }

    @Test
    public void probarResta(){
        Calculadora calc= new Calculadora();
        double resultado= 5.0;
        assertEquals(resultado,calc.subsCalc(10,5),0.001);
    }
}
