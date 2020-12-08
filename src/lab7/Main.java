package lab7;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<Integer> ar = new CustomArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);

        CustomArrayList<Integer> ra = new CustomArrayList<>();
        ra.add(4);
        ra.add(5);
        ra.add(6);
        
        ar.addAll(ra);

        ra.addAll(2, ar);

        System.out.println(ar.indexOf(2));
        System.out.println(ar.lastIndexOf(2));

        System.out.println("_____________________");
        for (Object o : ra) {
            System.out.println(o);
        }
    }
}