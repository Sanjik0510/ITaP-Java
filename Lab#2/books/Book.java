package books;

public abstract class Book {
    protected String title;
    protected double price;
    protected String author;
    protected int year;
    private static int count = 0;

    public Book() {
        count++;
    }

    public Book(String title, double price, String author, int year) {
        this.title = title;
        this.price = price;
        this.author = author;
        this.year = year;
        count++;
    }

    public abstract void displayInfo();

    public void calculateDiscount() {
        double discount = price * 0.1;
        System.out.println("Скидка на " + title + ": " + discount);
    }

    // Геттеры и сеттеры
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public double price() {return price; }
    public void price(double price) { this.price = price; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public static int getCount() { return count; }
}