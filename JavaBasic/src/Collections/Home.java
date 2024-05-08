package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Home {
    //必须有一副牌
    private List<Card> allCards = new ArrayList<>();
    public Home(){
        //做出54张牌放入集合中去
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","k","A","2"};
        //准备花色s
        String[] colors = {"♠","♥","♣","♦"};
        //表示每张牌的大小
        int size = 0;
        //遍历点数，再遍历花色
        for (String number : numbers) {
            size++;
            for (String color : colors) {
                Card c = new Card(number,color,size);
                allCards.add(c);
            }
        }
        //单独存入大小王
        Card c1 = new Card("","🧌",++size);
        Card c2 = new Card("","🧞‍♀️",++size);
        Collections.addAll(allCards,c1,c2);
        System.out.println(allCards);
    }
}
