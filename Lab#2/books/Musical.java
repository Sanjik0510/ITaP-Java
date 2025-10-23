package books;

public class Musical extends Book {
    private String composer;
    private int songCount;
    private String[] cast;

    public Musical(String title, double price, String author, int year, String composer,  int songCount, String[] cast) {
        super(title, price, author, year);
        this.composer = composer;
        this.songCount = songCount;
        this.cast = cast;
    }

    @Override
    public void displayInfo() {
        System.out.println("Мюзикл: " + title + ", автор: " + author + ", год: " + year + ", композитор: " + 
        composer + ", количество песен: " + songCount + ", актерский состав: " + cast);
    }

    public void playSong(int songNumber) {
        System.out.println("Исполнение песни №" + songNumber + " из мюзикла '" + title + "'");
    }

    public void showCast() {
        System.out.println("Актерский состав мюзикла '" + title + "': " + String.join(", ", cast));
    }

    public String getComposer() { return composer; }
    public void setComposer(String composer) { this.composer = composer; }

    public int getSongCount() { return songCount; }
    public void setSongCount(int songCount) { this.songCount = songCount; }
    
    public String[] getCast() { return cast; }
    public void setCast(String[] cast) { this.cast = cast; }
}