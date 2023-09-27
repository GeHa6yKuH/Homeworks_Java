package org.example;

import java.util.ArrayList;
import java.util.List;

public class LibraryUser {
    private int userId;
    private String userName;
    private String userEmail;
    private String userPhone;
    private ArrayList<Book> userBooksBorrowed;
    private ArrayList<Book> userBooksReserved;

    public LibraryUser(int userId, String userName, String userEmail, String userPhone, ArrayList<Book> userBooksBorrowed, ArrayList<Book> userBooksReserved) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.userBooksBorrowed = userBooksBorrowed;
        this.userBooksReserved = userBooksReserved;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public ArrayList<Book> getUserBooksBorrowed() {
        return userBooksBorrowed;
    }

    public void setUserBooksBorrowed(ArrayList<Book> userBooksBorrowed) {
        this.userBooksBorrowed = userBooksBorrowed;
    }

    public ArrayList<Book> getUserBooksReserved() {
        return userBooksReserved;
    }

    public void setUserBooksReserved(ArrayList<Book> userBooksReserved) {
        this.userBooksReserved = userBooksReserved;
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userBooksBorrowed=" + userBooksBorrowed +
                ", userBooksReserved=" + userBooksReserved +
                '}';
    }
}
