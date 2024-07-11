import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
    @Scope("prototype")
    // Аннотация @Scope указывает на то, что при каждом вызове будут создаваться новые бины.
    @Bean(name="cat")
    // Аннотация @Bean указывает на то, что метод должен создавать бин с именем "cat".
    public Cat getCat() {
        // Создание нового экземпляра класса Cat
        Cat cat = new Cat();
        // Установка сообщения в экземпляре класса Cat
        cat.setSound("meow");
        // Возврат созданного экземпляра класса Cat
        return cat;
    }
}
