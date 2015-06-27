/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mb;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author pingeso
 */
@Named(value = "viewParamManagedBean")
@RequestScoped
public class viewParamManagedBean {

    /**
     * Creates a new instance of viewParamManagedBean
     */
    public viewParamManagedBean() {
    }
    
    @ManagedProperty("#{param.day}")
    String day;
    
    public String sundayButtonPressed(){
        int data = 0;
        data++;
        return "page2?faces-redirect=true&includeViewParams=true";
    }
    
}
