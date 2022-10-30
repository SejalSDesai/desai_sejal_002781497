/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author sej
 */
public class vitalsigns extends patient {
    public String vitals;
    public float bodyTemperature;
    public float bloodPressure;
    public float oxygenLevel;
    public float heartRate;
    public float sugarlevel;
    public String symptoms;
    
    public vitalsigns(){
    }
    
    public vitalsigns(String name,int patientId ){
        this.name = name;
        this.patientId = patientId;
        
    }
   
    public vitalsigns(float bodyTemperature,float bloodPressure,float oxygenLevel,float heartRate,float sugarlevel,String symptoms){
        this.vitals = vitals;
        this. bodyTemperature = bodyTemperature;
        this.bloodPressure = bloodPressure;
        this. oxygenLevel = oxygenLevel;
        this.heartRate = heartRate;
        this.sugarlevel = sugarlevel;
        this.symptoms = symptoms;
        

    }
            

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public float getSugarlevel() {
        return sugarlevel;
    }

    public void setSugarlevel(float sugarlevel) {
        this.sugarlevel = sugarlevel;
    }

    public String getVitals() {
        return vitals;
    }

    public void setVitals(String vitals) {
        this.vitals = vitals;
    }

    public float getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(float bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public float getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(float bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public float getOxygenLevel() {
        return oxygenLevel;
    }

    public void setOxygenLevel(float oxygenLevel) {
        this.oxygenLevel = oxygenLevel;
    }

    public float getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(float heartRate) {
        this.heartRate = heartRate;
    }
    
  
    
}

