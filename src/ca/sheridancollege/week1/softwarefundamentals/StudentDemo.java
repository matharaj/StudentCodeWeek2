/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 ** A class to model Student Objects
 * each student has: a name (first and last name)
 * each student can: say their name (getName)

 * @author mehta
 * @date 1/24/2019
 */
public class StudentDemo {

    private String name;
    private int ID; 
    private int MaxCourses; 

    //constructor
    public StudentDemo(String givenName)
    {
        name=givenName;
    }
    
    public int getID()
    {
        return ID; 
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
     /**
     * @return the MaxCourses
     */
    public int getMaxCourses() {
        return MaxCourses;
    }

    /**
     * @param name the name to set
     */
    public void setName(String givenName) {
        name = givenName;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @param MaxCourses the MaxCourses to set
     */
    public void setMaxCourses(int MaxCourses) {
        this.MaxCourses = MaxCourses;
    }
    
    
}
