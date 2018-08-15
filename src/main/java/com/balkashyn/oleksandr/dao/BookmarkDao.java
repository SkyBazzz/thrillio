package com.balkashyn.oleksandr.dao;

import com.balkashyn.oleksandr.DataStore;
import com.balkashyn.oleksandr.entities.Bookmark;

public class BookmarkDao {
    public Bookmark[][] getBookmarks(){
        return DataStore.getBookmarks();
    }
}
