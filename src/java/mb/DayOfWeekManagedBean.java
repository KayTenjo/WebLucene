/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mb;

import javax.inject.Named;
//import javax.enterprise.context.Dependent;

/**
 *
 * @author pingeso
 */
@Named(value = "dayOfWeekManagedBean")
//@Dependent
public class DayOfWeekManagedBean {

    /**
     * Creates a new instance of DayOfWeekManagedBean
     */
    public DayOfWeekManagedBean() {
    }
    
    String days[] = new String[]{"Sunday", "Monday"};
    public String[] actionMethodWithParam(String _param){
        System.out.println(_param);
        
        return days;
    }

    public String[] getDays() {
        return days;
    }

    public void setDays(String[] days) {
        this.days = days;
    }
    
    
}
