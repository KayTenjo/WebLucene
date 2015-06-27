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
//import javax.
import javax.faces.bean.ManagedBean;

import lucene.lab.*;
import java.io.IOException;
import org.apache.lucene.queryparser.classic.ParseException;
/**
 *
 * @author pingeso
 */
@ManagedBean
//@SessionScoped
public class BookCatalog implements Serializable {

    private List<Book> books;
    private String user_input;
    private List<Album> list;


    //private theRealProducto tp;
    private String id;
    
    
    public BookCatalog() {
        books = new ArrayList<Book>();
        books.add(new Book(1, "Theory of Money and Credit", "Ludwig von Mises"));
        books.add(new Book(2, "Man, Economy and State", "Murry Rothbard"));
        books.add(new Book(3, "Real Time Relationships", "Stefan Molyneux"));
        books.add(new Book(4, "titulo de ejemplo", "Autor ejemplo"));
    }
     public void submit() throws IOException, ParseException{

    //public String submit() throws IOException, ParseException{
        this.user_input = user_input;
        System.out.println(user_input);
        System.out.println("Me llamó :/");        //Función del lucho 
        //ReaderClass search = new ReaderClass();
        //list = search.search(user_input);
        System.out.println(list.get(0));
        System.out.println(list.size());
        System.out.println("Hice algo, yey");
        //return "/";
    }
    
        public List<Album> getList() {
        return list;
    }

    public void setList(List<Album> list) {
        this.list = list;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    

    
    
    
    

}