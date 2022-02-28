package ru.netology.manager;

import ru.netology.domain.Movie;

public class PosterManager {

    private Movie[] items = new Movie[0];

    public void save(Movie item) {
        int length = items.length + 1;
        Movie[] tmp = new Movie[length];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Movie[] findAll() {
        int[] film = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = film.length - 1; i <= 0; i--) {


        }

        return items;
    }

    public Movie[] findLast() {
        int resultLength = items.length;
        int lastIndex = 10;
        if (resultLength > lastIndex) {
            resultLength = lastIndex;
        } else resultLength = items.length;
        Movie[] items = findAll();
        Movie[] result = new Movie[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];

        }
        return result;
    }
}


