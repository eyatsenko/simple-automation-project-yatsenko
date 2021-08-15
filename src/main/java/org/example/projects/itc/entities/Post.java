package org.example.projects.itc.entities;

import java.util.Objects;

public class Post {

    private String url;
    private String title;
    private String author;

    public Post (String url, String title, String author) {
        this.url = url;
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return url.equals(post.url) && title.equals(post.title) && author.equals(post.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, title, author);
    }
}
