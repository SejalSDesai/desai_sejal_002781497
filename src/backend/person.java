/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author sej
 */
public class person {
  public String name;
  public int age;
  public long contactNo;
  public String emailId;
  public String gender;
  public int personId;
//  public String userName;
  public String pwd;
  public String repwd;
  
  public House residence = new House();
  
  
//  public House house = new House();
  
  public Hospital hospital = new Hospital();
          
  public person(){
  }
  
  public person(int personID,String name,int age,long contactNo,String emailId,String gender,int houseNo,int zip,String communityName,String newCity,String state){
        this.personId=personID;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.contactNo=contactNo;
        this.emailId= emailId;
        this.residence.houseNo=houseNo;
        this.residence.Zip=zip;
        this.residence.communityName=communityName;
        this.residence.newCity=newCity;
        this.residence.state=state;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRepwd() {
        return repwd;
    }

    public void setRepwd(String repwd) {
        this.repwd = repwd;
    }

    public House getResidence() {
        return residence;
    }

    public void setResidence(House residence) {
        this.residence = residence;
    }
    @Override
    public String toString(){
        return name;
    }
    
  }
    
    
    
    

