package complex_tasks.task_4;

import java.util.*;
import java.util.stream.Collectors;

public class MovieService<T extends Number> {
    private Map<Movie, List<Rating<T>>> map = new HashMap<>();

    public synchronized void addRating(Movie movie, Rating<T> rating){
        if(rating.getRating().doubleValue() < 1 || rating.getRating().doubleValue() > 10){
            throw new IllegalArgumentException("Оценка должна быть в пределах от 1 до 10");
        }

        map.computeIfAbsent(movie, k -> new ArrayList<>()).add(rating);
    }

    public synchronized double getAverageMovieRating(Movie movie){
        List<Rating<T>> ratings = map.get(movie);
        if (ratings == null || ratings.isEmpty()){
            throw new IllegalArgumentException("Для заданного фильма нет рейтинга");
        }
        return ratings.stream()
                .mapToDouble(rating -> rating.getRating().doubleValue())
                .average()
                .orElse(0.0);
    }

    public synchronized List<Movie> sortedMovieByRating(){
        return map.keySet().stream()
                .filter(movie -> map.get(movie) != null && !map.get(movie).isEmpty())
                .sorted((m1, m2) ->
                        Double.compare(
                                getAverageMovieRating(m2),
                                getAverageMovieRating(m1)
                        )
                )
                .collect(Collectors.toList());
    }

    public synchronized List<Rating<T>> getRatingsForMovie(Movie movie) {
        return map.getOrDefault(movie, Collections.emptyList());
    }



}
