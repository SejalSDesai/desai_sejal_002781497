/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import static backend.EncounterHistory.encounterhis;
import java.util.ArrayList;

/**
 *
 * @author sej
 */
public class HospitalDirectory {
    public static ArrayList<Hospital>hosdirect = new ArrayList<Hospital>();
    public static ArrayList<Hospital> getHospdirect(){
        return hosdirect;
    }
    public void deleteHospitaldetails(Hospital hos){
        hosdirect.remove(hos);
    }
    
}
