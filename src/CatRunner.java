public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("soup", 2, 3);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("spork", 7, 5);
        cat2.introduce();
        cat2.printCatInfo();

    }
}
