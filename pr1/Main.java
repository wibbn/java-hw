public class Main {
    public void testDog() {
        Dog dog1 = new Dog('Alpha', 10);
        Dog gog2 = new Dog('Beta');
        Dog dog3 = new Dog();

        dog3.setAge(13);
        dog2.intoHumanAge();

        System.out.println(dog1, dog2, dog3);
    }

    public void testBall() {
        Ball ball1 = new Ball('red', 10);
        Ball ball2 = new Ball('green');
        Ball ball3 = new Ball();

        ball1.colorize('yelow');
        ball2.increasePressure();

        System.out.println(ball1, ball2, ball3);
    }

    public void testBook() {
        Book book = new Book('The Satanic Bible', 'Anton Szandor LaVey', 'Truth of being');

        book.setBookmark(10);
        book.getCurrentPage();
        book.nextPage();

        System.out.println(book);
    }

    public void main() {
        testDog();
        testBall();
        testBook();
    }
}