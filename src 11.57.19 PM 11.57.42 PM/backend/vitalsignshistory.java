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
public class vitalsignshistory{
    public static ArrayList<vitalsigns>vitaldirect = new ArrayList<vitalsigns>();
    public static ArrayList<vitalsigns> getvitaldirect(){
        return vitaldirect;
         }
    public static void setvitaldirect(ArrayList<vitalsigns> vitaldirect){
        vitalsignshistory.vitaldirect = vitaldirect;
    }
}
