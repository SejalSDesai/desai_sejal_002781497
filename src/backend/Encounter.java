/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author sej
 */
public class Encounter extends vitalsigns {
    private Date encounterDate;
    private int encounterID;
    public Doctor doctor = new Doctor();
    public patient patient = new patient();
    public Encounter(){
}
    public Encounter(int encounterID,Date encounterDate,int patientId,int doctorId){
        this.encounterID = encounterID;
        this.encounterDate = encounterdate;
        this.patient.patientId = patientId;
        this.doctor.docId = doctorId;
    }

    public date getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(date encounterDate) {
        this.encounterDate = encounterDate;
    }

    public int getEncounterID() {
        return encounterID;
    }

    public void setEncounterID(int encounterID) {
        this.encounterID = encounterID;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public patient getPatient() {
        return patient;
    }

    public void setPatient(patient patient) {
        this.patient = patient;
    }
    
}
