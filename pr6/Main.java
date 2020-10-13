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
        ArrayList<Student> s1 = new ArrayList<>();
        ArrayList<Student> s2 = new ArrayList<>();

        s1.add(new Student("Evklid", 18, 5.5));
        s1.add(new Student("Kant", 18, 6));
        s1.add(new Student("Aristotel", 18, 4.4));
        s1.add(new Student("Dekart", 18, 6.3));

        s2.add(new Student("Apofiy", 18, 3));
        s2.add(new Student("Mikael", 18, 2.9));
        s2.add(new Student("Maga", 18, 8.3));
        s2.add(new Student("Maks", 18, 9));

        s1.addAll(s2);

        s1 = sortArray(s1);
        s2 = sortArray(s2);

        System.out.println(s1);

        System.out.println(s2);
    }
}