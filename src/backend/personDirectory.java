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
public class personDirectory {
 public static ArrayList<person>persondirect = new ArrayList<person>();
 public static ArrayList<person> getpersondirect(){
     return persondirect;
 }
 public static void setpersondirect(ArrayList<person> persondirect){
     personDirectory.persondirect = persondirect;
 }
 public static person person1(){
  return new person();
 }
}

 
    

