/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author sej
 */
public class EncounterHistory {
   public static ArrayList<Encounter>encounterhis = new ArrayList<Encounter>();
   public static ArrayList<Encounter> getencounterhis(){
       return encounterhis;
   }
   public static void setencounterhis(ArrayList<Encounter> encounterhis){
       EncounterHistory.encounterhis = encounterhis;
   }
   public Encounter addNewEncounter(){
       Encounter newEncounter = new Encounter();
       encounterhis.add(newEncounter);
       return newEncounter;
   }
   
   public void delencounterdetails(Encounter en){
    encounterhis.remove(en);
   }
    
    public Encounter addNewEncounter(int encId, Date encDate, LocalTime encTime,int pID, int doctorID){
        Encounter enc = new Encounter();
         encounterhis.add(enc);
        return enc;
    }
//    public Encounter addNewEncounter(int encId, Date encounterDate, LocalTime encTime, int pID, int doctorID){
//       Encounter enc = new Encounter(encId, encounterDate, encTime, pID, doctorID);
//       encounterhis.add(enc);
//       return enc;         
//         }
       
       
   }

