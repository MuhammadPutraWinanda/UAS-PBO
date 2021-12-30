/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author LEGION 5
 */
public class Employee extends User {
    private String name;
    private int division;
    private String employeeId;
    
    public Employee (String username, String encryptedPassword,String noTelp,String name,int division)
    {
        super (username, encryptedPassword, noTelp,name);
        this.name=name;
        this.division = division;
    }
    


    /**
     * @return the employeeId
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId the employeeId to set
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    
    public void getDivision(int divison){
        this.division=division;
    }
}
