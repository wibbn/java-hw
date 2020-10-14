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
        if (this.averageEduLevel == o.averageEduLevel) {
            return 0;
        } else if (this.averageEduLevel < o.averageEduLevel) {
            return -1;
        } else {
            return 1;
        }
    }
    
    public double getLevel() {
        return this.averageEduLevel;
    }

    public boolean equals(Student o) {
        return this.compareTo(o) == 0 ? true : false;
    }

    public String toString() {
        return String.format("%s (%d): %f", name, age, averageEduLevel);
    }
}