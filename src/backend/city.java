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
public class city {
    public static String[] cityNames={"Boston","Fenway","NewJersey","Atlanta"};
    public String newCity;
    public String state;
    public static ArrayList<community> communityDirectory=new ArrayList<>();

    public static String[] getCityNames() {
        return cityNames;
    }

    public static void setCityNames(String[] cityNames) {
        city.cityNames = cityNames;
    }

    public String getNewCity() {
        return newCity;
    }

    public void setNewCity(String newCity) {
        this.newCity = newCity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public static ArrayList<community> getCommunityDirectory() {
        return communityDirectory;
    }

    public static void setCommunityDirectory(ArrayList<community> communityDirectory) {
        city.communityDirectory = communityDirectory;
    }
    
}
