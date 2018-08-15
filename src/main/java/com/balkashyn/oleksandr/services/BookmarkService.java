package com.balkashyn.oleksandr.services;

import com.balkashyn.oleksandr.dao.BookmarkDao;
import com.balkashyn.oleksandr.entities.Book;
import com.balkashyn.oleksandr.entities.Bookmark;
import com.balkashyn.oleksandr.entities.Movie;
import com.balkashyn.oleksandr.entities.WebLink;

public class BookmarkService {
    private static BookmarkService instance;
    private static BookmarkDao bookmarkDao = new BookmarkDao();

    private BookmarkService() {
    }

    public static BookmarkService getInstance() {
        instance = instance == null ? new BookmarkService() : instance;
        return instance;

    }

    public Movie createMovie(long id, String title, String profileUrl, int releaseYear, String[] cast, String[]
            directors, String genre, double imdRating) {
        Movie movie = new Movie();
        movie.setId(id);
        movie.setTitle(title);
        movie.setProfileUrl(profileUrl);
        movie.setReleaseYear(releaseYear);
        movie.setCast(cast);
        movie.setDirectors(directors);
        movie.setGenre(genre);
        movie.setImdbRating(imdRating);

        return movie;
    }

    public Book createBook(long id, String title, String profileUrl, int publicationYear, String publisher, String[]
            authors, String genre, double amazonRating) {
        Book book = new Book();
        book.setId(id);
        book.setTitle(title);
        book.setProfileUrl(profileUrl);
        book.setPublicationYear(publicationYear);
        book.setPublisher(publisher);
        book.setAuthors(authors);
        book.setGenre(genre);
        book.setAmazonRating(amazonRating);

        return book;
    }

    public WebLink createWebLink(long id, String title, String profileUrl, String url, String host) {
        WebLink webLink = new WebLink();
        webLink.setId(id);
        webLink.setTitle(title);
        webLink.setProfileUrl(profileUrl);
        webLink.setUrl(url);
        webLink.setHost(host);

        return webLink;
    }

    public Bookmark[][] getBookmarks() {
        return bookmarkDao.getBookmarks();
    }
}