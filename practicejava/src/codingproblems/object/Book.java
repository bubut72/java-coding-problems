package codingproblems.object;

// Below is an example of implementing the Builder pattern in an immutable class

public class Book {
    private final String title;
    private final String author;
    private final int pages;
    private final String genre;

    private Book(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.pages = builder.pages;
        this.genre = builder.genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return STR."Book{title='\{title}\{'\''}, author='\{author}\{'\''}, pages=\{pages}, genre='\{genre}\{'\''}\{'}'}";
    }

    public static class Builder {
        private final String title;
        private final String author;
        private int pages;
        private String genre;

        public Builder(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public Builder pages(int pages) {
            this.pages = pages;
            return this;
        }

        public Builder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
