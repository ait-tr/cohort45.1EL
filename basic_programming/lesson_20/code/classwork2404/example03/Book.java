package classwork2404.example03;

public class Book {
    private int id;
    private String title;
    private String authorName;
    private String genre;
    private int pagesAmount;
    private int yearPublished;
    private boolean available;

    public Book(int id, String title, String authorName, String genre, int pagesAmount, int yearPublished, boolean available) {
        this.id = id;
        this.title = title;
        this.authorName = authorName;
        this.genre = genre;
        this.pagesAmount = pagesAmount;
        this.yearPublished = yearPublished;
        this.available = available;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPagesAmount() {
        return pagesAmount;
    }

    public void setPagesAmount(int pagesAmount) {
        this.pagesAmount = pagesAmount;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
