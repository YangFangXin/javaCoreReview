package com.xyf.exception;

/**
 * Created by xinyanfang on 2018/7/5.
 */
public class ChainTest {
    /***
     * test1():抛出："喝大了"
     * test2():调用test1(),捕获"喝大了" 异常，并且包装成运行时异常
     * @param args
     */
    public static void main(String[] args) {
        ChainTest ct = new ChainTest();
        ct.test2();
    }


    public void test1() throws DrunkException {
        throw new DrunkException("喝大了");
    }

    public void test2(){
        try {
            test1();
        } catch (DrunkException e) {
            RuntimeException runtimeException = new RuntimeException("司机一滴酒，亲人两行泪");
            //包装异常
            runtimeException.initCause(e);
            throw runtimeException;
        }
    }
}
