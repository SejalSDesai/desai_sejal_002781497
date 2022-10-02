/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package back;

import java.util.ArrayList;

/**
 *
 * @author Adinath
 */
public class EmployeeData {
    
    private ArrayList<Employee> data;
    
    public EmployeeData(){
    this.data = new ArrayList<Employee>();
        
    }

    public ArrayList<Employee> getdata() {
        return data;
    }

    public void setdata(ArrayList<Employee> history) {
        this.data = history;
    }
    public Employee addnewdata(){
       Employee newdata = new Employee();
       data.add(newdata);
       return newdata;
    }
    public void deletedata(Employee ed){
        data.remove(ed);
        
    }
    
    
}
