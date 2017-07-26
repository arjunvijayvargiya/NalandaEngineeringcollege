/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nalanda.college;

/**
 *
 * @author arvijayv
 */
public class Department {
    private int id;
    private String name;
    private String desc;

    public Department(int id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    Department(){
        
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    
}
