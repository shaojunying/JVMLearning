/**
 * 要测试的问题：
 * 子类是否可以调用父类的静态方法？
 * 测试结果：
 * 子类可以直接调用父类的static方法，这里只能说子类的方法覆盖了父类的方法，但是这里不是重写
 * Java中的重写：根据对象的运行时类型调用特定的方法。所以这里不能算是重写。
 *             首先这里是根据类的类型调用的，其次这里具体调用什么方法是在编译期确定的。
 * @author shaojunying
 */
public class StaticMethodTest {

    static class Father {
        public static void fun() {
            System.out.println("I am father");
        }
    }

    static class Son extends Father {
    }

    public static void main(String[] args) {
        Son.fun();
    }

}
