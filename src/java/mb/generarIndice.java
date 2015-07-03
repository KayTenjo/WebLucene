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
public class generarIndice implements Serializable {

    private List<Book> books;
    private String user_input;
    private List<String> list;


    //private theRealProducto tp;
    private String id;
    
    
    public generarIndice() {
       
    }
     public void submit() throws IOException, ParseException, Exception{

    //public String submit() throws IOException, ParseException{
        IndexClass index = new IndexClass();
        index.Indexer();
        
        System.out.println("Hice algo, yey");
        this.list.add("yey");
    }
    
        public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
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
