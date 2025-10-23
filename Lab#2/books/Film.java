package books;

public class Film extends Book {
    protected int runtime;
    protected String genre;
    protected String director;

    public Film() {
        super();
    }

    public Film(String title, double price, String author, int year, String director, int runtime, String genre) {
        super(title, price, author, year);
        this.director = director;
        this.runtime = runtime;
        this.genre = genre;
    }

    public void watchTrailer() {
        System.out.println("Просмотр трейлера фильма: " + title);
    }

    public void rateFilm(int rating) {
        System.out.println("Фильму '" + title + "' поставлена оценка: " + rating + "/10");
    }

    @Override
    public void displayInfo() {
        System.out.println("Фильм: " + title + ", автор сценария: " + author + ", год: " + year + ", режиссер: " + director + " продолжительность: " + runtime + " мин. жанр: " + genre);
    }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    public int getRuntime() { return runtime; }
    public void setRuntime(int runtime) { this.runtime = runtime; }
    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
}