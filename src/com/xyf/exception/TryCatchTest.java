package com.xyf.exception;


/**
 * Created by xyf on 2018/6/27.
 */
public class TryCatchTest{
    public static void main(String[] args) {
        TryCatchTest tryCatchTest = new TryCatchTest();
        int result = tryCatchTest.test();
        System.out.println("test()方法执行完毕返回值为： "+result);
    }

    /***
     * divider(除数)
     * result(结果)
     * try-catch捕获while循环
     * 每次循环，divider -1,result=result+100/divider
     * 如果：捕获异常，打印输出"抛出异常了 ！！！"，返回-1
     * @return
     */
    public  int test(){
        int divider  = 10;
        int result = 100;
        try {
            while(divider >-1){
                divider--;
                result = (result+100)/divider;
            }
            return result;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("循环抛出异常了");
            return -1;
        }
    }
}
