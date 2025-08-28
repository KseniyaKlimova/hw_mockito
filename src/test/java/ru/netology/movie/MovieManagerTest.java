package ru.netology.movie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    MovieManager manager = new MovieManager(7);

    @BeforeEach
    public void setup() {
        manager.addMovies("Movie 1");
        manager.addMovies("Movie 2");
        manager.addMovies("Movie 3");
    }

    @Test
    public void shouldFindAllMovies() {

        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesBelowDefaultQuantityOfMovies() {

        String[] expected = {"Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesForDefaultQuantityOfMovies() {

        manager.addMovies("Movie 4");
        manager.addMovies("Movie 5");

        String[] expected = {"Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesUnderDefaultQuantityOfMovies() {

        MovieManager manager = new MovieManager();

        manager.addMovies("Movie 1");
        manager.addMovies("Movie 2");
        manager.addMovies("Movie 3");
        manager.addMovies("Movie 4");
        manager.addMovies("Movie 5");
        manager.addMovies("Movie 6");
        manager.addMovies("Movie 7");

        String[] expected = {"Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
