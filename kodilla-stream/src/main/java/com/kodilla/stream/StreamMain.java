package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
          public static void main(String[] args) {
              Forum theForumUsers = new Forum();

              Map<Integer, ForumUser> theResultMapOfForumUsers = theForumUsers.getList().stream()
                      .filter(forumUser -> forumUser.getSex() == 'M')
                      .filter(forumUser -> forumUser.getBirthDate().getYear() <= 1999)
                      .filter(forumUser -> forumUser.getNumberOfPosts() > 0)
                      .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

              System.out.println("# elements: " + theResultMapOfForumUsers.size());
              theResultMapOfForumUsers.entrySet().stream()
                      .map(entry -> entry.getKey() + ": " + entry.getValue())
                      .forEach(System.out::println);
        }

}
