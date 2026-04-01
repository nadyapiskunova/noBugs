package complex_tasks.task_4;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MovieServiceTest {
    @Test
    public void testAddRatingWithValidData(){
        MovieService<Integer> service = new MovieService<>();
        Movie movie = new Movie("Film1");

        service.addRating(movie, new Rating<>(5));
        List<Rating<Integer>> ratings = service.getRatingsForMovie(movie);


        assertEquals(1, ratings.size());
        assertEquals(5, ratings.getFirst().getRating());
    }
    @Test
    public void testAddRatingWithMinValue(){
        MovieService<Integer> service = new MovieService<>();
        Movie movie = new Movie("Film1");

        service.addRating(movie, new Rating<>(1));
        List<Rating<Integer>> ratings = service.getRatingsForMovie(movie);


        assertEquals(1, ratings.size());
        assertEquals(1, ratings.getFirst().getRating());
    }
    @Test
    public void testAddRatingWithMaxValue(){
        MovieService<Integer> service = new MovieService<>();
        Movie movie = new Movie("Film1");

        service.addRating(movie, new Rating<>(10));
        List<Rating<Integer>> ratings = service.getRatingsForMovie(movie);


        assertEquals(1, ratings.size());
        assertEquals(10, ratings.getFirst().getRating());
    }

    @Test
    public void testAddRatingLees1Value(){
        MovieService<Integer> service = new MovieService<>();
        Movie movie = new Movie("Film1");


        assertThrows(IllegalArgumentException.class, () -> {
            service.addRating(movie, new Rating<>(0));
        }, "Значение оценки меньше 1 ");
    }
    @Test
    public void testAddRatingGreater10Value(){
        MovieService<Integer> service = new MovieService<>();
        Movie movie = new Movie("Film1");


        assertThrows(IllegalArgumentException.class, () -> {
            service.addRating(movie, new Rating<>(11));
        }, "Значение оценки больше 10 ");
    }
    @Test
    public void testGetAverageMovieRatingForMovieWithOneRating(){
        MovieService<Integer> service = new MovieService<>();
        Movie movie = new Movie("Film1");
        service.addRating(movie, new Rating<>(10));

        assertEquals(10, service.getAverageMovieRating(movie));
    }
    @Test
    public void testGetAverageMovieRatingForMovieWithFewRatings(){
        MovieService<Integer> service = new MovieService<>();
        Movie movie = new Movie("Film1");
        service.addRating(movie, new Rating<>(5));
        service.addRating(movie, new Rating<>(10));
        service.addRating(movie, new Rating<>(6));

        assertEquals(7, service.getAverageMovieRating(movie));
    }
    @Test
    public void testGetAverageMovieRatingForMovieWithoutRating(){
        MovieService<Integer> service = new MovieService<>();
        Movie movie = new Movie("Film1");

        assertThrows(IllegalArgumentException.class, () ->{
            service.getAverageMovieRating(movie);
        }, "Для фильма не добавлен рейтинг");
    }
    @Test
    public void testSortedMovieByRatingWithSingleMovie(){
        MovieService<Integer> service = new MovieService<>();
        Movie movie = new Movie("Film1");
        service.addRating(movie, new Rating<>(5));
        service.addRating(movie, new Rating<>(10));
        service.addRating(movie, new Rating<>(6));

        List<Movie> sorted = service.sortedMovieByRating();
        assertEquals(movie, sorted.get(0));
    }
    @Test
    public void testSortedMovieByRatingWithFewMovies(){
        MovieService<Integer> service = new MovieService<>();
        Movie movie = new Movie("Film1");
        Movie movie1 = new Movie("Film");
        service.addRating(movie, new Rating<>(5));
        service.addRating(movie1, new Rating<>(10));

        List<Movie> sorted = service.sortedMovieByRating();
        assertEquals(movie, sorted.get(1));
        assertEquals(movie1, sorted.get(0));
    }

}
