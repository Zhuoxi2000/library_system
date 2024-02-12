public class Book {
    private String title;
    private String author;
    private String isbn;
    private int quantityInStock;
    private int borrowed;
    private String status;

    // Constructor
    public Book(String title, String author, String isbn, int quantityInStock, int borrowed, String status) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.quantity = quantity;
        this.borrowed = borrowed;
        this.status = status;
    }

    // Getter && Setter Method
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getQuantity() {
        return quantityInStock;
    }

    public void setQuantity(int quantity) {
        this.quantityInStock = quantity;
    }

    public int getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(int borrowed) {
        this.borrowed = borrowed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
