package authors;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return this.gender;
    }

    public String toString() {
        return "Author " + this.name + " with gender " + this.gender + ", and email: " + email;
    }
}

public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author('Kafka', 'kafka@lit.org', 't');
        System.out.println(a);
        a.setGender('m');
        System.out.println(a);
    }
}