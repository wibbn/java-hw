package practice12.task1;

public class Person {
    private String firstName;
    private String lastName;
    private String fatherName;

    public Person(String lastName) {
        this.lastName = lastName;
    }

    public Person(String lastName, String firstName, String fatherName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
    }

    @Override
    public String toString() {
        var builder = new StringBuilder();

        builder.append(lastName);
        if (firstName != null)
            builder.append(" ").append(firstName.toUpperCase().charAt(0)).append(".");
        if (firstName != null && fatherName != null)
            builder.append(fatherName.toUpperCase().charAt(0)).append(".");

        return builder.toString();
    }

    public String getName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
}
