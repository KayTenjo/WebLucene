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
    private List<Album> list = new ArrayList<>();


    //private theRealProducto tp;
    private String id;
    
    
    public BookCatalog() {
       
    }
     public void submit() throws IOException, ParseException{

    //public String submit() throws IOException, ParseException{
        this.user_input = user_input;
        System.out.println(user_input);
         System.out.println(user_input);
        System.out.println("Me llamó :/");        //Función del lucho 
        ReaderClass search = new ReaderClass();
        List<Album> list_aux = search.search(user_input);
        System.out.println("Hice algo, yey");
        
        
        for(Album album: list_aux){
            
            //album.title = album.title;
            //album.artist = album.d.get("artist");
            //album.setArtist(album.getD().get("artist"));
            
            list.add(album);
        }
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