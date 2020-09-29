import java.util.ArrayList;

public class Main {
    public static ArrayList<Student> sortArray(ArrayList<Student> arrayA) {

        if (arrayA.equals(null)) {
            return null;
        }

        if (arrayA.size() < 2) {
            return arrayA;
        }

        ArrayList<Student> arrayB = new ArrayList<Student>();
        for (int i = 0; i < arrayA.size() / 2; i++) {
            arrayB.add(arrayA.get(i));
        }

        ArrayList<Student> arrayC = new ArrayList<Student>(); 
        for (int i = arrayA.size() / 2; i < arrayA.size(); i++) {
            arrayC.add(arrayA.get(i));
        }

        arrayB = sortArray(arrayB);
        arrayC = sortArray(arrayC);
        return mergeArray(arrayB, arrayC);
    }

    public static ArrayList<Student> mergeArray(ArrayList<Student> arrayА, ArrayList<Student> arrayB) {

        ArrayList<Student> arrayC = new ArrayList<Student>();
        int posA = 0;
        int posB = 0;
        int lenA = arrayА.size();
        int lenB = arrayB.size()
        int lenC = lenA + lenB;
        
        while (posA < lenA || posB < lenB) {
            if (posA >= lenA) {
                arrayC.add(arrayB.get(posB));
                posB++;
            } else if (posB >= lenB) {
                arrayC.add(arrayA.get(posA));
                posA++;
            } else if (arrayA.get(posA).compareTo(arrayB.get(posB)) == 1) {
                arrayC.add(arrayA.get(posA));
                posA++;
            } else {
                arrayC.add(arrayB.get(posB));
                posB++;
            }
        }
        return arrayC;
    }

    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();

        s.add(new Student("Vasya", 18, 5.5));
        s.add(new Student("Vova", 18, 6));
        s.add(new Student("Vitya", 18, 4.4));
        s.add(new Student("Vanya", 18, 6.3));

        ArrayList<Student> ss = new ArrayList<>();

        ss.add(new Student("Misha", 18, 3));
        ss.add(new Student("Mikael", 18, 2.9));
        ss.add(new Student("Maga", 18, 8.3));
        ss.add(new Student("Maks", 18, 9));
        s.addAll(ss);
        s = sortArray(s);
        System.out.println(s);

        s = sortArray(s);
        System.out.println(s);
    }
}