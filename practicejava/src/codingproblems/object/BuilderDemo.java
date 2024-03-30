package codingproblems.object;

public class BuilderDemo {
    public static void main(String[] args) {
        Book book = new Book.Builder("The Great Gatsby", "F. Scott Fitzgerald")
                .pages(180)
                .genre("Fiction")
                .build();

        System.out.println(book);
    }
}
