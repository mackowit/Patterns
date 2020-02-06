package com.kodilla.patterns.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testFacebookSocialPublisher() {
        //Given
        User mark = new Millenials("Mark Sugarhill");

        //When
        String markWhereToPublish = mark.publish();
        System.out.println("Mark sais: " + markWhereToPublish);


        //Then
        Assert.assertEquals("Hey. I'm using Facebook!", markWhereToPublish);
    }

    @Test
    public void testTwitterSocialPublisher() {
        //Given
        User steven = new YGeneration("Steven Works");

        //When
        String stevenWhereToPublish = steven.publish();
        System.out.println("Steven sais: " + stevenWhereToPublish);


        //Then
        Assert.assertEquals("Only Twitter, man!", stevenWhereToPublish);
    }

    @Test
    public void testSnapchatSocialPublisher() {
        //Given
        User bill = new ZGeneration("Bill Doors");

        //When
        String billWhereToPublish = bill.publish();
        System.out.println("Bill sais: " + billWhereToPublish);


        //Then
        Assert.assertEquals("Snapchat! This is only what really matters.", billWhereToPublish);
    }

    @Test
    public void testChangeSocialPublisher() {
        //Given
        User mark = new Millenials("Mark Sugarhill");

        //When
        String markWhereToPublish = mark.publish();
        System.out.println("Mark sais: " + markWhereToPublish);
        mark.setSocialToPublish(new SnapchatPublisher());
        markWhereToPublish = mark.publish();
        System.out.println("Mark now sais: " + markWhereToPublish);

        //Then
        Assert.assertEquals("Snapchat! This is only what really matters.", markWhereToPublish);
    }
}
