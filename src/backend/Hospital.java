/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author sej
 */
public class Hospital {
    public String hosName;
    public int hosLicNo;
    public int hosWard;
    public String hosAddress;
    public House residence = new House();

    public String getHosName() {
        return hosName;
    }

    public void setHosName(String hosName) {
        this.hosName = hosName;
    }

    public int getHosLicNo() {
        return hosLicNo;
    }

    public void setHosLicNo(int hosLicNo) {
        this.hosLicNo = hosLicNo;
    }

    public int getHosWard() {
        return hosWard;
    }

    public void setHosWard(int hosWard) {
        this.hosWard = hosWard;
    }

    public String getHosAddress() {
        return hosAddress;
    }

    public void setHosAddress(String hosAddress) {
        this.hosAddress = hosAddress;
    }

    public House getResidence() {
        return residence;
    }

    public void setResidence(House residence) {
        this.residence = residence;
    }
    @Override
    public String toString(){
        return String.valueOf(hosLicNo);
    }
    
    
}
