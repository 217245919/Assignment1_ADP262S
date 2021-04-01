/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment_1;

/**
 *
 * @author Lyle Haines - 217245919
 */
public class Dog {
    private String gender, colour, dogtype;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getDogtype() {
        return dogtype;
    }

    public void setDogtype(String dogtype) {
        this.dogtype = dogtype;
    }

    @Override
    public String toString() {
        return "Dog{" + "gender=" + gender + ", colour=" + colour + ", dogtype=" + dogtype + '}';
    }
    
}
