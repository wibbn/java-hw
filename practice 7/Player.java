import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class Player implements Comparable<Player> {
    private String name;
    private Queue<Integer> cards;

    public Player(String name, List<Integer> cardSet) {
        this.name = name;
        this.cards = new LinkedList<>(cardSet);
    }

    @Override
    public int compareTo(Player o) {
        Integer card1 = this.getCardValue();
        Integer card2 = o.getCardValue();

        if (card1 == 0 && card2 == 9) {
            return 1;
        } else if (card2 == 0 && card1 == 9) {
            return -1
        } else {
            return card1.compareTo(card2);
        }
    }

    public Integer getCardValue() {
        return this.cards.peek();
    }

    public Integer getCard() {
        return this.cards.poll();
    }

    public void addCards(Integer first, Integer second) {
        this.cards.add(first);
        this.cards.add(second);
    }

    public boolean isLose() {
        return cards.size() == 0;
    }

    public String toString() {
        return name;
    }
}
