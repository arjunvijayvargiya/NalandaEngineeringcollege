/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nalanda.college;

import java.awt.Image;
import java.util.Calendar;

/**
 *
 * @author arvijayv
 */
public class Student {
    private int id;
    private String name;
    private Calendar dob;
    private Calendar yoj;
    private String address;
    private String city;
    private long pincode;
    private String parentName;
    private String parentMailId;
    private int currentSem;
    private Image photo;
    
    Student(){
        
    }

    public Student(int id, String name, Calendar dob, Calendar yoj, String address, String city, long pincode, String parentName, String parentMailId, int currentSem, Image photo) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.yoj = yoj;
        this.address = address;
        this.city = city;
        this.pincode = pincode;
        this.parentName = parentName;
        this.parentMailId = parentMailId;
        this.currentSem = currentSem;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getDob() {
        return dob;
    }

    public void setDob(Calendar dob) {
        this.dob = dob;
    }

    public Calendar getYoj() {
        return yoj;
    }

    public void setYoj(Calendar yoj) {
        this.yoj = yoj;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPincode() {
        return pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentMailId() {
        return parentMailId;
    }

    public void setParentMailId(String parentMailId) {
        this.parentMailId = parentMailId;
    }

    public int getCurrentSem() {
        return currentSem;
    }

    public void setCurrentSem(int currentSem) {
        this.currentSem = currentSem;
    }

    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }
    
}
