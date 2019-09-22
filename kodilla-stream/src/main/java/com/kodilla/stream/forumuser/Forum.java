package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    List<ForumUser> theListOfUsers = new ArrayList<>();

    public Forum() {
        theListOfUsers.add(new ForumUser(10001, "janek2010", 'M', 2010, 9, 23,23));
        theListOfUsers.add(new ForumUser(10002, "jurek1980", 'M', 1980, 10,20, 0));
        theListOfUsers.add(new ForumUser(10006, "krysia010", 'F', 1999,1,12, 0));
        theListOfUsers.add(new ForumUser(10010, "bazinga", 'M', 2012,5,3, 3));
        theListOfUsers.add(new ForumUser(10111, "user99999", 'M', 1979,9,23, 15));
        theListOfUsers.add(new ForumUser(12401, "noname", 'M', 2000,12,23, 45));
        theListOfUsers.add(new ForumUser(10007, "janka2000", 'F', 2000,11,1, 0));
        theListOfUsers.add(new ForumUser(10021, "user0", 'F', 2004,2,25, 2));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theListOfUsers);
    }
}
