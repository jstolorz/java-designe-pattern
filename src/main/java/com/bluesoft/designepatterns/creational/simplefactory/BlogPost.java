package com.bluesoft.designepatterns.creational.simplefactory;

class BlogPost extends Post{
    private String author;
    private String[] tags;

    String getAuthor() {
        return author;
    }

    void setAuthor(final String author) {
        this.author = author;
    }

    String[] getTags() {
        return tags;
    }

    void setTags(final String[] tags) {
        this.tags = tags;
    }
}
