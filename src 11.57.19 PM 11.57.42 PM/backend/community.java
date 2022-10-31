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
public class community extends City {
     public String communityName;
     public static ArrayList<House> houseList = new ArrayList<>();
     
     
     public community(String cityName, String state, String communityName){
        super(cityName, state);
        this.communityName = communityName;
    }
     
    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

     public community(){
     }
     
         public String validateCommunityName(String name) {
        String isValid = "";
        if (name.equals("")) {
            isValid = "Community Name cannot be empty! \n";
        } else if (name.length() < 2 || name.length() > 30) {
            isValid = "Community Name must be atleast 2 characters and maximum 30 characters long! \n";
        } else if (!name.matches("[a-zA-Z ]{2,30}")) {
            isValid = "Invalid Community Name Field! \n";
        }else if (name.equals("Enter here")) {
            isValid = "Invalid Name \n";
        }
        return isValid;
    }
    
    public Boolean alreadtExists(String city, String community) {
        Boolean found = false;
        for (int i = 0; i < City.communityList.size(); i++) {
            if (city.equals(City.communityList.get(i).cityName) && community.equals(City.communityList.get(i).communityName)) {
                found = true;
            }
        }
        return found;
    }
     
    }
    

