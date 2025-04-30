package com.books;

/**
 * 도서를 저장하고 관리할 수 있는 간단한 프로그램 만들어보기
 * C R U D 기능 구현이 목표
 */
public class Book {
    private String title;
    private String author;
    private int totalPage;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    public Book(String title, String author, int totalPage){
        this(title, author);
        this.totalPage = totalPage;
    }
    //getter
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getTotalPage(){
        return totalPage;
    }
    //show info
    public void showInfo(){
        System.out.println("---상태를 보여줍니다---");
        System.out.println("제목 : " + getTitle() + " 저자 : " + getAuthor() + "총 페이지 : " + getTotalPage());
    }
    //setter
    public void setAuthor(String author){
        this.author = author;
    }


}
