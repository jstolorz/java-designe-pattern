package com.bluesoft.designepatterns.creational.simplefactory;

class Client {

    public static void main(String[] args) {
        Post post = PostFactory.createPost("blog");
        System.out.println(post);
    }
}
