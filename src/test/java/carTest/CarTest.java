package carTest;

import com.example.demo.cars.Car;
import com.example.demo.cars.Engine;
import com.example.demo.cars.Suspension;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

public class CarTest {
    @TestConfiguration
    static class CarTestConfiguration {
        @Bean
        public Car createCar() {
            return new Car();
        }
    }
    @Autowired
    public Car car;

    @Mock
    Suspension suspension;
    @Mock
    Engine engine;

    @Test
    public void ThisShouldMakeCarWork(){
        Assert.assertTrue(String.valueOf(car.suspension.work()).equals(1));
        Assert.assertTrue(String.valueOf(car.engine.work()).equals(1));
    }
}
