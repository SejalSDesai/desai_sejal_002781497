/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.ArrayList;

/**
 *
 * @author sej
 */
public class DoctorDirectory {
    public static ArrayList<Doctor>docdirect = new ArrayList<Doctor>();
    
    public static ArrayList<Doctor> getdocdirect(){
        return docdirect;
    }
    public static void setdocdirect(ArrayList<Doctor>docdirect){
        DoctorDirectory.docdirect = docdirect;
    }
    
}
