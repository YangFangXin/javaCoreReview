package com.xyf.exception;

/**
 * Created by xinyanfang on 2018/7/5.
 * 自定义不存在异常
 */
public class NonexistException extends  Exception{
    public NonexistException(){

    }

    public NonexistException(String message){
        super(message);
    }
}
