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


public class City {
    public String cityName;
    public static ArrayList<community> communityList=new ArrayList<>();
     public static String state;

    public City(){
        
    }
    
    public City(String cityName, String state){
        this.cityName = cityName;
        City.state = "Massachusetts";
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    


    

    

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public static ArrayList<community> getCommunityList() {
        return communityList;
    }

    public static void setCommunityList(ArrayList<community> communityList) {
        City.communityList = communityList;
    }

    
    
    public String validateCityName(String name) {
        String isValid = "";
        if (name.equals("")) {
            isValid = "City Name cannot be empty! \n";
        } else if (name.length() < 2 || name.length() > 30) {
            isValid = "City Name must be atleast 2 characters and maximum 30 characters long! \n";
        } else if (!name.matches("[a-zA-Z ]{2,30}")) {
            isValid = "Invalid City Name Field! \n";
        }else if (name.equals("Enter here")) {
            isValid = "Invalid Name \n";
        }
        return isValid;
    }
    
    public Boolean alreadtExists(String state, String city) {
        Boolean found = false;
        for (int i = 0; i < State.citydir.size(); i++) {
            if (city.equals(State.citydir.get(i).state) && city.equals(State.citydir.get(i).cityName)) {
                found = true;
            }
        }
        return found;
    }
    
    
}
