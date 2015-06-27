/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
//import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author pingeso
 */
@ManagedBean
//@SessionScoped
public class BookCatalog implements Serializable {

    private List<Book> books;
    private String user_input="";
    
    public BookCatalog() {
        books = new ArrayList<Book>();
        books.add(new Book(1, "Theory of Money and Credit", "Ludwig von Mises"));
        books.add(new Book(2, "Man, Economy and State", "Murry Rothbard"));
        books.add(new Book(3, "Real Time Relationships", "Stefan Molyneux"));
        books.add(new Book(4, "titulo de ejemplo", "Autor ejemplo"));
    }
    
    public String submit(){
        this.user_input = user_input;
        System.out.println(user_input);
        //Función del lucho
        return "";
    }
    

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getUser_input() {
        return user_input;
    }

    public void setUser_input(String user_input) {
        this.user_input = user_input;
    }
    
    
    
    

}