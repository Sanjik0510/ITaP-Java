import books.*;

public class Main {
    public static void main(String[] args) {
        // Создаем по 1 объекту каждого класса
        AudioBook audioBook = new AudioBook("1984", 899.99, "Джордж Оруэлл", 1949, 360, "Иван Иванов", "MP3");
        
        Film film = new Film("Зеленая миля", 1299.99, "Стивен Кинг", 1999, "Фрэнк Дарабонт", 189, "Драма");
        
        DocumentaryFilm documentary = new DocumentaryFilm("Планета Земля", 1499.99, "Дэвид Аттенборо", 
                                                        2006, "Аластер Фотергилл", 550, "Документальный",
                                                        "Природа и животные", true, "Все возрасты");
        
        String[] cast = {"Эндрю Ллойд Уэббер", "Сара Брайтман", "Майкл Кроуфорд"};
        Musical musical = new Musical("Призрак Оперы", 1599.99, "Гастон Леру", 1986, 
                                    "Эндрю Ллойд Уэббер", 25, cast);

        audioBook.adjustPlaybackSpeed(1.5);
        System.out.println();
        
        documentary.displayInfo();
        System.out.println();

        documentary.watchTrailer();
        System.out.println();

        
        System.out.println("Всего создано объектов Book: " + Book.getCount()); 
    }
}