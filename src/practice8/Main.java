package practice8;

class Main {
    public static void main(String[] args) {
        BoundedWaitList<String> b = new BoundedWaitList<>(10);
        b.add("element");
        b.add("element2");
        b.add("element3");
        System.out.println(b);

        b.remove();
        System.out.println(b);

        UnfairWaitList<String> u = new UnfairWaitList<>();
        u.add("element");
        u.add("element2");
        u.add("element3");
        System.out.println(u);

        u.moveToBack();
        System.out.println(u);

        u.remove("element2");
        System.out.println(u);
        
        System.out.println(u.contains("element2"));
    }
}