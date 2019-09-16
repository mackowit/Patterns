package com.kodilla.testing.forum.statistic;

import java.util.List;

public class StatisticsCalculator {

    private Statistics statistics;

    private double usersQuantity = 0;
    private double postsQuantity = 0;
    private double cmtsQuantity = 0;
    private double avgPostsQuantity = 0.0;
    private double avgCmtsPerUserQuantity = 0.0;
    private double avgCmtsPerPostQuantity = 0.0;

    public StatisticsCalculator(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        //calculating number of users
        usersQuantity = statistics.usersNames().size();

        //calculating number of posts
        postsQuantity = statistics.postsCount();

        //calculating number of comments
        cmtsQuantity = statistics.commentsCount();

        //calculating average number of posts per user
        if (usersQuantity > 0) avgPostsQuantity = postsQuantity / usersQuantity;
        else avgPostsQuantity = 0;

        //calculating average number of comments per user
        if (usersQuantity > 0) avgCmtsPerUserQuantity = cmtsQuantity / usersQuantity;
        else avgCmtsPerUserQuantity = 0;

        //calculating average number of comments per post
        if (postsQuantity > 0) avgCmtsPerPostQuantity = cmtsQuantity / postsQuantity;
        else avgCmtsPerPostQuantity = 0;
    }

    public double getUsersQuantity() {
        return usersQuantity;
    }

    public double getPostsQuantity() {
        return postsQuantity;
    }

    public double getCmtsQuantity() {
        return cmtsQuantity;
    }

    public double getAvgPostsQuantity() {
        return avgPostsQuantity;
    }

    public double getAvgCmtsPerUserQuantity() {
        return avgCmtsPerUserQuantity;
    }

    public double getAvgCmtsPerPostQuantity() {
        return avgCmtsPerPostQuantity;
    }

    public void showStatistics() {
        System.out.println("FORUM STATISTICS: " +
                "Total number of users: " + usersQuantity +
                "Total number of posts: " + postsQuantity +
                "Total number of comments: " + cmtsQuantity +
                "Posts per user: " + avgPostsQuantity +
                "Comments per user: " + avgCmtsPerUserQuantity +
                "Comments per post: " + avgCmtsPerPostQuantity);
    }

}
