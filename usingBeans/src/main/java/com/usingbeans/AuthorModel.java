package com.usingbeans;

public class AuthorModel implements AuthorBook {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showAuthorsName(){
        System.out.println(this.name);
    }

    @Override
    public void showAuthor() {
        System.out.println(this.name);
    }
}
