/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author sej
 */
public class patient {
    
    public int patientId;
    public float patientWeight;
    public float patientHeight;
    public String bloodGroup;
    public String patientUsername;
    public String patientpwd;
    public vitalsigns vitalsigns = new vitalsigns();
    
    public person per = new person();
//    public House residence = new House();
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

    public String getPatientUsername() {
        return patientUsername;
    }

    public void setPatientUsername(String patientUsername) {
        this.patientUsername = patientUsername;
    }

    public String getPatientpwd() {
        return patientpwd;
    }

    public void setPatientpwd(String patientpwd) {
        this.patientpwd = patientpwd;
    }

    public vitalsigns getVitalsigns() {
        return vitalsigns;
    }

    public void setVitalsigns(vitalsigns vitalsigns) {
        this.vitalsigns = vitalsigns;
    }
    @Override
    public String toString(){
        return per.name;
    }
    
}
