import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PostersManagerTest {

    @Test
    public void FindAll() {
        PostersManager manager = new PostersManager();

        String[] actual = manager.findAll();
        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindOneMovie() {
        PostersManager manager = new PostersManager();

        manager.addMovie("Бладшот");

        String[] actual = manager.findAll();
        String[] expected = {"Бладшот"};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void FindFiveMovie() {
        PostersManager manager = new PostersManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Форсаж");
        manager.addMovie("Индиана Джонс");
        manager.addMovie("Вперед");
        manager.addMovie("Один Дома");

        String[] actual = manager.findAll();
        String[] expected = {"Бладшот", "Форсаж", "Индиана Джонс", "Вперед", "Один Дома"};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void FindlastMovie() {
        PostersManager manager = new PostersManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Форсаж");
        manager.addMovie("Индиана Джонс");
        manager.addMovie("Вперед");
        manager.addMovie("Один Дома");

        String[] actual = manager.findLast();
        String[] expected = {"Один Дома", "Вперед", "Индиана Джонс", "Форсаж", "Бладшот"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindlastTMovie() {
        PostersManager manager = new PostersManager(3);

        //manager.addMovie("Бладшот");
        // manager.addMovie("Форсаж");
        manager.addMovie("Индиана Джонс");
        manager.addMovie("Вперед");
        manager.addMovie("Один Дома");

        String[] actual = manager.findLast();
        String[] expected = {"Один Дома", "Вперед", "Индиана Джонс"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Findlast7Movie() {
        PostersManager manager = new PostersManager(7);

        manager.addMovie("Бладшот");
        manager.addMovie("Форсаж");
        manager.addMovie("Индиана Джонс");
        manager.addMovie("Вперед");
        manager.addMovie("Один Дома");

        String[] actual = manager.findLast();
        String[] expected = {"Один Дома", "Вперед", "Индиана Джонс", "Форсаж", "Бладшот"};

        Assertions.assertArrayEquals(expected, actual);
    }
}