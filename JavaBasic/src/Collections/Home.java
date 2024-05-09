package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
    public void start(){
        //洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后的顺序" + allCards);

        //发牌，定义三个玩家才能玩
        List<Card> huangJie = new ArrayList<>();
        List<Card> xiaoLan = new ArrayList<>();
        List<Card> xiaoLi = new ArrayList<>();

        //正式发牌给玩家
        for (int i = 0; i < allCards.size() - 3; i++) {
            Card c = allCards.get(i);
            if(i % 3 == 0){
                huangJie.add(c);
            } else if (i % 3 == 1) {
                xiaoLan.add(c);
            } else if (i % 3 == 2) {
                xiaoLi.add(c);
            }
        }
        //对三个玩家牌进行排序
        sortCard(huangJie);
        sortCard(xiaoLan);
        sortCard(xiaoLi);
        //看牌操作
        System.out.println("huangjie" + huangJie);
        System.out.println("xiaoLan" + xiaoLan);
        System.out.println("xiaoLi" + xiaoLi);

        List<Card> lastThreeCards = allCards.subList(allCards.size() - 3,allCards.size());
        System.out.println("底牌数据" + lastThreeCards);
        //huangjie是地主
        huangJie.addAll(lastThreeCards);
        sortCard(huangJie);
        System.out.println("huangjie" + huangJie);
    }
    public void sortCard(List<Card> cards){
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1 , Card o2) {
                return o1.getSize() - o2.getSize();
            }
        });
    }
}


