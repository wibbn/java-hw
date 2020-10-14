public class Game {
    private Player firstPlayer;
    private Player secondPlayer;

    public Game(Player p1, Player p2) {
        this.firstPlayer = p1;
        this.secondPlayer = p2;
    }

    public void Play() {
        for (int moves = 1; moves <= 106; moves++) {

            Move();
            
            if (firstPlayer.isLose()) {
                System.out.println(firstPlayer + " " + moves);
                return;
            } else if (secondPlayer.isLose()) {
                System.out.println(secondPlayer + " " + moves);
                return;
            }
        }
        System.out.println("botva")
    }

    private void Move() {
        if (firstPlayer > secondPlayer) {
            firstPlayer.addCards(
                firstPlayer.getCard(), 
                secondPlayer.getCard()
            );
        } else {
            secondPlayer.addCards(
                firstPlayer.getCard(), 
                secondPlayer.getCard()
            );
        }
    }
}
