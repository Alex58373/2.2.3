package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
   private static int CAR_ID;
   private static final String men = "Men";
    private static final String baba = "Baba";
   private final List<Car> cars;


    {
        cars = new ArrayList<>();
        cars.add(new Car(++CAR_ID, "BMW", "FRISS", true, men));
        cars.add(new Car(++CAR_ID, "Ford", "BLUE", false, baba));
        cars.add(new Car(++CAR_ID, "Fiat", "GREEN", true, men));
        cars.add(new Car(++CAR_ID, "Chevy", "WHITE",  false, baba));
        cars.add(new Car(++CAR_ID, "LADA", "BLACK",  false, men));
        cars.add(new Car(++CAR_ID, "Toyta", "BROWN", true, men));
        cars.add(new Car(++CAR_ID, "Mustang", "PINK",  false,men));
    }


    @Override
    public List<Car> get(int id) {
        return cars.stream().limit(id).collect(Collectors.toList());
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }
}
