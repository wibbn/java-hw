package practice2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("Kafka", "kafka@lit.org", 't');
        System.out.println(a);
        a.setEmail("tolstoy@lit.ru");
        System.out.println(a);
    }
}