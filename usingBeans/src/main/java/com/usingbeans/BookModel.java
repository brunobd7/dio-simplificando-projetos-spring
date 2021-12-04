package com.usingbeans;

import org.springframework.beans.factory.annotation.Autowired;

public class BookModel {

    private String description;
    private String id;

    @Autowired
    private AuthorModel authorModel;

    public AuthorModel getAuthorModel() {
        return authorModel;
    }

    public void setAuthorModel(AuthorModel authorModel) {
        this.authorModel = authorModel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void showInformations() {
        System.out.println(this.description + " - " + this.id);
        this.authorModel.showAuthor();
    }
}
