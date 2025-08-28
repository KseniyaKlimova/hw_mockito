package ru.netology.movie;

public class MovieManager {
    private String[] movies = new String[0];
    private final int quantityOfMovie;

    public MovieManager(int quantityOfMovie) {   // конструктор с польз. настройками кол-ва фильмов
        this.quantityOfMovie = quantityOfMovie;
    }

    public MovieManager() {    // пустой конструктор с кол-вом фильмов по умолчанию
        this.quantityOfMovie = 5;
    }

    public void addMovies(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultlenght;
        if (movies.length < quantityOfMovie) {
            resultlenght = movies.length;
        } else {
            resultlenght = quantityOfMovie;
        }
        String[] tmp = new String[resultlenght];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }

}
