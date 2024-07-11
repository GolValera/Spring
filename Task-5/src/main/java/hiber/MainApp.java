package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);
      User user1 = new User("Valeriya", "Golikova", "user1@mail.ru");
      Car car1 = new Car("BMW", 1234);
      user1.setCar(car1);
      userService.add(user1);

      User user2 = new User("Anastasia", "Gritsenko", "user2@mail.ru");
      Car car2 = new Car("Porsche", 5678);
      user2.setCar(car2);
      userService.add(user2);

      User user3 = new User("Alexander", "Gaidukov", "user3@mail.ru");
      Car car3 = new Car("Infinity", 91011);
      user3.setCar(car3);
      userService.add(user3);

      User user4 = new User("Kirill", "Marchenko", "user4@mail.ru");
      Car car4 = new Car("Mercedes", 121314);
      user4.setCar(car4);
      userService.add(user4);

      User user5 = new User("Dmitriy", "Mishin", "user5@mail.ru");
      Car car5 = new Car("Lamborghini", 1511617);
      user5.setCar(car5);
      userService.add(user5);

      List<User> users = userService.listUsers();
      for (User user : users) {
         System.out.println("Id = "+user.getId());
         System.out.println("First Name = "+user.getFirstName());
         System.out.println("Last Name = "+user.getLastName());
         System.out.println("Email = "+user.getEmail());
         System.out.println("Car = "+user.getCar().getModel() +" "+user.getCar().getSeries());
         System.out.println();
      }

      context.close();
   }
}
