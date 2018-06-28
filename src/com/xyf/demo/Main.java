package com.xyf.demo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 功能需求描述：
 * 1.创建一副扑克牌（是有顺序的）
 *     包括四种花色：黑桃、红桃、梅花、方片
 *     13种点数：2-10、J、Q、K、A,不考虑大小王
 * 2.创建两名玩家
 *      玩家至少要有ID、姓名、手牌等属性，手牌为扑克牌的集合
 * 3.洗牌
 *    将之前创建的"一副扑克牌打乱顺序"
 * 4.发牌
 *    将洗牌之后的扑克牌集合，从第一张开始，发给两名玩家，按照一人一张的方式，每人发两张
 * 5.比较两名玩家手中的扑克牌，规则为：取两人各自手中点数最大的牌进行比较，点数大的赢；
 * 若两人各自的点数最大的牌相等，则按花色比较。
 */
public class Main {
    //扑克牌
    private static List<String> pokers = new ArrayList<String>();
    private static final String Spades = "黑桃";
    private static final String RedPeach = "红桃";
    private static final String Piece = "方片";
    private static final String Blossom = "梅花";


    public static void switchMethod(int j,String pokerType){
        switch (j){
            case 11:
                pokers.add(pokerType+"J");
                break;
            case 12:
                pokers.add(pokerType+"Q");
                break;
            case 13:
                pokers.add(pokerType+"K");
                break;
            case 14:
                pokers.add(pokerType+"A");
                break;
        }
    }

    public static void createPokers(){
        System.out.println("--------------------------------创建扑克牌--------------------------------");
        for(int i=0;i<4;i++){
            for (int j=2;j<15;j++){
                switch (i){
                    case 0:
                        if(j>10){
                            switchMethod(j,Spades);
                            break;
                        }
                        pokers.add(Spades+j);
                        break;
                    case 1:
                        if(j>10){
                            switchMethod(j,Spades);
                            break;
                        }
                        pokers.add(RedPeach+j);
                        break;
                    case 2:
                        if(j>10){
                            switchMethod(j,Spades);
                            break;
                        }
                        pokers.add(Piece+j);
                        break;
                    case 3:
                        if(j>10){
                            switchMethod(j,Spades);
                            break;
                        }
                        pokers.add(Blossom+j);
                        break;
                }

            }
        }
        System.out.println("--------------------------------扑克牌创建成功--------------------------------");
        System.out.println("扑克牌为："+pokers);
        System.out.println("张数为"+pokers.size());

    }


    public static void main(String[] args) {
        //1.创建一副扑克牌并洗牌
        createPokers();
        System.out.println("--------------------------------开始洗牌--------------------------------");
        Collections.shuffle(pokers);
        System.out.println("--------------------------------洗牌结束--------------------------------");
        System.out.println(pokers);

        //2.创建两名玩家
        System.out.println("--------------------------------创建玩家--------------------------------");
        System.out.println("--------------------------------请输入第1位玩家的ID和姓名--------------------------------");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        String userName = scanner.next();
        Person person = new Person(Integer.valueOf(id),userName,new ArrayList<String>());

        System.out.println("--------------------------------请输入第2位玩家的ID和姓名--------------------------------");
        Scanner scanner2 = new Scanner(System.in);
        int id2 = scanner.nextInt();
        String userName2 = scanner2.next();
        Person person2 = new Person(Integer.valueOf(id),userName,new ArrayList<String>());


    }

}
