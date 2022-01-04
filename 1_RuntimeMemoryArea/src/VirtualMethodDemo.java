import java.util.Random;

/**
 * 展示虚方法的使用
 *
 * @author shaojunying
 */
public class VirtualMethodDemo {

    static class Human {
        public void sayHello() {
            System.out.println("Hello from Human");
        }
    }

    static class Man extends Human {
        @Override
        public void sayHello() {
            System.out.println("Hello from Man");
        }
    }

    static class Woman extends Human {
        @Override
        public void sayHello() {
            System.out.println("Hello from Woman");
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        Human human = random.nextBoolean() ? new Man() : new Woman();
        human.sayHello();
    }

}
