import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");


        System.out.println(bean.getMessage());
        System.out.println(bean2.getMessage());
        // Сравнение бинов по ссылке и вывод результата в консоль
        System.out.println("Сравнение HelloWorld: " + (bean.equals(bean2)));


        Cat bean3 = (Cat) applicationContext.getBean("cat");
        Cat bean4 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean3.getSound());
        System.out.println(bean4.getSound());


        // Сравнение бинов по ссылке и вывод результата в консоль
        System.out.println("Сравнение Cat: " + (bean3.equals(bean4)));
    }
}