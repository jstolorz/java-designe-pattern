package com.bluesoft.designepatterns.creational.simplefactory;

import java.time.LocalDate;

class NewsPost extends Post{
    private String headline;
    private LocalDate newsTime;

    String getHeadline() {
        return headline;
    }

    void setHeadline(final String headline) {
        this.headline = headline;
    }

    LocalDate getNewsTime() {
        return newsTime;
    }

    void setNewsTime(final LocalDate newsTime) {
        this.newsTime = newsTime;
    }
}
