package net.didier.thymeleafspringboot;

public class Employee {
        private String firtsName;
    private String lastname;
    private String email;

    

    public Employee(String firtsName, String lastname, String email) {
        super();
        this.firtsName = firtsName;
        this.lastname = lastname;
        this.email = email;
    }
    public String getFirtsName() {
        return firtsName;
    }
    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }




    
    
}
