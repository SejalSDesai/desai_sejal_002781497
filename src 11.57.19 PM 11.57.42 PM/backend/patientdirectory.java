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
public class patientdirectory {
  public static ArrayList<patient>patientdirect = new ArrayList<patient>();
  
   
  
  public static ArrayList<patient> getpatientdirect(){
      return patientdirect;
  }
  public static void setpatientdirect(ArrayList<patient> patientdirect){
      patientdirectory.patientdirect = patientdirect;
      
  }
  
  public void deletepatient(patient pt){
  patientdirect.remove(pt);
  }
  public boolean checkPID(int pID){
        int flag = 0;
        for(patient p: getpatientdirect()){
            if(p.getPatientId() == pID)
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