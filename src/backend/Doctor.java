/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author sej
 */
public class Doctor extends person {
    public person person = new person();
    public int docId;
    public String docUsername;
    public String docQualifications;
    public String docSpecialize;
    public String docPwd;

    public person getPerson() {
        return person;
    }

    public void setPerson(person person) {
        this.person = person;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public String getDocUsername() {
        return docUsername;
    }

    public void setDocUsername(String docUsername) {
        this.docUsername = docUsername;
    }

    public String getDocQualifications() {
        return docQualifications;
    }

    public void setDocQualifications(String docQualifications) {
        this.docQualifications = docQualifications;
    }

    public String getDocSpecialize() {
        return docSpecialize;
    }

    public void setDocSpecialize(String docSpecialize) {
        this.docSpecialize = docSpecialize;
    }

    public String getDocPwd() {
        return docPwd;
    }

    public void setDocPwd(String docPwd) {
        this.docPwd = docPwd;
    }
    
    
    
}
