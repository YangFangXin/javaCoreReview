package com.xyf;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

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
    private static List<String> pokers = new ArrayList<String>(asList("foo", "bar", "baz"));

    public static void main(String[] args) {
	// write your code here
        System.out.println("--------------------------------创建扑克牌--------------------------------");
    }
}
