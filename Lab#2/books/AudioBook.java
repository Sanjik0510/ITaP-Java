package books;

public class AudioBook extends Book {
    private int duration;
    private String narrator;
    private String format;

    public AudioBook(String title, double price, String author, int year, int duration, String narrator, String format) {
        super(title, price, author, year);
        this.duration = duration;
        this.narrator = narrator;
        this.format = format;
    }

    public void adjustPlaybackSpeed(double speed) {
        System.out.println("Установлена скорость воспроизведения: " + speed + "x");
    }

    public void bookmarkSection(int timestamp) {
        System.out.println("Закладка установлена на " + timestamp + " минуте");
    }


    @Override
    public void displayInfo() {
        System.out.println("Аудиокнига: " + title + ", автор: " + author + ", год: " + year);
        System.out.println("Длительность: " + duration + " мин. | Диктор: " + narrator + " | Формат: " + format);
    }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public String getNarrator() { return narrator; }
    public void setNarrator(String narrator) { this.narrator = narrator; }
    
    public String getFormat() { return format; }
    public void setFormat(String format) { this.format = format; }
}
