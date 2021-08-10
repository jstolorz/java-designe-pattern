package com.bluesoft.designepatterns.creational.simplefactory;

class ProductPost extends Post {
    private String imageUrl;
    private String name;

    String getImageUrl() {
        return imageUrl;
    }

    void setImageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
    }

    String getName() {
        return name;
    }

    void setName(final String name) {
        this.name = name;
    }
}
