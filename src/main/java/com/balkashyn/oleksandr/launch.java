package com.balkashyn.oleksandr;

import com.balkashyn.oleksandr.entities.Bookmark;
import com.balkashyn.oleksandr.entities.User;
import com.balkashyn.oleksandr.services.BookmarkService;
import com.balkashyn.oleksandr.services.UserService;

public class launch {

    private static User[] users;
    private static Bookmark[][] bookmarks;

    private static void loadDate() {
        System.out.println("1. Loading data ...");
        DataStore.loadData();

        users = UserService.getInstance()
                           .getUsers();
        bookmarks = BookmarkService.getInstance()
                                   .getBookmarks();

        System.out.println("Printing data ...");
        printUserData();
        printBookmarkData();
    }

    private static void printUserData() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    private static void printBookmarkData() {
        for (Bookmark[] bookmarkList : bookmarks) {
            for (Bookmark bookmark : bookmarkList) {
                System.out.println(bookmark);
            }

        }
    }

    public static void main(String[] args) {
        loadDate();
    }
}
