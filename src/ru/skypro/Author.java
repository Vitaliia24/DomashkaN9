package ru.skypro;

public class Author {
    private final String nameAuthor;
    private final String surnameAuthor;

    public Author (String nameAuthor, String surnameAuthor) {
        this. nameAuthor = nameAuthor;
        this. surnameAuthor = surnameAuthor;
    }

    public String getNameAuthor () {
        return  nameAuthor;
    }

    public String getSurnameAuthor () {
        return surnameAuthor;
    }
}
