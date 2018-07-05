package com.xyf.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by xinyanfang on 2018/7/5.
 * 模拟借书系统
 */
public class ExceptionTask {
    public static final String [] BookWareHouse = {"高数","计算机网络"};

    public static void main(String[] args) {
            while (true){
                Scanner scanner = new Scanner(System.in);
                System.out.println("输入命令：1.按照名称查找图书；2.按照序号查找图书 3.退出");
                try{
                    int choose = scanner.nextInt();
                    switch (choose){
                        case 1:
                            System.out.println("请输入图书名称:");
                            String bookName = scanner.next();
                            System.out.println("book: "+findByName(bookName));
                            break;
                        case 2:
                            System.out.println("请输入图书序号:");
                            int id = scanner.nextInt();
                            System.out.println("book: "+findById(id));
                        case 3:
                            //退出
                            return;
                        default:
                            System.out.println("输入了错误的数字命令请重新输入");
                            break;
                    }
                }catch (InputMismatchException e){
                    System.out.println("命令输入错误，请根据提示输入数字命令");
                }catch (Exception e){
                    System.out.println("其他错误");
                }
            }
    }

    public  static String findByName(String name){
        String temp = null;
        for (String book:BookWareHouse) {
          if(book.equals(name)){
                temp = book;
                return temp;
          }
        }
        return temp;
    }


    public  static String findById(int id) throws NonexistException {
        String temp = null;
        if(id > BookWareHouse.length){
            throw new NonexistException("图书不存在!");
        }else{
            return BookWareHouse[id-1];
        }
    }
}
