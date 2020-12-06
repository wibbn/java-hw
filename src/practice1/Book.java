package practice1;

public class Book {
    private String name, author, content;
    private int bookmark;

    public Book(String n, String a, String c){
        name = n;
        author = a;
        content = c;
        bookmark = 0;
    }
    public void setBookmark(int page) {
        this.bookmark = page;
    }
    public void nextPage() {
        this.bookmark += 1;
    }
    public String getName(){
        return this.name;
    }
    public int getCurrentPage() {
        return this.bookmark;
    }
    public String toString(){
        return this.name + " by " + this.author + " whit bookmark on " + this.bookmark + " page\n" + this.content;
    }
}