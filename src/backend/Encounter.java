/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
/**
 *
 * @author sej
 */
public class Encounter extends vitalsigns{
    public int encId;
    public Date encDate;
    public LocalTime encTime;
    public String encDiagnosis;
    
    public patient patient = new patient();
//    public person per = new person();
    public Doctor doc = new Doctor();
//    public vitalsigns vitalSigns = new vitalsigns();
    
//    public Encounter(){   
//   }

    public Encounter(int encId, Date encDate, LocalTime encTime, String encDiagnosis){
//        super(name, patientId);
        this.encId = encId;
        this.encDate = encDate;
        this.encTime = encTime;
        this.encDiagnosis = encDiagnosis;
//        this.name = name;
//        this.doc.name = name;
//        this.patientId = patientId;
//        this.doc.docId = docId;
     }
    
    public Encounter(int encId, int patientId, int docId, String name, String emailId, Date encDate, LocalTime encTime, float bodyTemperature, float heartRate, float sugarlevel, String symptoms, float bloodPressure, float oxygenLevel){
    super( bodyTemperature, bloodPressure, oxygenLevel, heartRate, sugarlevel, symptoms);
    this.encId = encId;
    this.encDate = encDate;
    this.encTime = encTime;
    this.patient.patientId = patientId;
    this.doc.docId = docId;
    this.bodyTemperature = bodyTemperature;
    this.heartRate = heartRate;
    this.sugarlevel = sugarlevel;
    this.bloodPressure = bloodPressure;
    this.heartRate = heartRate;
    this.symptoms = symptoms;
    this.oxygenLevel = oxygenLevel;
    
    }
//    public Encounter(){}
    
    public Encounter() {
        
    }
    
            
    public int getEncId() {
        return encId;
    }

    public void setEncId(int encId) {
        this.encId = encId;
    }

    public Date getEncDate() {
        return encDate;
    }

    public void setEncDate(Date encDate) {
        this.encDate = encDate;
    }

    public LocalTime getEncTime() {
        return encTime;
    }

    public void setEncTime(LocalTime encTime) {
        this.encTime = encTime;
    }

    public String getEncDiagnosis() {
        return encDiagnosis;
    }

    public void setEncDiagnosis(String encDiagnosis) {
        this.encDiagnosis = encDiagnosis;
    }

    public patient getPatient() {
        return patient;
    }

    public void setPatient(patient patient) {
        this.patient = patient;
    }

    public person getPer() {
        return per;
    }

    public void setPer(person per) {
        this.per = per;
    }

    public Doctor getDoc() {
        return doc;
    }

    public void setDoc(Doctor doc) {
        this.doc = doc;
    }

    
    @Override
    public String toString(){
        return String.valueOf(encId);
    }
}
   