package com.kodilla.testing.forum.statistic;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {

    @Test
    public void testCalculateNumberOfUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<String>();
        /*usersList.add("maciek");
        usersList.add("jacek81");
        usersList.add("piotrek2");
        usersList.add("ania1983");
        usersList.add("krzycho33");*/
        when(statisticsMock.usersNames()).thenReturn(usersList);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        double users = statisticsCalculator.getUsersQuantity();

        //Then
        Assert.assertEquals(0.00, users, 0);

        statisticsCalculator.showStatistics();
    }

    @Test
    public void testCalculateNumberOfPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        int posts = 1000;
        when(statisticsMock.postsCount()).thenReturn(posts);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        double postsNumber = statisticsCalculator.getPostsQuantity();

        //Then
        Assert.assertEquals(1000.00, postsNumber, 0);
    }

    @Test
    public void testCalculateNumberOfComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        int comments = 0;
        when(statisticsMock.commentsCount()).thenReturn(comments);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        double cmts = statisticsCalculator.getCmtsQuantity();

        //Then
        Assert.assertEquals(0.00, cmts, 0);
    }

    @Test
    public void testCalculateAvgPostPerUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<String>();
        for(int i = 0; i<100; i++) {
            usersList.add("macko"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);

        int posts = 10;
        when(statisticsMock.postsCount()).thenReturn(posts);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        double postsPerUsers = statisticsCalculator.getAvgPostsQuantity();

        //Then
        Assert.assertEquals(0.10, postsPerUsers, 0);
    }

    @Test
    public void testCalculateAvgCmtsPerUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<String>();
        usersList.add("maciek");
        usersList.add("jacek81");
        usersList.add("piotrek2");
        usersList.add("ania1983");
        usersList.add("krzycho33");
        when(statisticsMock.usersNames()).thenReturn(usersList);

        int comments = 1000;
        when(statisticsMock.commentsCount()).thenReturn(comments);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        double cmtsPerUsers = statisticsCalculator.getAvgCmtsPerUserQuantity();

        //Then
        Assert.assertEquals(200.00, cmtsPerUsers, 0);
    }

    @Test
    public void testCalculateAvgCmtsPerPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        int posts = 10;
        when(statisticsMock.postsCount()).thenReturn(posts);

        int comments = 1000;
        when(statisticsMock.commentsCount()).thenReturn(comments);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        double cmtsPerPosts = statisticsCalculator.getAvgCmtsPerPostQuantity();

        //Then
        Assert.assertEquals(100.00, cmtsPerPosts, 0);
    }

}
