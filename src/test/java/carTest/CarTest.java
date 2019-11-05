package carTest;

import com.example.demo.cars.Car;
import com.example.demo.cars.Engine;
import com.example.demo.cars.Suspension;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

public class CarTest {

    @TestConfiguration
    static class CarTestConfiguration{
        @Bean
        public Car createCar(){
            return new Car();
        }
    }

    @Autowired
    Car car;
    @Mock
    Engine engine;
    @Mock
    Suspension suspension;

    @Before
    public void setUp(){
        Mockito.when(engine.work()).thenReturn(1);
        Mockito.when(suspension.work()).thenReturn(1);
    }

    @Test
    public void ThisShouldMakeCarDrive(){
        Assert.assertTrue(car.drive());
    }
}
