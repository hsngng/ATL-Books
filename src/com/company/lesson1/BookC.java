package com.company.lesson1;

public class BookC implements IBook {
    private String name;
    private String author;
    private Status status;


    @Override
    public void borrowBook() {
        if (this.getStatus().equals(Status.AVAILABLE)) {
            this.setStatus(Status.BORROWED);
        } else
            throw new CustomException("Book borrowed");
    }

    @Override
    public void returnBook() {
        this.setStatus(Status.AVAILABLE);
    }

    public BookC(String name, String author, Status status) {
        this.name = name;
        this.author = author;
        this.status = status;
    }

    public BookC() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BookC{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", status=" + status +
                '}';
    }
}
