package com.kodilla.good.patterns.challenges;

import org.junit.Test;

import java.util.stream.Collectors;

public class MovieStoreTestSuite {
    @Test
    public void testDisplayMoviesMap() {
        //Given
        MovieStore testMap = new MovieStore();

        //When
        String testMapToString = testMap.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("!","",""));

        //Then
        System.out.println(testMapToString);

    }
}
