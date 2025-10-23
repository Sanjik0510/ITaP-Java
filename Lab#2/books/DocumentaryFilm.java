package books;

public class DocumentaryFilm extends Film {
    private String topic;
    private boolean isEducational;
    private String targetAudience;

    public DocumentaryFilm(String title, double price, String author, int year, 
                          String director, int runtime, String genre,
                          String topic, boolean isEducational, String targetAudience) {
        super(title, price, author, year, director, runtime, genre);
        this.topic = topic;
        this.isEducational = isEducational;
        this.targetAudience = targetAudience;
    }

    @Override
    public void displayInfo() {
        System.out.println("ДОКУМЕНТАЛЬНЫЙ ФИЛЬМ: '" + title + "'" + "Автор сценария: " + author + " Год: " + year +
         "Режиссер: " + director + " Продолжительность: " + runtime + " мин.");
    }

    public void showFacts() {
        System.out.println("Демонстрация фактов по теме: " + topic);
    }

    public void conductSurvey() {
        System.out.println("Проведение опроса среди зрителей фильма: " + title);
    }

    // Геттеры и сеттеры
    public String getTopic() { return topic; }
    public void setTopic(String topic) { this.topic = topic; }

    public boolean isEducational() { return isEducational; }
    public void setEducational(boolean educational) { isEducational = educational; }
    
    public String getTargetAudience() { return targetAudience; }
    public void setTargetAudience(String targetAudience) { this.targetAudience = targetAudience; }
}