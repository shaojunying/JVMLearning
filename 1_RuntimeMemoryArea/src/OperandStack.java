public class OperandStack {

    /**
     * 测试数学运算
     */
    public void testOperation() {
        int i =15;
        int j = 8;
        int k = i + j;
    }

    /**
     * 测试方法调用
     */
    public void testMethodInvocation() {
        int i = getNum();

        getNum();
    }

    public int getNum() {
        int i = 1;
        return i;
    }


}
