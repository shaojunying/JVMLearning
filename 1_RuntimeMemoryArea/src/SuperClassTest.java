/**
 *
 * 测试问题：
 * super是否可以调用父类的父类的方法
 *
 * @author shaojunying
 */
public class SuperClassTest {
    static class Parent {
        public void test() {
            System.out.println("Parent.test()");
        }
    }

    static class Son extends Parent {

    }

    static class GrandSon extends Son {
        public void fun() {
            super.test();
        }
    }

}
