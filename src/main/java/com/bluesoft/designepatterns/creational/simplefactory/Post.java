package com.bluesoft.designepatterns.creational.simplefactory;

import java.time.LocalDateTime;

abstract class Post {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime publishedOn;

    Long getId() {
        return id;
    }

    void setId(final Long id) {
        this.id = id;
    }

    String getTitle() {
        return title;
    }

    void setTitle(final String title) {
        this.title = title;
    }

    String getContent() {
        return content;
    }

    void setContent(final String content) {
        this.content = content;
    }

    LocalDateTime getCreatedAt() {
        return createdAt;
    }

    void setCreatedAt(final LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    LocalDateTime getPublishedOn() {
        return publishedOn;
    }

    void setPublishedOn(final LocalDateTime publishedOn) {
        this.publishedOn = publishedOn;
    }
}
