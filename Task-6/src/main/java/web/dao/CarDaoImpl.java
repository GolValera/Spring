package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("BMW X5", "white", 2020));
        carList.add(new Car("LADA Granta", "black", 2000));
        carList.add(new Car("Volkswagen Golf", "navy blue", 2005));
        carList.add(new Car("Kia Cerato", "red", 2008));
        carList.add(new Car("Dodge Avenger", "green", 2007));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
