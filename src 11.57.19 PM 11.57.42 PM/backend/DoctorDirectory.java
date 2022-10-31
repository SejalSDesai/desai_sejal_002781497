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
    public Doctor addNewDoctor(){
        Doctor newDr = new Doctor();
        docdirect.add(newDr);
        return newDr;
    }
    public void deletedoctor(Doctor doc){
    docdirect.remove(doc);
    }
    public boolean checkDID(int dID){
        int flag = 0;
        for(Doctor d: getdocdirect()){
            if(d.getDocId()  == dID)
                flag = 1;
            else
                flag = 0;
        }
        if(flag>0)
            return true;
        else
            return false;
    } 
    
}

