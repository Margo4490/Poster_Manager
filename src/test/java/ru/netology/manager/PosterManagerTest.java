package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {

    @Test
    public void save() {
        Movie first = new Movie(1, "Bloodshot", "action movie", 150);
        Movie second = new Movie(2, "Forward", "cartoon", 200);
        Movie third = new Movie(3, "Hotel Belgrade", "comedy", 100);
        Movie forth = new Movie(4, "Gentlemen", "action movie", 300);
        Movie fifth = new Movie(5, "Invisible man", "horror", 150);
        Movie sixth = new Movie(6, "Trolls.World tour", "cartoon", 250);
        Movie seventh = new Movie(7, "Number one", "comedy", 190);
        Movie eighth = new Movie(8, "Time", "drama,fantastic", 220);
        Movie ninth = new Movie(9, "Venom 2", "fantastic, action movie", 300);
        Movie tenth = new Movie(10, "Cruella", "comedy", 250);

        PosterManager manager = new PosterManager();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(forth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);

        Movie[] expected = {first, second, third, forth, fifth, sixth, seventh, eighth, ninth, tenth};
        Movie[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findAll() {
        Movie first = new Movie(1, "Bloodshot", "action movie", 150);
        Movie second = new Movie(2, "Forward", "cartoon", 200);
        Movie third = new Movie(3, "Hotel Belgrade", "comedy", 100);
        Movie forth = new Movie(4, "Gentlemen", "action movie", 300);
        Movie fifth = new Movie(5, "Invisible man", "horror", 150);
        Movie sixth = new Movie(6, "Trolls.World tour", "cartoon", 250);
        Movie seventh = new Movie(7, "Number one", "comedy", 190);
        Movie eighth = new Movie(8, "Time", "drama,fantastic", 220);
        Movie ninth = new Movie(9, "Venom 2", "fantastic, action movie", 300);
        Movie tenth = new Movie(10, "Cruella", "comedy", 250);

        PosterManager manager = new PosterManager();

        Movie[] expected = {};
        Movie[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void findLast() {
        Movie first = new Movie(1, "Bloodshot", "action movie", 150);
        Movie second = new Movie(2, "Forward", "cartoon", 200);
        Movie third = new Movie(3, "Hotel Belgrade", "comedy", 100);
        Movie forth = new Movie(4, "Gentlemen", "action movie", 300);
        Movie fifth = new Movie(5, "Invisible man", "horror", 150);
        Movie sixth = new Movie(6, "Trolls.World tour", "cartoon", 250);
        Movie seventh = new Movie(7, "Number one", "comedy", 190);
        Movie eighth = new Movie(8, "Time", "drama,fantastic", 220);
        Movie ninth = new Movie(9, "Venom 2", "fantastic, action movie", 300);
        Movie tenth = new Movie(10, "Cruella", "comedy", 250);

        PosterManager manager = new PosterManager();

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(forth);
        manager.save(fifth);

        Movie[] expected = {fifth, forth, third, second, first};
        Movie[] actual = manager.findLast();

        assertArrayEquals(expected, actual);


    }

    @Test
    public void findLast1() {
        Movie first = new Movie(1, "Bloodshot", "action movie", 150);
        Movie second = new Movie(2, "Forward", "cartoon", 200);
        Movie third = new Movie(3, "Hotel Belgrade", "comedy", 100);
        Movie forth = new Movie(4, "Gentlemen", "action movie", 300);
        Movie fifth = new Movie(5, "Invisible man", "horror", 150);
        Movie sixth = new Movie(6, "Trolls.World tour", "cartoon", 250);
        Movie seventh = new Movie(7, "Number one", "comedy", 190);
        Movie eighth = new Movie(8, "Time", "drama,fantastic", 220);
        Movie ninth = new Movie(9, "Venom 2", "fantastic, action movie", 300);
        Movie tenth = new Movie(10, "Cruella", "comedy", 250);

        PosterManager manager = new PosterManager();

        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);

        Movie[] expected = {tenth, ninth, eighth, seventh, sixth};
        Movie[] actual = manager.findLast();

        assertArrayEquals(expected, actual);


    }

    @Test
    public void findLast2() {
        Movie first = new Movie(1, "Bloodshot", "action movie", 150);
        Movie second = new Movie(2, "Forward", "cartoon", 200);
        Movie third = new Movie(3, "Hotel Belgrade", "comedy", 100);
        Movie forth = new Movie(4, "Gentlemen", "action movie", 300);
        Movie fifth = new Movie(5, "Invisible man", "horror", 150);
        Movie sixth = new Movie(6, "Trolls.World tour", "cartoon", 250);
        Movie seventh = new Movie(7, "Number one", "comedy", 190);
        Movie eighth = new Movie(8, "Time", "drama,fantastic", 220);
        Movie ninth = new Movie(9, "Venom 2", "fantastic, action movie", 300);
        Movie tenth = new Movie(10, "Cruella", "comedy", 250);

        PosterManager manager = new PosterManager();
        Movie[] expected = {};
        Movie[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast3() {
        Movie first = new Movie(1, "Bloodshot", "action movie", 150);
        Movie second = new Movie(2, "Forward", "cartoon", 200);
        Movie third = new Movie(3, "Hotel Belgrade", "comedy", 100);
        Movie forth = new Movie(4, "Gentlemen", "action movie", 300);
        Movie fifth = new Movie(5, "Invisible man", "horror", 150);
        Movie sixth = new Movie(6, "Trolls.World tour", "cartoon", 250);
        Movie seventh = new Movie(7, "Number one", "comedy", 190);
        Movie eighth = new Movie(8, "Time", "drama,fantastic", 220);
        Movie ninth = new Movie(9, "Venom 2", "fantastic, action movie", 300);
        Movie tenth = new Movie(10, "Cruella", "comedy", 250);
        Movie eleventh = new Movie(11, "Moana", "cartoon", 250);


        PosterManager manager = new PosterManager();

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(forth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);


        Movie[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, forth, third, second, first};
        Movie[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
}





