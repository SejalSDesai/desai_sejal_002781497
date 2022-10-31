/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author sej
 */
public class patient extends person{
    
    public int patientId;
    public float patientWeight;
    public float patientHeight;
    public String bloodGroup;
//    public String patientUsername;
    public String patientpwd;
    public String patientrpwd;
    
    
//    public vitalsigns vitalsigns = new vitalsigns();
    
    public person per = new person();
//    public House residence = new House();
    
    public patient(int personID, String name, int age, long contactNo, String emailId, String gender, int houseNo, int zip, String communityName, String newCity, String state, int patientId, float patientWeight, float patientHeight, String bloodGroup, String patientpwd ,String patientrpwd){
        
        super(personID, name, age, contactNo, emailId, gender, houseNo, zip, communityName, newCity, state);
        
          this.patientId = patientId;
          this.patientWeight = patientWeight;
          this.patientHeight = patientHeight;
          this.bloodGroup = bloodGroup;
          this.patientpwd = patientpwd;
          this.patientrpwd = patientrpwd;
    }
    
    public patient(){
    }
    
    public person getPerson() {
        return per;
    }

    public void setPerson(person person) {
        this.per = person;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public float getPatientWeight() {
        return patientWeight;
    }

    public void setPatientWeight(float patientWeight) {
        this.patientWeight = patientWeight;
    }

    public float getPatientHeight() {
        return patientHeight;
    }

    public void setPatientHeight(float patientHeight) {
        this.patientHeight = patientHeight;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

//    public String getPatientUsername() {
//        return patientUsername;
//    }
//
//    public void setPatientUsername(String patientUsername) {
//        this.patientUsername = patientUsername;
//    }

    public String getPatientpwd() {
        return patientpwd;
    }

    public void setPatientpwd(String patientpwd) {
        this.patientpwd = patientpwd;
    }

    
    @Override
    public String toString(){
        return String.valueOf(name);
    }
    
}
