package practice9;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double averageEduLevel;

    public Student(String name, int age, double level) {
        this.name = name;
        this.age = age;
        averageEduLevel = level;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.averageEduLevel, o.averageEduLevel);
    }
    
    public double getLevel() {
        return this.averageEduLevel;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Student o) {
        return this.compareTo(o) == 0;
    }

    public String toString() {
        return String.format("%s (%d): %f", name, age, averageEduLevel);
    }
}