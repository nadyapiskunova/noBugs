package part_12.complex_tasks.task_4;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * positive test for addRating
 * 1) добавить фильм и один рейтинг -> проверить количество записей и значение рейтинга
 * угловые:
 * 1, 10
 * negative test for addRating
 * 1) добавить  оценку меньше 1 проверить исключение
 * 2) добавить  оценку больше 10 проверить исключение
 *
 * positive test for getAverageRating
 * 1) среднее для фильма с одной оценкой
 * 2) среднее для фильма с двумя оценкой
 *
 * negative test for getAverageRating
 * 1) среднее для фильма без оценки
 * 2) среднее для фильма с оценной null
 *
 * positive test for sortedMovieByRating
 * 1) сортировка двух фильмов с оценкой
 * 2)  сортировка одного фильма
 *
 * negative test for sortedMovieByRating
 * 1)сортировка фильмов без рейтинга
 *
 */
public class MovieServiceTest {
    @Test
    public void testAddRatingWithValidData(){
        MovieService<Integer> service = new MovieService<>();
        Movie movie = new Movie("Movie");
        service.addRating(movie, new Rating<>(5));

        List<Rating<Integer>> ratings = service.getRatingsForMovie(movie);

        assertEquals(1, ratings.size());
        assertEquals(5, ratings.getFirst().getRating());
    }
    @Test
    public void testAddRatingWithMinValue(){
        MovieService<Integer> service = new MovieService<>();
        Movie movie = new Movie("Movie");
        service.addRating(movie, new Rating<>(1));

        List<Rating<Integer>> ratings = service.getRatingsForMovie(movie);

        assertEquals(1, ratings.size());
        assertEquals(1, ratings.getFirst().getRating());
    }
    @Test
    public void testAddRatingWithMaxValue(){
        MovieService<Integer> service = new MovieService<>();
        Movie movie = new Movie("Movie");
        service.addRating(movie, new Rating<>(10));

        List<Rating<Integer>> ratings = service.getRatingsForMovie(movie);

        assertEquals(1, ratings.size());
        assertEquals(10, ratings.getFirst().getRating());
    }
    @Test
    public void testAddRatingWithLessMinValue(){
        MovieService<Integer> service = new MovieService<>();
        Movie movie = new Movie("Movie");

        assertThrows(IllegalArgumentException.class, () -> {
            service.addRating(movie, new Rating<>(0));
        }, "Оценка фильма меньше 1");
    }

    @Test
    public void testAddRatingWithGratedMaxValue(){
        MovieService<Integer> service = new MovieService<>();
        Movie movie = new Movie("Movie");

        assertThrows(IllegalArgumentException.class, () -> {
            service.addRating(movie, new Rating<>(11));
        }, "Оценка фильма больше 10");
    }

    @Test
    public void testGetAverageRatingForMovieWithSingleRating(){
        MovieService<Integer> service = new MovieService<>();
        Movie movie = new Movie("Movie");
        service.addRating(movie, new Rating<>(10));

        assertEquals(10, service.getAverageRating(movie));
    }
    @Test
    public void testGetAverageRatingForMovieWithFewRatings(){
        MovieService<Integer> service = new MovieService<>();
        Movie movie = new Movie("Movie");
        service.addRating(movie, new Rating<>(10));
        service.addRating(movie, new Rating<>(8));

        assertEquals(9, service.getAverageRating(movie));
    }
    @Test
    public void testGetAverageRatingForMovieWithoutRating(){
        MovieService<Integer> service = new MovieService<>();
        Movie movie = new Movie("Movie");

        assertThrows(IllegalArgumentException.class, () -> {
            service.getAverageRating(movie);
        }, "У фильма нет рейтинга");
    }
    @Test
    public void testGetAverageRatingForMovieWithRatingIsNull(){
        MovieService<Integer> service = new MovieService<>();
        Movie movie = new Movie("Movie");
        service.addRating(movie, new Rating<>(null));

        assertThrows(NullPointerException.class, () -> {
            service.getAverageRating(movie);
        }, "Рейтинг null");
    }

    @Test
    public void testSortedMovieByRatingForFewMovies(){
        MovieService<Integer> service = new MovieService<>();
        Movie movie = new Movie("Movie");
        Movie movie1 = new Movie("Movie1");
        service.addRating(movie, new Rating<>(10));
        service.addRating(movie1, new Rating<>(8));

        List<Movie> sorted = service.sortedMovieByRating();
        assertEquals(movie1, sorted.get(1));
        assertEquals(movie, sorted.get(0));
    }
    @Test
    public void testSortedMovieByRatingForSingleMovie(){
        MovieService<Integer> service = new MovieService<>();
        Movie movie = new Movie("Movie");
        service.addRating(movie, new Rating<>(10));

        List<Movie> sorted = service.sortedMovieByRating();
        assertEquals(movie, sorted.get(0));
    }
    @Test
    public void testSortedMovieByRatingForMovieWithoutRating(){
        MovieService<Integer> service = new MovieService<>();
        Movie movie = new Movie("Movie");

        assertFalse(service.sortedMovieByRating().contains(movie));
    }
}
