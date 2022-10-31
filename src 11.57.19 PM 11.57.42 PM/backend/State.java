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
public class State {
    public static String stateName = "Massachusetts";
    public static ArrayList<City> citydir = new ArrayList<>();

    public static String getStateName() {
        return stateName;
    }

    public static void setStateName(String stateName) {
        State.stateName = stateName;
    }

    public static ArrayList<City> getCitydir() {
        return citydir;
    }

    public static void setCitydir(ArrayList<City> citydir) {
        State.citydir = citydir;
    }
    
    
    
    
}

